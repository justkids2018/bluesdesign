package com.rollingalgo.design.structureModel.BluesBridgePattern;

/**
 * Created by qishoudong on 2017/7/27.
 */

public class BluesBridgeNetData extends BluesBridgeAbstractSave {

    public BluesBridgeNetData(BluesBridgeInterface saveInterface) {
        super(saveInterface);
    }

    @Override
    public void save(Object data) {
        if (saveInterface != null) {
            System.out.println("net-------");
            saveInterface.saveData(data);
        }
    }
}
