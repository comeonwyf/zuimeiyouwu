package com.qf.project.zuimeiyouwu;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.qf.chenhao.mr_chenlibrary.util.SharedUtil;

/**
 * Created by Administrator on 2017/1/17.
 */
public class AppContext extends Application {

    private static RequestQueue queue;

    @Override
    public void onCreate() {
        super.onCreate();
        queue = Volley.newRequestQueue(getApplicationContext());
        //声明共享参数
        SharedUtil.init(getApplicationContext());
    }

    public static RequestQueue getQueue(){
        return queue;
    }
}
