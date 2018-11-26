package com.rollingalgo.design.creationModel.BluesFactoryPattern.Simple;

/**
 * Created by qishoudong on 2017/8/1.
 */

public class BluesMZPro implements  BluesMeiZuPhone{
    @Override
    public void create() {
        System.out.println("我是一台PRO");
    }
}
