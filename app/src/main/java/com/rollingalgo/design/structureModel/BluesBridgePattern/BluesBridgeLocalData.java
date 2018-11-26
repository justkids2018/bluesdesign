package com.rollingalgo.design.structureModel.BluesBridgePattern;

/**
 * Created by qishoudong on 2017/7/27.
 */

public class BluesBridgeLocalData extends BluesBridgeAbstractSave {

    public BluesBridgeLocalData(BluesBridgeInterface saveInterface) {
        super(saveInterface);
    }

    @Override
    public void save(Object data) {
        if (saveInterface != null) {
            System.out.println("local-------");
            saveInterface.saveData(data);
        }
    }
}
