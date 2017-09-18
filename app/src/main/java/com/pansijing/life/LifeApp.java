package com.pansijing.life;

import android.app.Application;

import com.pansijing.life.utils.InitManager;

/**
 * @author: pighead
 * @time: 2017/9/16-下午9:35.
 * @desc:
 */

public final class LifeApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        InitManager.init(this);
    }
}
