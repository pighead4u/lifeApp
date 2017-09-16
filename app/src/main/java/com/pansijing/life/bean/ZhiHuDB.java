package com.pansijing.life.bean;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * @author: pighead
 * @time: 2017/9/16-下午11:17.
 * @desc: 数据库
 */

@Database(name = ZhiHuDB.DB_NAME, version = ZhiHuDB.DB_VERSION)
public final class ZhiHuDB {
    public static final String DB_NAME = "zhuanlan";

    public static final int DB_VERSION = 1;
}
