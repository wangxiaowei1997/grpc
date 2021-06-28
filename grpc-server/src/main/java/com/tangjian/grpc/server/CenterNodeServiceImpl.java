package com.tangjian.grpc.server;

import com.tangjian.grpc.rpc.model.HeartbeatRequest;
import com.tangjian.grpc.rpc.model.HeartbeatResponse;
import com.tangjian.grpc.rpc.model.RegisterRequest;
import com.tangjian.grpc.rpc.model.RegisterResponse;
import com.tangjian.grpc.rpc.service.CenterNodeServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;


/**
 * @author tangjian.wang@tuya.com
 * @date 2021/06/28 00:37
 */
@Slf4j
public class CenterNodeServiceImpl extends CenterNodeServiceGrpc.CenterNodeServiceImplBase {

    private static final Integer STATUS_SUCCESS = 1;
    private static final Integer STATUS_FAILURE = 2;

    /**
     * 注册
     */
    @Override
    public void register(RegisterRequest request,
                         StreamObserver<RegisterResponse> responseObserver) {

        String ip = request.getIp();
        String hostName = request.getHostname();
        log.info("服务器收到节点注册消息 ip={} hostName={}", ip, hostName);
        RegisterResponse registerResponse = RegisterResponse.newBuilder()
                .setStatus(STATUS_SUCCESS)
                .build();
        responseObserver.onNext(registerResponse);
        responseObserver.onCompleted();
    }

    /**
     * 心跳
     */
    @Override
    public void heartbeat(HeartbeatRequest request,
                          StreamObserver<HeartbeatResponse> responseObserver) {
        String ip = request.getIp();
        String hostName = request.getHostname();
        log.info("服务器收到节点心跳消息 ip={} hostName={}", ip, hostName);
        HeartbeatResponse heartbeatResponse = HeartbeatResponse.newBuilder()
                .setStatus(STATUS_SUCCESS)
                .build();
        responseObserver.onNext(heartbeatResponse);
        responseObserver.onCompleted();
    }
}
