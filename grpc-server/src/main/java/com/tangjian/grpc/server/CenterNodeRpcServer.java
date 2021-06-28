package com.tangjian.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @author tangjian.wang@tuya.com
 * @date 2021/06/28 01:01
 */
@Slf4j
public class CenterNodeRpcServer {

    private static final int DEFAULT_PORT = 52021;

    private Server server = null;

    /**
     * 启动rpc服务
     *
     * @throws IOException
     */
    public void start() throws IOException {
        // 启动一个rpc server，监听指定的端口号
        // 同时绑定好了自己开发的接口
        server = ServerBuilder
                .forPort(DEFAULT_PORT)
                .addService(new CenterNodeServiceImpl())
                .build()
                .start();

        log.info("服务器启动，监听端口号：" + DEFAULT_PORT);
        //在jvm中增加一个关闭的钩子，当jvm关闭的时候，会执行addShutdownHook添加的钩子，当系统执行完这些钩子后，jvm才会关闭
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                CenterNodeRpcServer.this.stop();
            }
        });
    }

    /**
     * 关闭rpc服务
     */
    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }


    /**
     * 线程保持一直后台运行
     *
     * @throws InterruptedException
     */
    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }


    public static void main(String[] args) throws Exception {
        log.info("服务器启动......");
        CenterNodeRpcServer centerServer = new CenterNodeRpcServer();
        centerServer.start();
        centerServer.blockUntilShutdown();
    }

}
