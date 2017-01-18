package com.qf.project.zuimeiyouwu.activity;

import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.qf.chenhao.mr_chenlibrary.base.BaseActivity;
import com.qf.project.zuimeiyouwu.R;
import com.qf.project.zuimeiyouwu.util.SetTextStyle;

import butterknife.Bind;

/**
 * Created by Administrator on 2017/1/17.
 */
public class Setting extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.back)
    public ImageView back;
    @Bind(R.id.message)
    public TextView message;
    @Bind(R.id.clear)
    public TextView clear;
    @Bind(R.id.reply)
    public TextView reply;
    @Bind(R.id.haoping)
    public TextView haoping;
    @Bind(R.id.tuijian)
    public TextView tuijian;
    @Bind(R.id.us)
    public TextView us;

    @Override
    protected int getContentId() {
        return R.layout.setting_layout;
    }

    @Override
    protected void init() {
        back.setOnClickListener(this);
        //设置字体
        Typeface typeface = SetTextStyle.setFZTextStyle(this);
        message.setTypeface(typeface);
        clear.setTypeface(typeface);
        reply.setTypeface(typeface);
        haoping.setTypeface(typeface);
        tuijian.setTypeface(typeface);
        us.setTypeface(typeface);
    }

    @Override
    public void onClick(View v) {
        finish();
    }

    @Override
    protected boolean isOpenStatus() {
        return false;
    }
}
