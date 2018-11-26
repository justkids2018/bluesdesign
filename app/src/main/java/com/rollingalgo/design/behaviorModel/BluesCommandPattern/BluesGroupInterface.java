package com.rollingalgo.design.behaviorModel.BluesCommandPattern;

/**
 * Created by qishoudong on 2017/6/22.
 */

public abstract class BluesGroupInterface {

    public void add() {
        System.out.println("---BluesGroupInterface----add--");
    }

    public abstract void del();

    public abstract void plan();

}
