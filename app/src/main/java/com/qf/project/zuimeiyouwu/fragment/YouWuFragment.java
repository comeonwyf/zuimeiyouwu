package com.qf.project.zuimeiyouwu.fragment;

import android.graphics.Color;
import android.support.v4.app.FragmentManager;
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
    private int titlesContainerLeftMargin;
    private int prePosition;
    private float textSetSize = 14;//导航标题字体初始大小

    @Override
    protected int getContentId() {
        return R.layout.fragment_youwu_layout;
    }

    @Override
    protected void init(View view) {
        //获得屏幕width
        screenWidth = ScreenUtil.getScreenWidth(getContext());
        //获得titlescontainer控件的leftMargin
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) titlesContainer.getLayoutParams();
        layoutParams.leftMargin = screenWidth/35;
        titlesContainer.setLayoutParams(layoutParams);
        titlesContainerLeftMargin = layoutParams.leftMargin;
        Log.e(TAG, "init: "+titlesContainerLeftMargin);
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
                setViewPager(getFragmentManager(),tabEntityList);
            }
        });
        
    }

    //设置viewpager
    private void setViewPager(FragmentManager fragmentManager, final List<TabEntity> tabEntityList) {
        YouWuFragmentViewPagerAdapter adapter = new YouWuFragmentViewPagerAdapter(getFragmentManager(),tabEntityList);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {//设置监听
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                int titlesContainerWidth = titlesContainer.getWidth();
                TextView textView = (TextView) titlesContainer.getChildAt(position);

                textView.setTextSize(textSetSize+(1-positionOffset)*3);
                int width = (int) (textView.getWidth()+(1-positionOffset)*3);
                if(positionOffset<0.5f){
                    textView.setAlpha(1-positionOffset);
                }else {
                    textView.setAlpha(0.5f);
                }
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) indicatorView.getLayoutParams();
                layoutParams.width = width;
                layoutParams.leftMargin = (int) (titlesContainerLeftMargin+(position+positionOffset)*((titlesContainerWidth-width)/(tabEntityList.size()-1)));
                indicatorView.setLayoutParams(layoutParams);
            }
            @Override
            public void onPageSelected(int position) {
                Log.e(TAG, "onPageSelected: "+position);
                TextView textView1 = (TextView) titlesContainer.getChildAt(prePosition);
                textView1.setAlpha(0.5f);
                textView1.setTextSize(textSetSize);
                TextView textView = (TextView) titlesContainer.getChildAt(position);
                textView.setAlpha(1);
                prePosition = position;
            }
            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }

    //设置tabtitles
    private void setTabTitles(List<TabEntity> tabEntityList) {
        for (int i = 0; i < tabEntityList.size(); i++) {
            TextView titleView = new TextView(getContext());
            titleView.setTag(i);
            titleView.setTextSize(textSetSize);
            titleView.setTextColor(Color.parseColor("#ffffffff"));
            titleView.setAlpha(0.5f);
            if(i==0){
                titleView.setAlpha(1);
            }
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            if(i != tabEntityList.size()-1){
                params.rightMargin = screenWidth/24;
                titleView.setTextColor(Color.parseColor("#ffffffff"));
            }
            titleView.setLayoutParams(params);
            titleView.setText(tabEntityList.get(i).getName());
            titlesContainer.addView(titleView);
        }
    }
}
