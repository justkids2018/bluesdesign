package com.rollingalgo.design.structureModel.BluesDecoratePattern;

/**
 * Created by qishoudong on 2017/7/28.
 */

public class BluesDecoratorPreDBDetail extends BluesDecoratorPre {

    public BluesDecoratorPreDBDetail(BluesPreInterface bluesPreInterface) {
        super(bluesPreInterface);
    }

    @Override
    public void persistentMsg(String msg) {
        mBluesPreInterface.persistentMsg(msg);
        persistentToDB(msg);
    }

    protected void persistentToDB(String msg) {
        System.out.println("db保存数据库" + msg);
    }


}
