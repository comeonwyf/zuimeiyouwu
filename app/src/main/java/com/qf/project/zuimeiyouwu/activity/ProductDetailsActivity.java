package com.qf.project.zuimeiyouwu.activity;

import android.content.Intent;

import android.graphics.Bitmap;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.jude.rollviewpager.RollPagerView;
import com.qf.chenhao.mr_chenlibrary.base.BaseActivity;
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
   private  ProductListEntity.DataEntity.ProductsEntity productsEntity;
    private ViewPager rollPagerView;
    private TabView tabview;

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
    }

    @Override
    protected void loadDatas() {
        //获得下载产品详情实体类URL
        String url = String.format(Constant.PRODUCT_DETAILS_URL,productsEntity.getId());
        OkHttpUtils.get().url(url).build().execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {

            }
            @Override
            public void onResponse(String response, int id) {
                ProductDetailsEntity productDetailsEntity = JsonUtil.getProductDeatailsByJSON(response);
                //设置广告轮播页
                setBanner(productDetailsEntity.getData().getCover_images());
            }
        });
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
                int mHeight = (int) (((float)screenWidth/width)*height);
                ViewGroup.LayoutParams layoutParams = rollPagerView.getLayoutParams();
                layoutParams.height = mHeight;
                Log.e(TAG, "onResourceReady: "+mHeight );
                rollPagerView.setLayoutParams(layoutParams);
                RollPagerViewAdapter adapter = new RollPagerViewAdapter(cover_images);
                rollPagerView.setAdapter(adapter);
                tabview.setCount(cover_images.size());
                tabview.setViewPager(rollPagerView);
            }
        });


    }
}
