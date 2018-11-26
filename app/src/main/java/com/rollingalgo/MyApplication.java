package com.rollingalgo;

import android.app.Application;

/**
 * Created by qishoudong on 2016/11/11.
 */

public class MyApplication extends Application {
    public static MyApplication myApplication = null;

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;
    }

    synchronized public static MyApplication getApplication() {
        return myApplication;
    }
}
