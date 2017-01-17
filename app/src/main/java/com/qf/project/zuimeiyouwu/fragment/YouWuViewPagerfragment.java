package com.qf.project.zuimeiyouwu.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.qf.chenhao.mr_chenlibrary.base.BaseFragment;
import com.qf.project.zuimeiyouwu.Entity.TabEntity;
import com.qf.project.zuimeiyouwu.R;
import com.qf.project.zuimeiyouwu.adapter.YouWuProductListAdapter;
import com.qf.project.zuimeiyouwu.util.Constant;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import okhttp3.Call;


/**
 * Created by Administrator on 2017/1/16.
 */
public class YouWuViewPagerfragment extends BaseFragment {
    private RelativeLayout subtitlesContainer;
    private ListView listView;

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
    protected void init(View view) {
        subtitlesContainer = findViewByIds(view,R.id.subtitle_container);//子标题的容器
        listView = findViewByIds(view, R.id.listview);
    }

    @Override
    protected void getDatas(Bundle bundle) {
        TabEntity entity = (TabEntity) bundle.getSerializable("datas");

        if(entity.getName().equals("Daily")){//daily界面

        }else {//其他界面
            if(entity.getName().equals("Men")){
                subtitlesContainer.setVisibility(View.GONE);
            }
            String url = Constant.TAB_DETAILS_BEFORE_URL+entity.getId()+Constant.TAB_DETAILS_END_URL;
            OkHttpUtils.get().url(url).build().execute(new StringCallback() {
                @Override
                public void onError(Call call, Exception e, int id) {
                }
                @Override
                public void onResponse(String response, int id) {
                    //获得产品列表
                    Log.e("print", "onResponse: "+response );
                }
            });
            YouWuProductListAdapter adapter = new YouWuProductListAdapter();
            listView.setAdapter(adapter);
        }

    }
}
