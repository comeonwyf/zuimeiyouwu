package com.qf.project.zuimeiyouwu.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.qf.chenhao.mr_chenlibrary.base.BaseFragment;
import com.qf.project.zuimeiyouwu.Entity.TabEntity;
import com.qf.project.zuimeiyouwu.R;

import butterknife.Bind;

/**
 * Created by Administrator on 2017/1/16.
 */
public class YouWuViewPagerfragment extends BaseFragment {
    @Bind(R.id.text)
    public TextView text;
    @Override
    protected int getContentId() {
        return R.layout.fragment_youwu_viewpager_layout;
    }

    /**
     * 静态工厂
     */
    public static YouWuViewPagerfragment getInstance(TabEntity entity){
        YouWuViewPagerfragment fragment = new YouWuViewPagerfragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("datas",entity);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected void loadDatas() {

    }

    @Override
    protected void getDatas(Bundle bundle) {
        TabEntity entity = (TabEntity) bundle.getSerializable("datas");
        text.setText(entity.getName());
    }
}
