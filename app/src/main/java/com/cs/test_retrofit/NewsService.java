package com.cs.test_retrofit;

import com.cs.test_retrofit.entity.Tngou;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by chenshuai on 2016/10/20.
 */

public interface NewsService {
    @GET("/api/{category}/list")
    Call<Tngou> getNews(@Path(("category")) String category,@Query("id") int id, @Query("page") int page, @Query("rows") int rows);
}
