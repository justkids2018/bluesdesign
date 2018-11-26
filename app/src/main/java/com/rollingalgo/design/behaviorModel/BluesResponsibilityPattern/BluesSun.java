package com.rollingalgo.design.behaviorModel.BluesResponsibilityPattern;

/**
 * Created by qishoudong on 2017/6/22.
 */

public class BluesSun extends BluesHandler {

    public BluesSun() {
        super(3);
    }

    @Override
    public void response(BluesIWomen women) {
        System.out.println("--------母亲向儿子请示-------");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是:同意\n");
    }
}
