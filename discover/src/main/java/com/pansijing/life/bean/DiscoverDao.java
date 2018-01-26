package com.pansijing.life.bean;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import io.reactivex.Flowable;

/**
 * 创建者： zhuhuanhuan
 * 创建时间： 2018/1/26-下午10:23
 * 说明：
 * 修改记录：
 */

@Dao
public interface DiscoverDao {

    @Query("SELECT * FROM DiscoverContent")
    Flowable<List<DiscoverContent>> getAll();

    @Insert
    void insertAll(DiscoverContent... contents);
}
