package com.rollingalgo.design.structureModel.BluesDecoratePattern;

/**
 * Created by qishoudong on 2017/7/28.
 */

public abstract class BluesDecoratorPre implements BluesPreInterface {
    protected BluesPreInterface mBluesPreInterface;

    public BluesDecoratorPre(BluesPreInterface bluesPreInterface) {
        mBluesPreInterface = bluesPreInterface;
    }

    @Override
    public void persistentMsg(String msg) {
        mBluesPreInterface.persistentMsg(msg);
    }
}
