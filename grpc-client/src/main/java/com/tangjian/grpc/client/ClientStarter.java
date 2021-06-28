package com.tangjian.grpc.client;

import lombok.extern.slf4j.Slf4j;



/**
 * @author tangjian.wang@tuya.com
 * @date 2021/06/28 01:38
 */
@Slf4j
public class ClientStarter {


    public static void main(String[] args) throws Exception {
        CommunicationActor communicationActor = new CommunicationActor();
        communicationActor.register();
        communicationActor.startHeartbeat();
        run();
    }

    /**
     * 客户端保持运行
     */
    private static void run() {
        try {
            while (true) {
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
