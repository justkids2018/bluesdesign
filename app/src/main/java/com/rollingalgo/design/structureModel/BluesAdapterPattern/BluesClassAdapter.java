package com.rollingalgo.design.structureModel.BluesAdapterPattern;


/**
 * Created by qishoudong on 2017/7/20.
 * <p>
 * 类适配
 */

public class BluesClassAdapter extends BluesBaseAdaptee implements BluesTarget {
    @Override
    public void getUserPrivateInfo(Object obj) {
        getUserInfo(obj);
    }
}
