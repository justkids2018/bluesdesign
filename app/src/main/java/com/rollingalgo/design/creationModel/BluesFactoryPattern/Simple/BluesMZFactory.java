package com.rollingalgo.design.creationModel.BluesFactoryPattern.Simple;

/**
 * Created by qishoudong on 2017/8/1.
 */

public class BluesMZFactory {
    public static final String PHONE_PRO = "phone_pro";
    public static final String PHONE_MAX = "phone_max";

    public BluesMeiZuPhone product(String bluesMeiZuPhoneType) {
        if (bluesMeiZuPhoneType.equals(PHONE_PRO)) {
            return new BluesMZPro();
        } else if (bluesMeiZuPhoneType.equals(PHONE_MAX)) {
            return new BluesMZMax();
        }
        return null;
    }
}
