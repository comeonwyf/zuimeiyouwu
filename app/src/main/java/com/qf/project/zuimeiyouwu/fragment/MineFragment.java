package com.qf.project.zuimeiyouwu.fragment;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.qf.chenhao.mr_chenlibrary.base.BaseFragment;
import com.qf.project.zuimeiyouwu.R;
import com.qf.project.zuimeiyouwu.activity.Setting;
import com.qf.project.zuimeiyouwu.activity.XieYiActivity;
import com.qf.project.zuimeiyouwu.util.Constant;

import butterknife.Bind;

/**
 * Created by Administrator on 2017/1/17.
 */
public class MineFragment extends BaseFragment implements View.OnClickListener {

    private static final String TAG = "print";
    @Bind(R.id.daily)
    public TextView daily;
    @Bind(R.id.attention)
    public TextView attention;
    @Bind(R.id.wish)
    public TextView wish;
    @Bind(R.id.message)
    public TextView message;
    @Bind(R.id.feedback)
    public TextView feedback;
    @Bind(R.id.zuimei)
    public TextView zuimei;
    @Bind(R.id.setting)
    public ImageView setting;
    @Bind(R.id.login)
    public ImageView login;
    @Bind(R.id.mine_portrait)
    public ImageView portrait;
    @Bind(R.id.click_daily)
    public RelativeLayout click_daily;
    @Bind(R.id.click_attention)
    public RelativeLayout click_attention;
    @Bind(R.id.click_feedback)
    public RelativeLayout click_feedback;
    @Bind(R.id.click_message)
    public RelativeLayout click_message;
    @Bind(R.id.click_wish)
    public RelativeLayout click_wish;
    @Bind(R.id.click_zuimei)
    public RelativeLayout click_zuimei;
    private AlertDialog.Builder dialog;


    @Override
    protected int getContentId() {
        return R.layout.fragment_mine_layout;
    }

    @Override
    protected void init(View view) {
        Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(), "fonts/FZLanTingHeiS_Regular.otf");
        //设置字体风格
        daily.setTypeface(typeface);
        attention.setTypeface(typeface);
        wish.setTypeface(typeface);
        message.setTypeface(typeface);
        feedback.setTypeface(typeface);
        zuimei.setTypeface(typeface);

        //点击事件
        setting.setOnClickListener(this);
        portrait.setOnClickListener(this);
        click_daily.setOnClickListener(this);
        click_attention.setOnClickListener(this);
        click_wish.setOnClickListener(this);
        click_message.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.setting:
                startActivity(new Intent(getActivity(), Setting.class));
                break;
            case R.id.mine_portrait:
            case R.id.click_daily:
            case R.id.click_attention:
            case R.id.click_wish:
            case R.id.click_message:
                customDiaolog();
                break;
            case R.id.sina:
                Toast.makeText(getActivity(), "新浪微博登录", Toast.LENGTH_SHORT).show();
                break;
            case R.id.qq:
                Toast.makeText(getActivity(), "QQ登陆", Toast.LENGTH_SHORT).show();
                break;
            case R.id.weixin:
                Toast.makeText(getActivity(), "微信登录", Toast.LENGTH_SHORT).show();
                break;
            case R.id.xieyi:
                startActivity(new Intent(getActivity(), XieYiActivity.class));
                break;
        }
    }


    //自定义登陆对话框
    private void customDiaolog() {
        dialog = new AlertDialog.Builder(getContext());
        View view = LayoutInflater.from(getContext()).inflate(R.layout.login_alertdialog_layout, null);

        TextView sina = (TextView) view.findViewById(R.id.sina);
        TextView qq = (TextView) view.findViewById(R.id.qq);
        TextView weixin = (TextView) view.findViewById(R.id.weixin);
        TextView xieyi = (TextView) view.findViewById(R.id.xieyi);

        sina.setOnClickListener(this);
        qq.setOnClickListener(this);
        weixin.setOnClickListener(this);
        xieyi.setOnClickListener(this);


        dialog.setView(view);
        dialog.show();
    }

}
