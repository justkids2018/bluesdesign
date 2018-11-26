package com.rollingalgo.design.behaviorModel.BluesStatePattern;

/**
 * Created by qishoudong on 2017/6/27.
 */

public class BluesOpenState extends BluesLiftState {
    @Override
    public void open() {
        System.out.println("电梯门开启...");
    }

    @Override
    public void close() {
        super.context.setLiftState(BluesContext.closeingState);
        context.getLiftState().close();
    }

    @Override
    public void runing() {

    }
}
