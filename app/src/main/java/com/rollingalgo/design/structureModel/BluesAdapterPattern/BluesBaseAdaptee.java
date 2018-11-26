package com.rollingalgo.design.structureModel.BluesAdapterPattern;

/**
 * Created by qishoudong on 2017/7/20.
 */

/**
 * 被适配着
 */
public class BluesBaseAdaptee {
    void getUserInfo(Object obj) {
        System.out.println("adaptee--------" + obj);
    }
}
