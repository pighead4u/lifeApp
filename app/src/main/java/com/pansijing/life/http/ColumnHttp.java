package com.pansijing.life.http;

import com.pansijing.life.bean.ColumnAndPerson;
import com.pansijing.life.bean.DiscoverContent;
import com.pansijing.life.bean.ZhiHuDetail;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @author: pighead
 * @time: 2017/9/16-下午9:42.
 * @desc: 专栏请求
 */

public interface ColumnHttp {

    @GET("/api/recommendations/posts")
    Observable<List<DiscoverContent>> findNewContent(@Query("limit") int limit, @Query("offset") int offset);

    @GET("/api/recommendations/columns")
    Observable<List<ColumnAndPerson>> findNewColumns(@Query("limit") int limit, @Query("offset") int offset);

    @GET("/api/posts/{url}")
    Observable<ZhiHuDetail> findDetailContent(@Path("url") String url);
}
