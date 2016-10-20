package com.cs.test_retrofit;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.cs.test_retrofit.entity.News;
import com.cs.test_retrofit.entity.Tngou;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/*
使用textview简单请求网路数据
* */
public class MainActivity extends AppCompatActivity implements Callback<Tngou> {
    @BindView(R.id.news_listView)
    ListView newsListView;
    private NewsAdapter adapter;
    private List<News> newsList;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.tngou.net")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        NewsService newsService = retrofit.create(NewsService.class);
        Call<Tngou> call = newsService.getNews(0, 2, 30);
        call.enqueue(this);

        ListView newsListView = (ListView) findViewById(R.id.news_listView);
        adapter = new NewsAdapter(this, new ArrayList<News>());
        newsListView.setAdapter(adapter);
    }

    @Override
    public void onResponse(Call<Tngou> call, Response<Tngou> response) {
        newsList=response.body().getNewsList();
        adapter.addAll(newsList);

    }

    @Override
    public void onFailure(Call<Tngou> call, Throwable t) {
        t.printStackTrace();

    }
}
