package com.ruiqin.baselib;

import android.app.Application;

import com.ruiqin.baselibrary.util.Utils;

/**
 * @author Carl
 * @version 1.0
 * @since 2018/3/8
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Utils.init(this);
    }
}
