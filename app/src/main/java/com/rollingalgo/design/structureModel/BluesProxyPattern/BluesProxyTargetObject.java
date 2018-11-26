package com.rollingalgo.design.structureModel.BluesProxyPattern;

/**
 * Created by qishoudong on 2017/7/24.
 */

/**
 * 具体对象
 */
public class BluesProxyTargetObject implements BluesProxyAbstract {
    BluesTargetObject bluesTargetObject = new BluesTargetObject();

    @Override
    public void method1() {
        bluesTargetObject.method1();

    }

    @Override
    public int method2() {
        bluesTargetObject.method2();
        return 0;
    }

    @Override
    public void method3() {

    }
}
