package com.rollingalgo.design.behaviorModel.BluesResponsibilityPattern;

/**
 * Created by qishoudong on 2017/6/22.
 * 责任链模式
 */

public abstract class BluesHandler {
    private int mLevel = 0;
    private BluesHandler mNextHadnler;

    public BluesHandler(int mLevel) {
        this.mLevel = mLevel;
    }

    public final void HandlerMessage(BluesIWomen iWomen) {
        if (iWomen.getType() == mLevel) {
            response(iWomen);
        } else {
            if (mNextHadnler != null) {
                mNextHadnler.HandlerMessage(iWomen);
            } else {
                System.out.println("-----------没地方请示了，不做处理!---------\n");
            }
        }

    }

    public void setNext(BluesHandler _handler) {
        this.mNextHadnler = _handler;
    }

    public abstract void response(BluesIWomen women);

}
