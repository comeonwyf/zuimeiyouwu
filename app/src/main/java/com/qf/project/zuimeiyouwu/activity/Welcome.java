package com.qf.project.zuimeiyouwu.activity;

import android.content.Intent;
import android.os.Handler;

import com.qf.chenhao.mr_chenlibrary.base.BaseActivity;
import com.qf.project.zuimeiyouwu.R;

/**
 * Created by Administrator on 2017/1/16.
 */
public class Welcome extends BaseActivity {

    private Handler handler = new Handler();

    @Override
    protected int getContentId() {
        return R.layout.welcome_layout;
    }

    @Override
    protected void init() {

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Welcome.this, MainActivity.class));
                finish();

            }
        }, 1000);
    }
}
