package com.pansijing.life.discover;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pansijing.life.R;
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

public class DiscoverFragment extends Fragment {

    private static final String TAG = "DiscoverFragment";

    @BindView(R.id.discover_content)
    RecyclerView discoverContentView;

    private Unbinder unbinder;
    private DiscoverAdapter mAdapter;

    /**
     * 业务需要使用的数据
     */
    private List<DiscoverContentBussiness> mData;


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
    }

    private void initData() {
        mData = new ArrayList<>();
        mAdapter = new DiscoverAdapter(getActivity(), mData);

        discoverContentView.setAdapter(mAdapter);

        getCookies();
    }

    private void getCookies() {
        RetrofitManager.getRetrofit().create(ColumnHttp.class)
                .findNewContent(10, 0)
                .subscribeOn(Schedulers.io())
                .map(new Function<List<DiscoverContent>, List<DiscoverContentBussiness>>() {
                    @Override
                    public List<DiscoverContentBussiness> apply(List<DiscoverContent> discoverContents) throws Exception {
                        List<DiscoverContentBussiness> data = new ArrayList<>();

                        for (DiscoverContent item : discoverContents) {
                            if (item.save()) {
                                DiscoverContentBussiness content = new DiscoverContentBussiness();
                                content.transforData(item);

                                data.add(content);
                            }


                        }
                        return data;
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<List<DiscoverContentBussiness>>() {
                    @Override
                    public void accept(List<DiscoverContentBussiness> discoverContents) throws Exception {
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
}
