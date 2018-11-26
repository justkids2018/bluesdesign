package com.rollingalgo.design.behaviorModel.BluesStatePattern;

/**
 * Created by qishoudong on 2017/6/27.
 */

public class BluesCloseState extends BluesLiftState {

    @Override
    public void open() {
        super.context.setLiftState(BluesContext.openningState);
        context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭...");

    }

    @Override
    public void runing() {
        super.context.setLiftState(BluesContext.runningState); //设置为运行状态;
        super.context.getLiftState().runing();
    }
}
