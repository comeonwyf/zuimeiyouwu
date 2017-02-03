package com.qf.project.zuimeiyouwu.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

import butterknife.Bind;
import okhttp3.Call;

public class ProductDetailsActivity extends BaseActivity {

    private String TAG = "print";
    private ProductListEntity.DataEntity.ProductsEntity productsEntity;
    private ViewPager rollPagerView;
    private TabView tabview;
    private TextView productName;
    public ImageView iv1;
    private TextView tv1;
    public ImageView iv2;
    private TextView tv2;
    public ImageView iv3;
    private TextView tv3;
    private WebView webView;
    private TextView productDescTV;
    private LinearLayout container_ll;

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
        productName = findViewByIds(R.id.name);
        iv1 = findViewByIds(R.id.iv1);
        tv1 = findViewByIds(R.id.tv1);
        iv2 = findViewByIds(R.id.iv2);
        tv2 = findViewByIds(R.id.tv2);
        iv3 = findViewByIds(R.id.iv3);
        tv3 = findViewByIds(R.id.tv3);
        productDescTV = findViewByIds(R.id.productDescTV);
        container_ll = findViewByIds(R.id.container_ll);
        webView = findViewByIds(R.id.webview_id);

    }

    @Override
    protected void loadDatas() {
        //获得下载产品详情实体类URL
        String url = String.format(Constant.PRODUCT_DETAILS_URL, productsEntity.getId());
        Log.e(TAG, "loadDatas: "+url);
        OkHttpUtils.get().url(url).build().execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {

            }

            @Override
            public void onResponse(String response, int id) {
                ProductDetailsEntity productDetailsEntity = JsonUtil.getProductDeatailsByJSON(response);
                //设置广告轮播页
                setBanner(productDetailsEntity.getData().getCover_images());
                //设置产品名称
                AssetManager assets = getAssets();
                Typeface fromAsset = Typeface.createFromAsset(assets, "fonts/FZLanTingHeiS_Bold.otf");
                productName.setTypeface(fromAsset);
                productName.setText(productDetailsEntity.getData().getName());

                //设置产品功能数据
                if(productDetailsEntity.getData().getDesc_types().size()!=0){
                    container_ll.setVisibility(View.VISIBLE);
                    setProductDesc(productDetailsEntity.getData().getDesc_types());
                }else {
                    productDescTV.setVisibility(View.VISIBLE);
                    productDescTV.setText(productDetailsEntity.getData().getDigest());
                }

                //设置产品材质
                setWebview(productDetailsEntity.getData().getDetail_url());
            }
        });
    }

    private void setWebview(String detail_url) {
        //返回适合手机端浏览的页面：支持JS
        webView.getSettings().setJavaScriptEnabled(true);

        //默认情况下：webView加载的页面会用默认的浏览器打开，如果需要用自己的应用打开，需要设置WebClient
        webView.setWebViewClient(new WebViewClient(){
            private ProgressDialog dialog;
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                if(dialog == null){
                    dialog =  new ProgressDialog(ProductDetailsActivity.this);
                    dialog.setTitle("正在加载数据。。。");
                    dialog.setMessage("请稍等");
                    dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                    dialog.show();
                }

            }
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (dialog.isShowing()){
                    dialog.dismiss();
                }
            }
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        webView.loadUrl(detail_url);
    }

    //设置产品功能数据
    private void setProductDesc(List<ProductDetailsEntity.DataEntity.DescTypesEntity> desc_types) {
        int width = getResources().getDisplayMetrics().widthPixels/15;
        //产品描述1
        iv1.setMaxWidth(width);
        iv1.setScaleType(ImageView.ScaleType.FIT_XY);
        Glide.with(this).load(desc_types.get(0).getImage_url()).into(iv1);
        tv1.setText(desc_types.get(0).getDesc());
        //产品描述2
        iv2.setMaxWidth(width);
        iv2.setScaleType(ImageView.ScaleType.FIT_XY);
        Glide.with(this).load(desc_types.get(1).getImage_url()).into(iv2);
        tv2.setText(desc_types.get(1).getDesc());
        //产品描述3
        iv3.setMaxWidth(width);
        iv3.setScaleType(ImageView.ScaleType.FIT_XY);
        Glide.with(this).load(desc_types.get(2).getImage_url()).into(iv3);
        tv3.setText(desc_types.get(2).getDesc());

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

}
