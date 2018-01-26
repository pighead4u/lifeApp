package com.pansijing.life.discover;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.util.Log;

import com.pansijing.life.bean.AppDatabase;
import com.pansijing.life.bean.DiscoverContent;
import com.pansijing.life.bean.DiscoverDao;

import java.util.List;

import io.reactivex.Flowable;

/**
 * 创建者： zhuhuanhuan
 * 创建时间： 2018/1/26-下午10:27
 * 说明：
 * 修改记录：
 */

public class DiscoverPresenter {
    DiscoverDao dao;

    public DiscoverPresenter(Context context) {
        dao = Room.databaseBuilder(context.getApplicationContext(),
                AppDatabase.class, "daily").build().discoverDao();
    }

    public void saveData(List<DiscoverContent> content) {
        try {
            dao.insertAll(content);

        } catch (Exception e) {
            Log.e("Discover", "saveData: ", e);
        }
    }

    public Flowable<List<DiscoverContent>> getAllData() {
        return dao.getAll();
    }


}
