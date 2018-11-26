package com.rollingalgo.design.behaviorModel.BluesResponsibilityPattern;

/**
 * Created by qishoudong on 2017/6/22.
 */

public class BluesHusband extends BluesHandler {

    public BluesHusband() {
        super(2);
    }

    @Override
    public void response(BluesIWomen women) {
        System.out.println("--------妻子向丈夫请示-------");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是:同意\n");
    }
}
