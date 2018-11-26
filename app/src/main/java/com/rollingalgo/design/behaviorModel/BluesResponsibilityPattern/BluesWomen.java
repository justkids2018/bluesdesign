package com.rollingalgo.design.behaviorModel.BluesResponsibilityPattern;

/**
 * Created by qishoudong on 2017/6/22.
 */

public class BluesWomen implements BluesIWomen {
    /*
* 通过一个int类型的参数来描述妇女的个人状况
* 1---未出嫁
* 2---出嫁
* 3---夫死
*/
    public static final int WOMEN_TYPE_ONE = 1;
    public static final int WOMEN_TYPE_TWO = 2;
    public static final int WOMEN_TYPE_THR = 3;

    private int type = 0; //妇女的请示
    private String request = "";

    public BluesWomen(int type, String request) {
        this.type = type;
        this.request = request;

        switch (this.type) {
            case 1:
                this.request = "女儿的请求是:" + request;
                break;
            case 2:
                this.request = "妻子的请求是:" + request;
                break;
            case 3:
                this.request = "母亲的请求是:" + request;
                break;

        }
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public String getRequest() {
        return request;
    }
}
