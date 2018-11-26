package com.rollingalgo.design.structureModel.BluesDecoratePattern;

/**
 * Created by qishoudong on 2017/7/28.
 */

public class BluesDecoratorPreNetDetail extends BluesDecoratorPre {

    public BluesDecoratorPreNetDetail(BluesPreInterface bluesPreInterface) {
        super(bluesPreInterface);
    }

    @Override
    public void persistentMsg(String msg) {
        mBluesPreInterface.persistentMsg(msg);
        persistentToNet(msg);
    }

    protected void persistentToNet(String msg) {
        System.out.println("db网络服务器" + msg);
    }


}
