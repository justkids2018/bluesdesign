package com.rollingalgo.design.behaviorModel.BluesStatePattern;

/**
 * Created by qishoudong on 2017/6/27.
 */

public class BluesRuningState extends BluesLiftState {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void runing() {
        System.out.println("电梯上下跑...");
    }
}
