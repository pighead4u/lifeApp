package com.pansijing.life.discover;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.util.Log;

import com.pansijing.life.bean.AppDatabase;
import com.pansijing.life.bean.DiscoverContent;
import com.pansijing.life.bean.DiscoverDao;
import com.pansijing.life.http.ColumnHttp;
import com.pansijing.life.http.RetrofitManager;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/**
 * 创建者： zhuhuanhuan
 * 创建时间： 2018/1/26-下午10:27
 * 说明：
 * 修改记录：
 */

public class DiscoverPresenter implements DiscoverContact.Presenter {
    DiscoverDao dao;
    DiscoverContact.View mView;

    int limit = 10;
    int offset = 0;

    public DiscoverPresenter(Context context, DiscoverContact.View view) {
        mView = view;
        dao = Room.databaseBuilder(context.getApplicationContext(),
                AppDatabase.class, "daily").build().discoverDao();
    }

    private void saveData(List<DiscoverContent> content) {
        try {
            dao.insertAll(content);

        } catch (Exception e) {
            Log.e("Discover", "saveData: ", e);
        }
    }

    private Flowable<List<DiscoverContent>> getAllData() {
        return dao.getAll();
    }


    @Override
    public void refreshData() {
        offset += limit;

        RetrofitManager.getRetrofit().create(ColumnHttp.class)
                .findNewContent(limit, offset)
                .subscribeOn(Schedulers.io())
                .map(new Function<List<DiscoverContent>, List<DiscoverContentBussiness>>() {
                    @Override
                    public List<DiscoverContentBussiness> apply(List<DiscoverContent> discoverContents) throws Exception {
                        List<DiscoverContentBussiness> data = new ArrayList<>();
                        saveData(discoverContents);

                        for (DiscoverContent item : discoverContents) {
                            DiscoverContentBussiness content = new DiscoverContentBussiness();
                            content.transforData(item);

                            data.add(content);
                        }

                        return data;
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<List<DiscoverContentBussiness>>() {
                    @Override
                    public void accept(List<DiscoverContentBussiness> discoverContents) throws Exception {

                        mView.refreshDataSuccess(discoverContents);

                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        mView.refreshDataFailed();
                    }
                });
    }

    @Override
    public void initData() {
        getAllData()
                .map(new Function<List<DiscoverContent>, List<DiscoverContentBussiness>>() {
                    @Override
                    public List<DiscoverContentBussiness> apply(List<DiscoverContent> data) throws Exception {
                        List<DiscoverContentBussiness> bussinesses = new ArrayList<>();
                        for (DiscoverContent item : data) {
                            DiscoverContentBussiness discoverContentBussiness = new DiscoverContentBussiness();
                            discoverContentBussiness.transforData(item);

                            bussinesses.add(discoverContentBussiness);
                        }
                        return bussinesses;
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<List<DiscoverContentBussiness>>() {
                    @Override
                    public void accept(List<DiscoverContentBussiness> bussinesses) throws Exception {
                        mView.initDataSuccess(bussinesses);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        mView.initDataFailed();
                    }
                });
    }
}
