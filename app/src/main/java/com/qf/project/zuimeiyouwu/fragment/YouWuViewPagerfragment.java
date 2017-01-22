package com.qf.project.zuimeiyouwu.fragment;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.qf.chenhao.mr_chenlibrary.base.BaseFragment;
import com.qf.project.zuimeiyouwu.Entity.ProductListEntity;
import com.qf.project.zuimeiyouwu.Entity.TabEntity;
import com.qf.project.zuimeiyouwu.R;
import com.qf.project.zuimeiyouwu.adapter.YouWuProductListAdapter;
import com.qf.project.zuimeiyouwu.util.Constant;
import com.qf.project.zuimeiyouwu.util.JsonUtil;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import de.halfbit.pinnedsection.PinnedSectionListView;
import okhttp3.Call;


/**
 * Created by Administrator on 2017/1/16.
 */
public class YouWuViewPagerfragment extends BaseFragment implements View.OnClickListener, AdapterView.OnItemClickListener, AbsListView.OnScrollListener {
    private RelativeLayout subtitlesContainer;
    private ListView listView;
    private PinnedSectionListView pinnedListview;
    private String TAG = "print";
    private TabEntity entity;
    private PopupWindow popupWindow;
    private MyAdapter adapter;
    private boolean isBottom;
    private boolean isChangePage;
    private int page = 1;
    private TextView subTitleNameView;
    private View inflate;
    private TabEntity.SubCategoriesEntity entity1;
    private boolean isSelectItem;
    private List<ProductListEntity.DataEntity.ProductsEntity> list;
    private YouWuProductListAdapter productAdapter;

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
        subTitleNameView = findViewByIds(view, R.id.subtitle);
        listView = findViewByIds(view, R.id.listview);//普通listview

        list = new ArrayList<>();
        productAdapter = new YouWuProductListAdapter(getContext(),list);
        listView.setAdapter(productAdapter);

        pinnedListview = findViewByIds(view,R.id.pinnedlistview);

        //子标题的容器设置点击监听，弹出popupwindow
        subtitlesContainer.setOnClickListener(this);
        //listview设置滚动监听
        listView.setOnScrollListener(this);
        //listview设置item点击监听
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ProductListEntity.DataEntity.ProductsEntity productsEntity= (ProductListEntity.DataEntity.ProductsEntity) productAdapter.getItem(position);
            }
        });
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
            //获得数据并设置适配器
            getAndsetData(entity.getId(),page);
        }
    }
    private void getAndsetData(int id,int page) {
        String url = String.format(Constant.TAB_DETAILS_BEFORE_URL,id,page);
        OkHttpUtils.get().url(url).build().execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {
            }
            @Override
            public void onResponse(String response, int id) {
                //获得产品列表
                ProductListEntity productListEntity = JsonUtil.getProductListByJSON(response);
                if(productListEntity.getData().getHas_next()==1){
                    isChangePage = true;
                    if(inflate!=null){
                        listView.removeFooterView(inflate);
                    }
                    inflate = LayoutInflater.from(getContext()).inflate(R.layout.youwu_loadmore_foorter, null);
                    listView.addFooterView(inflate);
                }else {
                    isChangePage = false;
                    if(inflate!=null){
                        listView.removeFooterView(inflate);
                    }
                    inflate = LayoutInflater.from(getContext()).inflate(R.layout.youwu_end_foorter, null);
                    listView.addFooterView(inflate);
                }
                YouWuViewPagerfragment.this.list.addAll(productListEntity.getData().getProducts());
                productAdapter.notifyDataSetChanged();
            }
        });
    }

    //点击监听，弹出popupwindow
    @Override
    public void onClick(View v) {
        popupWindow = new PopupWindow(getContext());
        if(!entity.getName().equals("Daily")||!entity.getName().equals("Men")){
            //获得数据源
            List<TabEntity.SubCategoriesEntity> sub_categories = entity.getSub_categories();
            TabEntity.SubCategoriesEntity subentity = new TabEntity.SubCategoriesEntity();
            subentity.setName("全部");
            subentity.setId(entity.getId());
            List<TabEntity.SubCategoriesEntity> list = new ArrayList<>();
            list.add(subentity);
            list.addAll(sub_categories);
            //弹出窗设置
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.popupwindow_youwu_layout, null);
            GridView gridView = (GridView) inflate.findViewById(R.id.gridview);
            gridView.setNumColumns(3);
            gridView.setColumnWidth(90);
            gridView.setVerticalSpacing(20);
            adapter = new MyAdapter(getContext(),list);
            gridView.setAdapter(adapter);
            gridView.setOnItemClickListener(this);
            popupWindow.setContentView(inflate);
            popupWindow.setWidth( getResources().getDisplayMetrics().widthPixels);
            popupWindow.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
            popupWindow.setFocusable(true);
            popupWindow.setBackgroundDrawable(new BitmapDrawable());
            popupWindow.setOutsideTouchable(true);
            ViewGroup.LayoutParams layoutParams = subtitlesContainer.getLayoutParams();
            //弹出窗位置的设置
            popupWindow.showAsDropDown(subtitlesContainer,0,-layoutParams.height);
        }

    }
    //gridview的监听事件
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        isSelectItem = true;
        YouWuViewPagerfragment.this.list.clear();
        entity1 = (TabEntity.SubCategoriesEntity) adapter.getItem(position);
        subTitleNameView.setText(entity1.getName());
        page = 1;
        getAndsetData(entity1.getId(),page);
        if(popupWindow.isShowing()){
            popupWindow.dismiss();
        }
    }

    //适配器
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

    //分页加载,listview滚动监听
    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {
        if(scrollState==SCROLL_STATE_IDLE && isBottom && isChangePage){
            page++;
            if(!isSelectItem){
                getAndsetData(entity.getId(),page);
            }else {
                getAndsetData(entity1.getId(),page);
            }

        }
    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        if(visibleItemCount+firstVisibleItem==totalItemCount){
            isBottom = true;
        }else {
           isBottom = false;
        }
    }
}
