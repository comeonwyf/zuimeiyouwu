package com.qf.project.zuimeiyouwu.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.qf.project.zuimeiyouwu.Entity.TabEntity;
import com.qf.project.zuimeiyouwu.fragment.YouWuViewPagerfragment;

import java.util.List;

/**
 * Created by Administrator on 2017/1/16.
 */
public class YouWuFragmentViewPagerAdapter extends FragmentPagerAdapter{
    private  List<TabEntity> tabEntityList;

    public YouWuFragmentViewPagerAdapter(FragmentManager fm, List<TabEntity> tabEntityList) {
        super(fm);
        this.tabEntityList = tabEntityList;
    }

    @Override
    public Fragment getItem(int position) {
        return YouWuViewPagerfragment.getInstance(tabEntityList.get(position));
    }

    @Override
    public int getCount() {
        return tabEntityList.size();
    }
}
