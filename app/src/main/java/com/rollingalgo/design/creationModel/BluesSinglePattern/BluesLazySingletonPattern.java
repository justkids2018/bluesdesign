package com.rollingalgo.design.creationModel.BluesSinglePattern;

/**
 * Created by qishoudong on 2017/7/18.
 * type:单例模式  //懒汉式单例模式
 */

public class BluesLazySingletonPattern {

    public BluesLazySingletonPattern() {

    }

    private static BluesLazySingletonPattern mBlueSingleton;

    public synchronized static BluesLazySingletonPattern getIntance() {
        if (mBlueSingleton == null) {
            mBlueSingleton = new BluesLazySingletonPattern();
        }
        return mBlueSingleton;
    }

}

// 饿汉模式的特点是加载类时比较慢，但运行时获取对象的速度比较快，线程安全。
// 饿汉式是线程安全的，在类创建的同时就已经创建好一个静态的对象供系统使用，以后不在改变。
// 懒汉模式的特点是加载类时比较快，但是在运行时获取对象的速度比较慢，线程不安全，
// 懒汉式如果在创建实例对象时不加上synchronized则会导致对象的访问不是线程安全的。所以在此推荐大家使用饿汉模式。
