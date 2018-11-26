package com.rollingalgo.design.behaviorModel.BluesTemplePattern;

/**
 * Created by qishoudong on 2017/6/23.
 */

public abstract class BluesUserAbstactTemple {
    abstract void beginOpenDoor();

    abstract void beginChat();

    abstract void beginGoBack();

    final void allTemple() {
        beginOpenDoor();

        beginChat();

        beginGoBack();
    }
}
