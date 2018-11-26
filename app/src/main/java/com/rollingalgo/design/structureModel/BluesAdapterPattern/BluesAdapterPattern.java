package com.rollingalgo.design.structureModel.BluesAdapterPattern;


/**
 * Created by qishoudong on 2017/6/19.
 * <p>
 * currentType：适配器模式
 * <p>
 * type：结构型  经常使用，
 * <p>
 * 1、适配器模式
 * 2、组合模式
 * 3、代理模式
 * 4、装饰模式
 * 5、桥接模式
 * <p>
 * <p>
 * 何时使用：
 * 一个程序想使用已经存在的类，但是该类所实现的接口和当前程序所使用的接口不一致时
 * <p>
 * 优点：
 * 目标与被适配者解耦
 * 满足开-闭原则
 * <p>
 * <p>
 * 缺点：
 * <p>
 * <p>
 */


public class BluesAdapterPattern {


    public static void main(String args[]) {
//        BluesBaseAdaptee adaptee=new BluesBaseAdaptee();
//        adaptee.getUserInfo("测试");
        BluesTarget classAdapter = new BluesClassAdapter();
        classAdapter.getUserPrivateInfo("测试");
    }

}
