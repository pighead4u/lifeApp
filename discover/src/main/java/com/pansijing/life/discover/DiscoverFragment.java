package com.pansijing.life.discover;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pansijing.life.R;
import com.pansijing.life.R2;
import com.pansijing.life.bean.DiscoverContent;
import com.pansijing.life.http.ColumnHttp;
import com.pansijing.life.http.RetrofitManager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/**
 * 创建者：pighead4u
 * 创建数据：2017/9/29
 * 创建说明：发现页面
 * <p>
 * 修改说明：
 */

public class DiscoverFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {

    private static final String TAG = "DiscoverFragment";

    @BindView(R2.id.discover_content)
    RecyclerView discoverContentView;
    @BindView(R2.id.discover_refresh)
    SwipeRefreshLayout discoverRefreshView;

    private Unbinder unbinder;
    private DiscoverAdapter mAdapter;

    /**
     * 业务需要使用的数据
     */
    private List<DiscoverContentBussiness> mData;

    private DiscoverPresenter mPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discover, container, false);
        unbinder = ButterKnife.bind(this, view);

        initView();
        initData();
        return view;
    }

    private void initView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        discoverContentView.setLayoutManager(linearLayoutManager);

        discoverRefreshView.setColorSchemeColors(Color.BLUE,
                Color.GREEN,
                Color.YELLOW,
                Color.RED);

        // 设置手指在屏幕下拉多少距离会触发下拉刷新
        discoverRefreshView.setDistanceToTriggerSync(300);
        // 设定下拉圆圈的背景
        discoverRefreshView.setProgressBackgroundColorSchemeColor(Color.WHITE);
        // 设置圆圈的大小
        discoverRefreshView.setSize(SwipeRefreshLayout.LARGE);

        discoverRefreshView.setOnRefreshListener(this);

    }

    private void initData() {
        mPresenter = new DiscoverPresenter(getActivity());

        mData = new ArrayList<>();
        mAdapter = new DiscoverAdapter(getActivity(), mData);

        discoverContentView.setAdapter(mAdapter);


        mPresenter.getAllData()
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
                        mData.clear();
                        mData.addAll(bussinesses);
                        mAdapter.notifyDataSetChanged();
                    }
                });


    }

    private void getCookies() {
        RetrofitManager.getRetrofit().create(ColumnHttp.class)
                .findNewContent(10, 0)
                .subscribeOn(Schedulers.io())
                .map(new Function<List<DiscoverContent>, List<DiscoverContentBussiness>>() {
                    @Override
                    public List<DiscoverContentBussiness> apply(List<DiscoverContent> discoverContents) throws Exception {
                        List<DiscoverContentBussiness> data = new ArrayList<>();
                        mPresenter.saveData(discoverContents);

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

                        Log.e(TAG, "accept: ");

                        mData.clear();
                        discoverRefreshView.setRefreshing(false);

                        mData.addAll(discoverContents);
                        mAdapter.notifyDataSetChanged();
                    }
                });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void onRefresh() {

        getCookies();


    }
}
