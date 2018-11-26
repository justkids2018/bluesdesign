package com.rollingalgo.design.creationModel.BluesSinglePattern;

/**
 * Created by qishoudong on 2017/7/18.
 * type:饿汉单例模式  ，线程安全
 */

public class BluesSingletonPattern {

    private static final BluesSingletonPattern mBlueSingleton = new BluesSingletonPattern();

    public BluesSingletonPattern() {
    }


    public static BluesSingletonPattern getIntance() {
        return mBlueSingleton;
    }
}
