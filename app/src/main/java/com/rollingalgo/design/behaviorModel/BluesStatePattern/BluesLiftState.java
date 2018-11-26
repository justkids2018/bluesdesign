package com.rollingalgo.design.behaviorModel.BluesStatePattern;

/**
 * Created by qishoudong on 2017/6/27.
 */

public abstract class BluesLiftState {
    //定义一个环境角色，也就是封装状态的变换引起的功能变化
    protected BluesContext context;

    public void setContext(BluesContext _context) {
        this.context = _context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void runing();
}
