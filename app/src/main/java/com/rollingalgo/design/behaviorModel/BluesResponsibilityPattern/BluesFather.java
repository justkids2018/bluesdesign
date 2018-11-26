package com.rollingalgo.design.behaviorModel.BluesResponsibilityPattern;

/**
 * Created by qishoudong on 2017/6/22.
 */

public class BluesFather extends BluesHandler {

    public BluesFather() {
        super(1);
    }

    @Override
    public void response(BluesIWomen women) {
        System.out.println("--------女儿向父亲请示-------");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是:同意\n");
    }
}
