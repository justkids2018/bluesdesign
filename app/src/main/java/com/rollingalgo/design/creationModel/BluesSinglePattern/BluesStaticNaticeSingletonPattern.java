package com.rollingalgo.design.creationModel.BluesSinglePattern;

/**
 * Created by qishoudong on 2017/7/18.
 * type:静态内部类单例模式 线程安全
 */

public class BluesStaticNaticeSingletonPattern {
    private static class LazyHolder {
        private static final BluesStaticNaticeSingletonPattern INSTANCE = new BluesStaticNaticeSingletonPattern();
    }

    public BluesStaticNaticeSingletonPattern() {

    }


    public static final BluesStaticNaticeSingletonPattern getIntance() {
        return LazyHolder.INSTANCE;
    }
}
