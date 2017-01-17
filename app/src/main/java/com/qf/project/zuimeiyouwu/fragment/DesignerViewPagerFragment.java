package com.qf.project.zuimeiyouwu.fragment;

import com.qf.chenhao.mr_chenlibrary.base.BaseFragment;
import com.qf.project.zuimeiyouwu.R;

/**
 * Created by Administrator on 2017/1/17.
 */
public class DesignerViewPagerFragment extends BaseFragment {
   public static DesignerViewPagerFragment getInstance(){
       DesignerViewPagerFragment fragment=new DesignerViewPagerFragment();
       return fragment;
   }
    @Override
    protected int getContentId() {
        return R.layout.designer_viewpager_fragment_layout;
    }

}
