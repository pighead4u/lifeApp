package com.pansijing.life;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * @author: pighead
 * @time: 2017/9/16-下午11:31.
 * @desc: 初始化管理类
 */

public final class InitManager {

    public static void init(Application application) {
        asyncInit(application);

        synchInit(application);
    }

    private static void asyncInit(Application application) {

    }

    private static void synchInit(Application application) {
        FlowManager.init(application);
    }
}