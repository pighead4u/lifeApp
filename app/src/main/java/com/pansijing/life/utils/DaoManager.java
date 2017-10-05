package com.pansijing.life.utils;

import android.app.Application;

import com.pansijing.life.bean.DaoMaster;
import com.pansijing.life.bean.DaoSession;
import com.pansijing.life.bean.DiscoverContentDao;
import com.pansijing.life.bean.ZhiHuColumnDao;

import org.greenrobot.greendao.database.Database;


/**
 * 创建者：pighead4u
 * 创建数据：2017/10/5-下午2:51.
 * 创建说明：dao的管理类
 * <p>
 * 修改说明：
 */

public final class DaoManager {

    private static DaoSession daoSession;

    public static void init(Application application) {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(application, "life-db");
        Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    public static ZhiHuColumnDao getZhiHuColumnDao() {
        return daoSession.getZhiHuColumnDao();
    }

    public static DiscoverContentDao getDiscoverContentDao() {
        return daoSession.getDiscoverContentDao();
    }
}
