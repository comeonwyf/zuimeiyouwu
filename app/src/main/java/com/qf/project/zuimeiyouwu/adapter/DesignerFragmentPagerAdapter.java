package com.qf.project.zuimeiyouwu.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.qf.project.zuimeiyouwu.Entity.DesignerEntity;
import com.qf.project.zuimeiyouwu.fragment.DesignerViewPagerFragment;
import com.qf.project.zuimeiyouwu.util.Constant;

/**
 * Created by Administrator on 2017/1/17.
 */
public class DesignerFragmentPagerAdapter extends FragmentStatePagerAdapter {
    DesignerEntity data;

    public DesignerFragmentPagerAdapter(FragmentManager fm, DesignerEntity data) {
        super(fm);
        this.data = data;
    }

    @Override
    public Fragment getItem(int position) {
        return DesignerViewPagerFragment.getInstance(data);
    }

    @Override
    public int getCount() {
        return Constant.TABLAYOUT_ARR.length;
    }
    //返回标题

    @Override
    public CharSequence getPageTitle(int position) {
        return Constant.TABLAYOUT_ARR[position];
    }
}
