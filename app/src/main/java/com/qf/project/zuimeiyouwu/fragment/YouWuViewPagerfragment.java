package com.qf.project.zuimeiyouwu.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.qf.chenhao.mr_chenlibrary.base.BaseFragment;
import com.qf.chenhao.mr_chenlibrary.util.ScreenUtil;
import com.qf.project.zuimeiyouwu.Entity.ProductListEntity;
import com.qf.project.zuimeiyouwu.Entity.TabEntity;
import com.qf.project.zuimeiyouwu.R;
import com.qf.project.zuimeiyouwu.adapter.YouWuProductListAdapter;
import com.qf.project.zuimeiyouwu.util.Constant;
import com.qf.project.zuimeiyouwu.util.JsonUtil;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import de.halfbit.pinnedsection.PinnedSectionListView;
import okhttp3.Call;


/**
 * Created by Administrator on 2017/1/16.
 */
public class YouWuViewPagerfragment extends BaseFragment implements View.OnClickListener, AdapterView.OnItemClickListener {
    private RelativeLayout subtitlesContainer;
    private ListView listView;
    private PinnedSectionListView pinnedListview;
    private String TAG = "print";
    private TabEntity entity;

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
        listView = findViewByIds(view, R.id.listview);//普通listview
        pinnedListview = findViewByIds(view,R.id.pinnedlistview);

        //子标题的容器设置点击监听，弹出popupwindow
        subtitlesContainer.setOnClickListener(this);
    }

    @Override
    protected void getDatas(Bundle bundle) {
        entity = (TabEntity) bundle.getSerializable("datas");

        if(entity.getName().equals("Daily")){//daily界面
            pinnedListview.setVisibility(View.VISIBLE);
            subtitlesContainer.setVisibility(View.GONE);
            listView.setVisibility(View.GONE);

        }else {//其他界面
            if(entity.getName().equals("Men")){
                subtitlesContainer.setVisibility(View.GONE);
            }
            String url = Constant.TAB_DETAILS_BEFORE_URL+ entity.getId()+Constant.TAB_DETAILS_END_URL;
            OkHttpUtils.get().url(url).build().execute(new StringCallback() {
                @Override
                public void onError(Call call, Exception e, int id) {
                }
                @Override
                public void onResponse(String response, int id) {
                    //获得产品列表
                    List<ProductListEntity> productList = JsonUtil.getProductListByJSON(response);
                    YouWuProductListAdapter adapter = new YouWuProductListAdapter(getContext(),productList);
                    listView.setAdapter(adapter);
                }
            });

        }

    }

    //点击监听，弹出popupwindow
    @Override
    public void onClick(View v) {
        PopupWindow popupWindow = new PopupWindow(getContext());
        if(!entity.getName().equals("Daily")||!entity.getName().equals("Men")){
            //获得数据源
            List<TabEntity.SubCategoriesEntity> sub_categories = entity.getSub_categories();
            TabEntity.SubCategoriesEntity subentity = new TabEntity.SubCategoriesEntity();
            subentity.setName("全部");
            subentity.setId(entity.getId());
            List<TabEntity.SubCategoriesEntity> list = new ArrayList<>();
            list.add(subentity);
            list.addAll(sub_categories);

            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.popupwindow_youwu_layout, null);
            GridView gridView = (GridView) inflate.findViewById(R.id.gridview);
            gridView.setNumColumns(3);
            gridView.setColumnWidth(90);
            gridView.setVerticalSpacing(20);
            MyAdapter adapter = new MyAdapter(getContext(),list);
            gridView.setAdapter(adapter);
            gridView.setOnItemClickListener(this);
            popupWindow.setContentView(inflate);
            popupWindow.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            popupWindow.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
            popupWindow.setOutsideTouchable(true);
            popupWindow.showAsDropDown(v);
        }

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.e(TAG, "onItemClick: 点击了" );
        view.setBackgroundResource(R.drawable.subtitle_selector);
    }

    private class MyAdapter extends BaseAdapter{
        private  List<TabEntity.SubCategoriesEntity> sub_categories;
        private  Context context;

        public MyAdapter(Context context, List<TabEntity.SubCategoriesEntity> sub_categories) {
            this.context = context;
            this.sub_categories =sub_categories;
        }

        @Override
        public int getCount() {
            return sub_categories.size();
        }

        @Override
        public Object getItem(int position) {
            return sub_categories.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder viewHolder;
            if(convertView==null){
                viewHolder = new ViewHolder();
                convertView = LayoutInflater.from(context).inflate(R.layout.item_gridview_layout,null);
                viewHolder.titlesview = (TextView) convertView.findViewById(R.id.subtitle);
                convertView.setTag(viewHolder);

            }else {
                viewHolder = (ViewHolder) convertView.getTag();
            }
            viewHolder.titlesview.setText(sub_categories.get(position).getName());
            return convertView;
        }
        class ViewHolder{
            TextView titlesview;
        }
    }
}
