package com.tangjian.grpc.server;

import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.BasicConfigurator;

/**
 * @author tangjian.wang@tuya.com
 * @date 2021/06/28 01:08
 */
@Slf4j
public class ServerStarter {


    /**
     * NameNode对外提供rpc接口的server，可以响应请求
     */
    private CenterNodeRpcServer rpcServer;


    /**
     * 初始化CenterServer
     */
    private void initialize() throws Exception {
        this.rpcServer = new CenterNodeRpcServer();
    }

    /**
     * 让NameNode运行起来
     */
    private void start() throws Exception {
        this.rpcServer.start();
        this.rpcServer.blockUntilShutdown();
    }

    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();
        log.info("服务器启动......");
        ServerStarter centerServer = new ServerStarter();
        centerServer.initialize();
        centerServer.start();
    }
}
