package com.tangjian.grpc.client;

import com.tangjian.grpc.rpc.model.HeartbeatRequest;
import com.tangjian.grpc.rpc.model.HeartbeatResponse;
import com.tangjian.grpc.rpc.model.RegisterRequest;
import com.tangjian.grpc.rpc.model.RegisterResponse;
import com.tangjian.grpc.rpc.service.CenterNodeServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.netty.shaded.io.grpc.netty.NegotiationType;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import lombok.extern.slf4j.Slf4j;

/**
 * 与服务器通信的组件
 *
 * @author tangjian.wang@tuya.com
 * @date 2021/06/28 01:22
 */
@Slf4j
public class CommunicationActor {

    private static final String CLIENT_HOSTNAME = "localhost";
    private static final Integer CLIENT_PORT = 52021;

    /**
     * 服务器存根（同步阻塞）
     */
    private CenterNodeServiceGrpc.CenterNodeServiceBlockingStub serverStub;


    public CommunicationActor() {
        ManagedChannel channel = NettyChannelBuilder
                .forAddress(CLIENT_HOSTNAME, CLIENT_PORT)
                .negotiationType(NegotiationType.PLAINTEXT)
                .build();
        this.serverStub = CenterNodeServiceGrpc.newBlockingStub(channel);
    }



    /**
     * 向服务器发起注册
     */
    public void register() throws Exception {
        Thread registerThread = new RegisterThread();
        registerThread.start();
        registerThread.join();
    }

    /**
     * 向服务器发起心跳
     */
    public void startHeartbeat() {
        new HeartbeatThread().start();
    }


    /**
     * 负责注册的线程
     */
    class RegisterThread extends Thread {

        @Override
        public void run() {
            try {
                // 发送rpc接口调用请求到server去进行注册
                log.info("发送RPC请求到server进行注册......");
                String ip = "127.0.0.1";
                String hostname = "grpc-client-01";
                // 通过RPC接口发送到server的注册接口上去
                RegisterRequest request = RegisterRequest.newBuilder()
                        .setIp(ip)
                        .setHostname(hostname)
                        .build();
                RegisterResponse response = serverStub.register(request);
                log.info("接收到server返回的注册响应={}",response.getStatus());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * 负责心跳的线程
     *
     */
    class HeartbeatThread extends Thread {

        @Override
        public void run() {
            try {
                while(true) {
                    log.info("发送RPC请求到server进行心跳.......");
                    String ip = "127.0.0.1";
                    String hostname = "grpc-client-01";
                    // 通过RPC接口发送到服务器的注册接口上去
                    HeartbeatRequest request = HeartbeatRequest.newBuilder()
                            .setIp(ip)
                            .setHostname(hostname)
                            .build();
                    HeartbeatResponse response = serverStub.heartbeat(request);
                    log.info("接收到server返回的心跳响应={}",response.getStatus());
                    // 每隔30秒发送一次心跳到服务器上去
                    Thread.sleep(30 * 1000);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


}
