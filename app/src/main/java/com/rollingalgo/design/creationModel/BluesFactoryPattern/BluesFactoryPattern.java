package com.rollingalgo.design.creationModel.BluesFactoryPattern;

import com.rollingalgo.design.creationModel.BluesFactoryPattern.Factory.BluesIFactory;
import com.rollingalgo.design.creationModel.BluesFactoryPattern.Factory.BluesProFactory;
import com.rollingalgo.design.creationModel.BluesFactoryPattern.Simple.BluesMZFactory;

/**
 * Created by qishoudong on 2017/6/19.
 * <p>
 * currentType：工厂类
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。
 * <p>
 * 何时使用：
 * 用户需要一个类的子类的实例，但不希望与该类的子类形成耦合
 * 用户需要一个类的子类的实例，但用户不知道该类有哪些子类可用
 * <p>
 * 优点：
 * 使用工厂方法可以让用户的代码和某个特定类的子类的代码解耦
 * <p>
 * <p>
 */


public class BluesFactoryPattern {

    public static void main(String args[]) {
        //simple
        BluesMZFactory simpleFactory=new BluesMZFactory();
        simpleFactory.product(BluesMZFactory.PHONE_MAX).create();
        //工厂模式
        BluesIFactory  factory;
        factory=new BluesProFactory();
        factory.product().create();

    }

}
