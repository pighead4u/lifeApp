package com.pansijing.life.discover;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pansijing.life.R;
import com.pansijing.life.R2;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 创建者：pighead4u
 * 创建数据：2017/9/29
 * 创建说明：发现页面
 * <p>
 * 修改说明：
 */

public class DiscoverFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener,
        DiscoverContact.View {

    @BindView(R2.id.discover_content)
    RecyclerView discoverContentView;
    @BindView(R2.id.discover_refresh)
    SwipeRefreshLayout discoverRefreshView;

    private Unbinder unbinder;
    private DiscoverAdapter mAdapter;

    private DiscoverContact.Presenter mPresenter;

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
        mAdapter = new DiscoverAdapter(getActivity());
        discoverContentView.setAdapter(mAdapter);

        mPresenter = new DiscoverPresenter(getActivity(), this);
        mPresenter.initData();

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void onRefresh() {
        mPresenter.refreshData();
    }

    @Override
    public void refreshDataSuccess(List<DiscoverContentBussiness> discoverContents) {
        discoverRefreshView.setRefreshing(false);

        mAdapter.changeData(discoverContents);
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void refreshDataFailed() {
        discoverRefreshView.setRefreshing(false);
    }

    @Override
    public void initDataSuccess(List<DiscoverContentBussiness> data) {
        mAdapter.changeData(data);
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void initDataFailed() {

    }
}
