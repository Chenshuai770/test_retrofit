package com.cs.test_retrofit.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by chenshuai on 2016/10/20.
 */

public class Tngou {
    @SerializedName("status")
    private boolean status;
    @SerializedName("total")
    private long total;
    @SerializedName("tngou")
    private List<News> newsList;

    public List<News> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<News> newsList) {
        this.newsList = newsList;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}