package com.rollingalgo.design.behaviorModel.BluesCommandPattern;

/**
 * Created by qishoudong on 2017/6/22.
 */

public class BluesUIGroup extends BluesGroupInterface {
    @Override
    public void add() {
        System.out.println("--BluesUIGroup----add---");
    }

    @Override
    public void del() {
        System.out.println("--BluesUIGroup----del---");

    }

    @Override
    public void plan() {
        System.out.println("--BluesUIGroup----plan---");

    }
}
