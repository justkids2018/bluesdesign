package com.rollingalgo.design.behaviorModel.BluesStatePattern;

/**
 * Created by qishoudong on 2017/6/27.
 */

public class BluesContext {
    //定义出所有的电梯状态
    public final static BluesOpenState openningState = new BluesOpenState();
    public final static BluesCloseState closeingState = new BluesCloseState();
    public final static BluesRuningState runningState = new BluesRuningState();
    //定一个当前电梯状态
    private BluesLiftState liftState;

    public BluesLiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(BluesLiftState liftState) {
        this.liftState = liftState;
        //把当前的环境通知到各个实现类中
        liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.runing();
    }

}
