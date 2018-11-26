package com.rollingalgo.design.behaviorModel.BluesVisitorPattern;

/**
 * Created by qishoudong on 2017/6/26.
 */

public class BluesCommonEmployee extends BluesBaseEmployee {
    private String job;

    @Override
    void accept(BluesIVisitor visitor) {
        visitor.visit(this);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
