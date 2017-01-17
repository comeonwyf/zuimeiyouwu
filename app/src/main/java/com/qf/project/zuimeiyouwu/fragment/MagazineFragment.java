package com.qf.project.zuimeiyouwu.fragment;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.appeaser.deckview.views.DeckChildView;
import com.appeaser.deckview.views.DeckView;
import com.qf.chenhao.mr_chenlibrary.base.BaseFragment;
import com.qf.project.zuimeiyouwu.AppContext;
import com.qf.project.zuimeiyouwu.Entity.Datum;
import com.qf.project.zuimeiyouwu.R;
import com.qf.project.zuimeiyouwu.util.Constant;
import com.qf.project.zuimeiyouwu.util.StringObjectRequest;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.ref.WeakReference;
import java.util.ArrayList;


/**
 * Created by Administrator on 2017/1/16.
 */
public class MagazineFragment extends BaseFragment {

    private DeckView<Datum> mDeckView;
    private ArrayList<Datum> mList;

    Drawable mDefaultHeaderIcon;
    Bitmap mdefaultThumnail;//占位符当正在下载图片
    private final String CURRENT_SCROLL = "current.scroll",CURRENT_LIST = "current.list";
    private int scrollToChildIndex = -1;
    private int imageSize = 500;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null){
            if (savedInstanceState.containsKey(CURRENT_LIST)){
                mList = savedInstanceState.getParcelableArrayList(CURRENT_LIST);
            }
            if (savedInstanceState.containsKey(CURRENT_SCROLL)){
                scrollToChildIndex = savedInstanceState.getInt(CURRENT_SCROLL);
            }
        }
    }

    @Override
    protected int getContentId() {
        return R.layout.magazine_fragment_layout;
    }

    @Override
    protected void init(View view) {
        mDeckView = findViewByIds(view,R.id.deckview);
        //图片没下载的时候的默认图片
        mdefaultThumnail = BitmapFactory.decodeResource(getResources(),R.drawable.default_thumbnail);
       //左上角图片
        mDefaultHeaderIcon = getResources().getDrawable(R.drawable.default_header_icon);

        mList = new ArrayList<>();
        downLoadData();

        DeckView.Callback<Datum> deckViewCallBack = new DeckView.Callback<Datum>() {
            @Override
            public ArrayList<Datum> getData() {
                return mList;
            }

            @Override
            public void loadViewData(WeakReference<DeckChildView<Datum>> dcv, Datum item) {
                loadViewDataInternal(item,dcv);
            }

            @Override
            public void unloadViewData(Datum item) {
                Picasso.with(getContext()).cancelRequest(item.target);
            }

            @Override
            public void onViewDismissed(Datum item) {
                mList.remove(item);
                mDeckView.notifyDataSetChanged();
            }

            @Override
            public void onItemClick(Datum item) {

            }

            @Override
            public void onNoViewsToDeck() {
                downLoadData();
            }
        };
        //添加上面的接口对象
        mDeckView.initialize(deckViewCallBack);

        if (scrollToChildIndex != -1){
            mDeckView.post(new Runnable() {
                @Override
                public void run() {
                    //恢复到滚动位置
                    mDeckView.scrollToChild(scrollToChildIndex);
                }
            });
        }
    }

    void loadViewDataInternal(final Datum item, final WeakReference<DeckChildView<Datum>> weakView) {
         Picasso.with(getContext()).cancelRequest(item.target);
        // 为item的target复制
        item.target = new Target() {
            @Override
            public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                //为空卡片复制
                if (weakView.get() != null){
                    weakView.get().onDataLoaded(item,bitmap,
                            mDefaultHeaderIcon,item.headerTitle, Color.WHITE,item.title,item.subTitle,item.avatar_url);
                }
            }

            @Override
            public void onBitmapFailed(Drawable errorDrawable) {
                if (weakView.get() != null){
                    weakView.get().onDataLoaded(item,mdefaultThumnail,mDefaultHeaderIcon,
                            item.headerTitle+"Failed",Color.WHITE,item.title,item.subTitle,item.avatar_url);
                }
            }

            @Override
            public void onPrepareLoad(Drawable placeHolderDrawable) {
                if (weakView.get() != null) {
                    weakView.get().onDataLoaded(item, mdefaultThumnail,
                            mDefaultHeaderIcon, "Loading...",  Color.WHITE,item.title,item.subTitle,item.avatar_url);
                }
            }
        };
        //开始加载图片
        Picasso.with(getContext()).load(item.link).into(item.target);

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        int currentChildIndex = mDeckView.getCurrentChildIndex();
        outState.putInt(CURRENT_SCROLL,currentChildIndex);
        outState.putParcelableArrayList(CURRENT_LIST,mList);
        super.onSaveInstanceState(outState);
    }

    private void downLoadData() {
        for (int i=1;i<=4;i++){
            StringObjectRequest request = new StringObjectRequest(Request.Method.GET, Constant.HUABAO_URL + i, new Response.Listener<String>() {
                @Override
                public void onResponse(String s) {
                    try {
                        JSONObject jb1 = new JSONObject(s);
                        JSONObject jb2 = jb1.getJSONObject("data");
                        JSONArray ja = jb2.getJSONArray("articles");
                        //初始化数据
                        for (int i = 0; i < ja.length(); i++) {
                            JSONObject jb3 = ja.getJSONObject(i);
                            Datum datum = new Datum();
                            datum.id = generateUniqueKey();
                            JSONObject jb4 = jb3.getJSONObject("author");
                            datum.headerTitle = jb4.getString("username");
                            datum.link = jb3.getString("image_url");
                            datum.title = jb3.getString("title");
                            datum.subTitle = jb3.getString("sub_title");
                            datum.avatar_url = jb4.getString("avatar_url");
                            datum.sign = jb4.getString("sign");
                            datum.num = jb3.getString("id");

                            mList.add(0, datum);
                        }
                        mDeckView.notifyDataSetChanged();
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }, new com.android.volley.Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError volleyError) {

                }
            });
            if(i==1){
                request.setPriority(Request.Priority.HIGH);
            }else {
                request.setPriority(Request.Priority.LOW);
            }
            //添加请求对象到请求队列当中
            AppContext.getQueue().add(request);
        }
    }

    private static int generateUniqueKey() {
        return ++KEY;
    }

    private static int KEY = 0;


}
