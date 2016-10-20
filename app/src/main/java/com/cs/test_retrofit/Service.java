package com.cs.test_retrofit;

import com.cs.test_retrofit.entity.Tngou;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by chenshuai on 2016/10/20.
 */

public interface Service {
    @POST("/api/{category}/list")
    @FormUrlEncoded
    Call<Tngou> getNews(@Path(("category")) String category, @Field("id") int id, @Field("page") int page, @Field("rows") int rows);
}
