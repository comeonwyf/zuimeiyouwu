package com.qf.project.zuimeiyouwu.fragment;


import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import com.qf.chenhao.mr_chenlibrary.base.BaseFragment;
import com.qf.project.zuimeiyouwu.Entity.DesignerEntity;
import com.qf.project.zuimeiyouwu.R;
import com.qf.project.zuimeiyouwu.adapter.DesignerFragmentPagerAdapter;
import com.qf.project.zuimeiyouwu.util.Constant;
import com.qf.project.zuimeiyouwu.util.JsonUtil;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import okhttp3.Call;

/**
 * Created by Administrator on 2017/1/16.
 */
public class DesignerFragment extends BaseFragment{
    private TabLayout tabLayout;
    private ViewPager designerVp;
    @Override
    protected int getContentId() {
        return R.layout.designer_fragment_layout;
    }

    @Override
    protected void init(View view) {
        tabLayout=  findViewByIds(view,R.id.actionbar);

        designerVp=findViewByIds(view,R.id.designer_vp);


    }

    @Override
    protected void loadDatas() {
        OkHttpUtils.get()
                .url(Constant.DESIGNER_URl)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }
                    @Override
                    public void onResponse(String response, int id) {
                        DesignerEntity designerByJson = JsonUtil.getDesignerByJson(response);
                        Log.e("Constant.DESIGNER_URl", "loadDatas: "+designerByJson);
                        DesignerFragmentPagerAdapter adapter=new DesignerFragmentPagerAdapter(getActivity().getSupportFragmentManager(),designerByJson);
                        designerVp.setAdapter(adapter);

                        //必须在viewpager设置了适配器后调用
                        tabLayout.setupWithViewPager(designerVp);
                    }
                });

    }
}
