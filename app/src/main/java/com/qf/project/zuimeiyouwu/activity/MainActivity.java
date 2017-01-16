package com.qf.project.zuimeiyouwu.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioGroup;

import com.qf.chenhao.mr_chenlibrary.base.BaseActivity;
import com.qf.project.zuimeiyouwu.R;
import com.qf.project.zuimeiyouwu.fragment.DesignerFragment;
import com.qf.project.zuimeiyouwu.fragment.MagazineFragment;
import com.qf.project.zuimeiyouwu.fragment.YouWuFragment;

import java.text.SimpleDateFormat;

import butterknife.Bind;

public class MainActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener {
    @Bind(R.id.radio_group)
    public RadioGroup group;

    @Override
    protected int getContentId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        group.setOnCheckedChangeListener(this);
        //默认加载第一个fragment
        group.getChildAt(0).performClick();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.magazine:
                showFragment(R.id.fl,new MagazineFragment());
                break;
            case R.id.designer:
                showFragment(R.id.fl,new DesignerFragment());
            case R.id.discover:
                showFragment(R.id.fl,new YouWuFragment());

        }
    }
}
