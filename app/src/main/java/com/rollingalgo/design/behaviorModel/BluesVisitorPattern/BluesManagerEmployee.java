package com.rollingalgo.design.behaviorModel.BluesVisitorPattern;

/**
 * Created by qishoudong on 2017/6/26.
 */

public class BluesManagerEmployee extends BluesBaseEmployee {
    //这类人物的职责非常明确:业绩
    private String performance;

    @Override
    void accept(BluesIVisitor visitor) {
        visitor.visit(this);
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }
}
