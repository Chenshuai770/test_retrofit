package com.cs.test_retrofit.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chenshuai on 2016/10/20.
 */

public class News {

    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;//名称
    @SerializedName("food")
    private String  food;//食物
    @SerializedName("img")
    private String img;//图片
    @SerializedName("images")
    private String images;//图片,
    @SerializedName("description")
    private String description;//描述
    @SerializedName("keywords")
    private String keywords;//关键字
    @SerializedName("message")
    private String message;//资讯内容
    @SerializedName("count")
    private int count ;//访问次数
    @SerializedName("fcount")
    private int fcount;//收藏数
    @SerializedName("rcount")
    private int rcount;//评论读数

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFcount() {
        return fcount;
    }

    public void setFcount(int fcount) {
        this.fcount = fcount;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRcount() {
        return rcount;
    }

    public void setRcount(int rcount) {
        this.rcount = rcount;
    }
}
