package com.rollingalgo.design.creationModel.BluesFactoryPattern.Factory;

import com.rollingalgo.design.creationModel.BluesFactoryPattern.Simple.BluesMZMax;
import com.rollingalgo.design.creationModel.BluesFactoryPattern.Simple.BluesMZPro;
import com.rollingalgo.design.creationModel.BluesFactoryPattern.Simple.BluesMeiZuPhone;

/**
 * Created by qishoudong on 2017/8/1.
 */

public class BluesMaxFactory implements BluesIFactory {
    @Override
    public BluesMeiZuPhone product() {
        return new BluesMZMax();
    }
}
