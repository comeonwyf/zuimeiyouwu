package com.qf.project.zuimeiyouwu.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.qf.chenhao.mr_chenlibrary.base.BaseActivity;
import com.qf.project.zuimeiyouwu.R;
import com.qf.project.zuimeiyouwu.fragment.MagazineFragment;

import butterknife.Bind;

/**
 *
 */
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
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.magazine:
                showFragment(R.id.fl,new MagazineFragment());
                break;
        }
    }
}
