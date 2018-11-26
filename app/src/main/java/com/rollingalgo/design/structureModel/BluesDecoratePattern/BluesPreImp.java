package com.rollingalgo.design.structureModel.BluesDecoratePattern;

/**
 * Created by qishoudong on 2017/7/28.
 */

public class BluesPreImp implements BluesPreInterface {

    @Override
    public void persistentMsg(String msg) {
        System.out.println("保存文件" + msg);
    }
}
