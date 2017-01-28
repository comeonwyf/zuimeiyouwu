package com.qf.project.zuimeiyouwu.activity;

import android.app.Activity;
import android.content.Intent;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.jude.rollviewpager.RollPagerView;
import com.qf.chenhao.mr_chenlibrary.base.BaseActivity;
import com.qf.chenhao.mr_chenlibrary.util.ScreenUtil;
import com.qf.chenhao.mr_chenlibrary.widget.slidinglabel.tabview.TabView;
import com.qf.project.zuimeiyouwu.Entity.ProductDetailsEntity;
import com.qf.project.zuimeiyouwu.Entity.ProductListEntity;
import com.qf.project.zuimeiyouwu.R;
import com.qf.project.zuimeiyouwu.adapter.RollPagerViewAdapter;
import com.qf.project.zuimeiyouwu.util.Constant;
import com.qf.project.zuimeiyouwu.util.JsonUtil;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Call;

public class ProductDetailsActivity extends BaseActivity {

    private String TAG = "print";
    private ProductListEntity.DataEntity.ProductsEntity productsEntity;
    private ViewPager rollPagerView;
    private TabView tabview;
    private ListView listView;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected int getContentId() {
        return R.layout.activity_product_details;
    }

    @Override
    protected boolean isOpenStatus() {
        return false;
    }

    @Override
    protected void init() {
        Intent intent = getIntent();
        productsEntity = (ProductListEntity.DataEntity.ProductsEntity) intent.getSerializableExtra("datas");
        rollPagerView = findViewByIds(R.id.rollpagerview);
        tabview = findViewByIds(R.id.tabview);
        listView = findViewByIds(R.id.listview);
    }

    @Override
    protected void loadDatas() {
        //获得下载产品详情实体类URL
        String url = String.format(Constant.PRODUCT_DETAILS_URL, productsEntity.getId());
        OkHttpUtils.get().url(url).build().execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {

            }

            @Override
            public void onResponse(String response, int id) {
                ProductDetailsEntity productDetailsEntity = JsonUtil.getProductDeatailsByJSON(response);
                //设置广告轮播页
                setBanner(productDetailsEntity.getData().getCover_images());
                //设置产品功能数据
                setProductDesc(productDetailsEntity.getData().getDesc_types());
            }
        });
    }

    //设置产品功能数据
    private void setProductDesc(List<ProductDetailsEntity.DataEntity.DescTypesEntity> desc_types) {

        MyBaseAdapter adapter = new MyBaseAdapter(this, desc_types);
        listView.setAdapter(adapter);
        setListViewHeightBasedOnChildren(listView);
    }

    private void setListViewHeightBasedOnChildren(ListView listView) {

        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            return;
        }

        int totalHeight = 0;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            Log.e(TAG, "setListViewHeightBasedOnChildren: "+listAdapter.getCount());
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight
                + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
    }

    //设置广告轮播页
    private void setBanner(final List<String> cover_images) {
        //获得第一张图片的高度，并将高度设置给viewpager
        Glide.with(this).load(cover_images.get(0))
                .asBitmap().into(new SimpleTarget<Bitmap>() {
            @Override
            public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {
                int width = resource.getWidth();
                int height = resource.getHeight();
                int screenWidth = getResources().getDisplayMetrics().widthPixels;
                int mHeight = (int) (((float) screenWidth / width) * height);
                ViewGroup.LayoutParams layoutParams = rollPagerView.getLayoutParams();
                layoutParams.height = mHeight;
                Log.e(TAG, "onResourceReady: " + mHeight);
                rollPagerView.setLayoutParams(layoutParams);
                RollPagerViewAdapter adapter = new RollPagerViewAdapter(cover_images);
                rollPagerView.setAdapter(adapter);
                tabview.setCount(cover_images.size());
                tabview.setViewPager(rollPagerView);
            }
        });


    }
    private class MyBaseAdapter extends BaseAdapter {
        private Activity activity;
        private List<ProductDetailsEntity.DataEntity.DescTypesEntity> desc_types;

        public MyBaseAdapter(Activity activity, List<ProductDetailsEntity.DataEntity.DescTypesEntity> desc_types) {
            this.activity = activity;
            this.desc_types = desc_types;
        }

        @Override
        public int getCount() {
            return desc_types.size();
        }

        @Override
        public Object getItem(int position) {
            return desc_types.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder viewHolder;
            if (convertView == null) {
                viewHolder = new ViewHolder();
                convertView = getLayoutInflater().inflate(R.layout.item_youwu_productdetails_listview, parent,false);
                viewHolder.imageView = (ImageView) convertView.findViewById(R.id.iv);
                ViewGroup.LayoutParams layoutParams = viewHolder.imageView.getLayoutParams();
                layoutParams.height = ScreenUtil.getScreenWidth(ProductDetailsActivity.this)/18;
                layoutParams.width = layoutParams.height;
                viewHolder.imageView.setLayoutParams(layoutParams);
                viewHolder.textView = (TextView) convertView.findViewById(R.id.tv);
                convertView.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) convertView.getTag();
            }
            viewHolder.textView.setText(desc_types.get(position).getDesc());
            ImageView imageView = viewHolder.imageView;
            Glide.with(activity).load(desc_types.get(position).getImage_url())
                    .into(imageView);
            return convertView;
        }

        class ViewHolder {
            ImageView imageView;
            TextView textView;
        }
    }
}
