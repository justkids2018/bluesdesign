package com.rollingalgo.design.structureModel.BluesProxyPattern;

/**
 * Created by qishoudong on 2017/7/24.
 */

/**
 * 具体对象
 */
public class BluesTargetObject implements BluesProxyAbstract {

    @Override
    public void method1() {
        System.out.println("具体对象的方法1");

    }

    @Override
    public int method2() {
        System.out.println("具体对象的方法2");
        return 0;
    }

    @Override
    public void method3() {

    }
}
