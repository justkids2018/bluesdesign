package com.rollingalgo.design.behaviorModel.BluesObserverPattern;

/**
 * Created by qishoudong on 2017/6/23.
 * 观察者 接口
 */

public class BluesZiLinObserver implements BluesObserver {

    @Override
    public void update(String info) {
        System.out.println("鹿子霖:观察到小娥活动...");
        this.think(info);
        System.out.println("鹿子霖:真被乐死了\n");
    }


    public void think(String info) {
        System.out.println("鹿子霖,因为:" + info);
    }

}
