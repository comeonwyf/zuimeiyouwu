package com.qf.project.zuimeiyouwu.activity;

import android.content.Intent;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.qf.chenhao.mr_chenlibrary.base.BaseActivity;
import com.qf.project.zuimeiyouwu.AppContext;
import com.qf.project.zuimeiyouwu.Entity.HuaBaoContentEntity;
import com.qf.project.zuimeiyouwu.R;
import com.qf.project.zuimeiyouwu.util.Constant;
import com.qf.project.zuimeiyouwu.util.JsonUtil;
import com.qf.project.zuimeiyouwu.util.StringObjectRequest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import butterknife.Bind;

/**
 * Created by Administrator on 2017/1/18.
 */
public class HuaBaoContent extends BaseActivity {

    @Bind(R.id.title)
    public TextView title;
    @Bind(R.id.subTitle)
    public TextView subTitle;
    @Bind(R.id.imageview)
    public ImageView imageView;
    @Bind(R.id.author_image)
    public ImageView author_image;
    @Bind(R.id.author)
    public TextView author;
    @Bind(R.id.sign)
    public TextView sign;
    @Bind(R.id.web_content)
    public WebView webView;

    private static final String TAG = "print";
    private String url;
    private HuaBaoContentEntity huaBaoContent;

    @Override
    protected int getContentId() {
        return R.layout.huabaocontent_layout;
    }

    @Override
    protected void init() {
        Intent intent = getIntent();
        String id =  intent.getStringExtra("id");
        url = Constant.HUABAO_CONTENT_URL+id;
    }

    @Override
    protected void loadDatas() {
        StringObjectRequest request = new StringObjectRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Log.i(TAG, "onResponse: ---------->"+s);
                huaBaoContent = JsonUtil.getHuaBaoContentByJSON(s);
                title.setText(huaBaoContent.getData().getTitle());
                subTitle.setText(huaBaoContent.getData().getSub_title());
                Glide.with(getApplicationContext()).load(huaBaoContent.getData().getImage_url())
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .thumbnail(0.1f)
                        .crossFade()
                        .into(imageView);

                Glide.with(getApplicationContext()).load(huaBaoContent.getData().getAuthor().getAvatar_url())
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .thumbnail(0.1f)
                        .crossFade()
                        .into(author_image);

                author.setText(huaBaoContent.getData().getAuthor().getUsername());
                sign.setText(huaBaoContent.getData().getAuthor().getSign());
                //设置详情webview展示
                webView.loadDataWithBaseURL("about:blank",getNewContent(huaBaoContent.getData().getContent()),"text/html","utf-8","");


            }
        },new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        });
        AppContext.getQueue().add(request);
    }

    /**
     *装换url
     * @param htmlText
     * @return
     */
    private String getNewContent(String htmlText) {
        Document doc = Jsoup.parse(htmlText);
        Elements img = doc.getElementsByTag("img");
        for (Element element :img){
            element.attr("width","100%").attr("height","auto");
        }
        return doc.toString();
    }

    @Override
    protected boolean isOpenStatus() {
        return false;
    }
}
