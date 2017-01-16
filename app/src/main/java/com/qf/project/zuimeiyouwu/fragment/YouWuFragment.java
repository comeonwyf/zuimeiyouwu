package com.qf.project.zuimeiyouwu.fragment;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.qf.chenhao.mr_chenlibrary.base.BaseFragment;
import com.qf.chenhao.mr_chenlibrary.util.ScreenUtil;
import com.qf.project.zuimeiyouwu.Entity.TabEntity;
import com.qf.project.zuimeiyouwu.R;
import com.qf.project.zuimeiyouwu.adapter.YouWuFragmentViewPagerAdapter;
import com.qf.project.zuimeiyouwu.util.Constant;
import com.qf.project.zuimeiyouwu.util.JsonUtil;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import okhttp3.Call;

/**
 * Created by Administrator on 2017/1/16.
 */
public class YouWuFragment extends BaseFragment{
    @Bind(R.id.titles_tab)
    public LinearLayout titlesContainer;//导航标题部分
    @Bind(R.id.indicator_tab)
    public View indicatorView;//导航指示器
    @Bind(R.id.viewpager_youwu)
    public ViewPager viewPager;

    private String TAG = "print";
    private int screenWidth;

    @Override
    protected int getContentId() {
        return R.layout.fragment_youwu_layout;
    }

    @Override
    protected void init(View view) {
        //获得屏幕width
        screenWidth = ScreenUtil.getScreenWidth(getContext());
    }
    //下载数据

    @Override
    protected void loadDatas() {
        //下载tab_title数据
        String titlesUrl = Constant.TAB_URL;
        OkHttpUtils.get().url(titlesUrl).build().execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {
            }
            @Override
            public void onResponse(String response, int id) {
                List<TabEntity> tabEntityList = new ArrayList<TabEntity>();
                //添加Daily的标题
                TabEntity dailyTitle = new TabEntity();
                dailyTitle.setName("Daily");
                tabEntityList.add(dailyTitle);
                tabEntityList.addAll(JsonUtil.getTabListByJSON(response));
                //设置tab
                setTabTitles(tabEntityList);
                //viewpager设置数据
                YouWuFragmentViewPagerAdapter adapter = new YouWuFragmentViewPagerAdapter(getFragmentManager(),tabEntityList);
                viewPager.setAdapter(adapter);
            }
        });
        
    }
    //设置tabtitles
    private void setTabTitles(List<TabEntity> tabEntityList) {
        for (int i = 0; i < tabEntityList.size(); i++) {
            Log.e(TAG, "setTabTitles: "+tabEntityList.size() );
            TextView titleView = new TextView(getContext());
            titleView.setTextSize(14);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params.rightMargin = screenWidth/15;
            titleView.setLayoutParams(params);
            titleView.setText(tabEntityList.get(i).getName());
            titlesContainer.addView(titleView);
        }
    }
}
