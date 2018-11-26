package com.rollingalgo.design.behaviorModel.BluesObserverPattern;

/**
 * Created by qishoudong on 2017/6/23.
 * 观察者 接口
 */

public class BluesXiaoWenObserver implements BluesObserver {

    @Override
    public void update(String info) {
        System.out.println("白孝文:观察到小娥活动...");
        this.think(info);
        System.out.println("白孝文:纠结了....");
    }


    public void think(String info) {
        System.out.println("白孝文，因为:"+info);
    }

}
