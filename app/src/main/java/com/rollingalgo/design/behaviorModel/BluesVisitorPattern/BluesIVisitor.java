package com.rollingalgo.design.behaviorModel.BluesVisitorPattern;

/**
 * Created by qishoudong on 2017/6/26.
 */

public interface BluesIVisitor {
    public void visit(BluesCommonEmployee commonEmployee);

    public void visit(BluesManagerEmployee managerEmployee);
}
