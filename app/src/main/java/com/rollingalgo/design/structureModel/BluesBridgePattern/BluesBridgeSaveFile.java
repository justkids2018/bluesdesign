package com.rollingalgo.design.structureModel.BluesBridgePattern;

/**
 * Created by qishoudong on 2017/7/27.
 */

public class BluesBridgeSaveFile implements BluesBridgeInterface {

    @Override
    public void saveData(Object obj) {
        System.out.println("保存file"+obj);
    }
}
