package com.rollingalgo.design.structureModel.BluesBridgePattern;

/**
 * Created by qishoudong on 2017/7/27.
 */

public abstract class BluesBridgeAbstractSave {
    BluesBridgeInterface saveInterface;

    public BluesBridgeAbstractSave(BluesBridgeInterface saveInterface) {
        this.saveInterface = saveInterface;
    }

    public abstract void save(Object data);
}
