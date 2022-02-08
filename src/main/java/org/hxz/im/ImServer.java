package org.hxz.im;

import org.hxz.service.frameworks.rpc.server.BaseRpcServer;

/**
 * Created by hxz on 2021/11/1 15:02.
 */

public class ImServer extends BaseRpcServer {

    public static void main(String[] args) {
        ImServer rpcServer = new ImServer();
        rpcServer.start();
    }

    @Override
    protected String initApiPackage() {
        return "org.hxz.im.api";
    }
}
