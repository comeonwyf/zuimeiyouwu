package com.qf.project.zuimeiyouwu.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
    @Bind(R.id.text)
    public TextView text;
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

        clear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back:
                finish();
                break;
            case R.id.clear:
                AlertDialog.Builder dialog = new AlertDialog.Builder(this);
                dialog.setTitle("确定清楚缓存吗？")
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                text.setText("0.0MB");
                                dialog.dismiss();
                            }
                        });
                dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                dialog.show();

                break;
        }
    }

    @Override
    protected boolean isOpenStatus() {
        return false;
    }
}
