package com.pansijing.life.bean;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * 创建者： zhuhuanhuan
 * 创建时间： 2018/1/26-下午10:25
 * 说明：
 * 修改记录：
 */
@Database(entities = {DiscoverContent.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract DiscoverDao discoverDao();
}
