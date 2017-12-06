package com.pansijing.life.discover;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.webkit.WebView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.pansijing.life.R;
import com.pansijing.life.R2;
import com.pansijing.life.bean.ZhiHuDetail;
import com.pansijing.life.http.ColumnHttp;
import com.pansijing.life.http.RetrofitManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class DetailActivity extends AppCompatActivity {

    private static final String TAG = "DetailActivity";

    @BindView(R2.id.backdrop)
    SimpleDraweeView titleImage;
    @BindView(R2.id.toolbar)
    Toolbar toolbar;
    @BindView(R2.id.collapsing_toolbar)
    CollapsingToolbarLayout collapsingToolbar;
    @BindView(R2.id.appbar)
    AppBarLayout appbar;
    @BindView(R2.id.main_content)
    CoordinatorLayout mainContent;
    @BindView(R2.id.detail_content)
    WebView detailContent;
    @BindView(R2.id.btn_avatar)
    FloatingActionButton btnAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

        initView();
        initData();

    }

    private void initView() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void initData() {
        String path = getIntent().getStringExtra("path");
        RetrofitManager.getRetrofit().create(ColumnHttp.class)
                .findDetailContent(path)
                .map(new Function<ZhiHuDetail, ZhiHuDetailBussiness>() {
                    @Override
                    public ZhiHuDetailBussiness apply(ZhiHuDetail zhiHuDetail) throws Exception {
                        ZhiHuDetailBussiness zhiHuDetailBussiness = new ZhiHuDetailBussiness();
                        zhiHuDetailBussiness.transforData(zhiHuDetail);
                        return zhiHuDetailBussiness;
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ZhiHuDetailBussiness>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ZhiHuDetailBussiness zhiHuDetailBussiness) {
                        refreshData(zhiHuDetailBussiness);

                        Log.e(TAG, "onNext: ");

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, "onError: ", e);

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private void refreshData(ZhiHuDetailBussiness detail) {
        collapsingToolbar.setTitle(detail.getTitle());
        titleImage.setImageURI(detail.getTitleImagePath());
        detailContent.loadData(detail.getUrl(), "text/html; charset=UTF-8", null);

    }

    @Override
    public void onBackPressed() {
        finish();
    }

}
