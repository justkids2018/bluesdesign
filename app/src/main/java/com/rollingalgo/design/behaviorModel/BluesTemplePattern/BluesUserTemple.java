package com.rollingalgo.design.behaviorModel.BluesTemplePattern;

/**
 * Created by qishoudong on 2017/6/23.
 */

public  class BluesUserTemple extends BluesUserAbstactTemple {

    @Override
    void beginOpenDoor() {
        System.out.println("-------beginOpenDoor---------");
    }

    @Override
    void beginChat() {
        System.out.println("---------beginChat-------");

    }

    @Override
    void beginGoBack() {
        System.out.println("----------beginGoBack------");

    }
}
