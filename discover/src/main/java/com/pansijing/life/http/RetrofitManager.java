package com.pansijing.life.http;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author: pighead
 * @time: 2017/9/16-下午10:10.
 * @desc: retrofit的管理类
 */

public final class RetrofitManager {

    private static final String ZHI_HU_HOST = "https://zhuanlan.zhihu.com";
    private static Retrofit sRetrofit;

    public static Retrofit getRetrofit() {
        if (sRetrofit == null) {
            synchronized (RetrofitManager.class) {
                sRetrofit = buildRetrofit();
            }
        }

        return sRetrofit;
    }

    private static Retrofit buildRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(ZHI_HU_HOST)
                .client(buildOKHttpClient())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    private static OkHttpClient buildOKHttpClient() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.HEADERS);

        return new OkHttpClient.Builder()
                .addInterceptor(logging)
                .cookieJar(new SimpleCookie())
                .build();
    }
}
