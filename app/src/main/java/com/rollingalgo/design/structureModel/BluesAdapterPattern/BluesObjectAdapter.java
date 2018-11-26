package com.rollingalgo.design.structureModel.BluesAdapterPattern;


/**
 * Created by qishoudong on 2017/7/20.
 * <p>
 * 类适配
 */

public class BluesObjectAdapter implements BluesTarget {
    private BluesBaseAdaptee adaptee;

    public BluesObjectAdapter() {
        adaptee = new BluesBaseAdaptee();
    }

    @Override
    public void getUserPrivateInfo(Object obj) {
        adaptee.getUserInfo(obj);
    }
}
