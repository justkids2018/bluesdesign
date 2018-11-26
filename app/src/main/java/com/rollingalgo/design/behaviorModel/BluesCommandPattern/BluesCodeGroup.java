package com.rollingalgo.design.behaviorModel.BluesCommandPattern;

/**
 * Created by qishoudong on 2017/6/22.
 */

public class BluesCodeGroup extends BluesGroupInterface {
    @Override
    public void add() {
        System.out.println("--BluesCodeGroup----add---");

    }

    @Override
    public void del() {
        System.out.println("--BluesCodeGroup----del---");
    }

    @Override
    public void plan() {
        System.out.println("--BluesCodeGroup----plan---");

    }
}
