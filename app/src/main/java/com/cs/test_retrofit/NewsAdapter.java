package com.cs.test_retrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cs.test_retrofit.entity.News;
import com.squareup.picasso.Picasso;

import java.util.Collection;
import java.util.List;

/**
 * 新闻列表适配器
 */
public class NewsAdapter extends BaseAdapter {

    private Context mContext;
    private List<News> mNewsList;

    public NewsAdapter(Context context, List<News> newsList){
        mContext = context;
        mNewsList = newsList;
    }

    @Override
    public int getCount() {
        return mNewsList.size();
    }

    @Override
    public Object getItem(int position) {
        return mNewsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if(convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_list,null);
            viewHolder = new ViewHolder();
            viewHolder.newsImageView = (ImageView) convertView.findViewById(R.id.news_imageView);
            viewHolder.newsTitleTextView = (TextView) convertView.findViewById(R.id.news_title_textView);
            viewHolder.newsDescriptionTextView = (TextView) convertView.findViewById(R.id.news_description_textView);
            convertView.setTag(viewHolder);
        }

        viewHolder = (ViewHolder) convertView.getTag();
        Picasso.with(mContext).load("http://tnfs.tngou.net/image"+mNewsList.get(position).getImg()).into(viewHolder.newsImageView);
        viewHolder.newsTitleTextView.setText(mNewsList.get(position).getName());
        viewHolder.newsDescriptionTextView.setText(mNewsList.get(position).getDescription());
        return convertView;
    }

    public final class ViewHolder{
        public ImageView newsImageView;
        public TextView newsTitleTextView;
        public TextView newsDescriptionTextView;
    }

    public void addAll(Collection<? extends News> collection){
        mNewsList.addAll(collection);
        notifyDataSetChanged();
    }

}