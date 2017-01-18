package com.qf.project.zuimeiyouwu.fragment;


import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.qf.chenhao.mr_chenlibrary.base.BaseFragment;
import com.qf.project.zuimeiyouwu.Entity.DesignerEntity;
import com.qf.project.zuimeiyouwu.R;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Administrator on 2017/1/17.
 */
public class DesignerViewPagerFragment extends BaseFragment {
    private RecyclerView designerRecycler;
    private List<DesignerEntity.DesignersBean> designers;


    public static DesignerViewPagerFragment getInstance(DesignerEntity data) {
        DesignerViewPagerFragment fragment = new DesignerViewPagerFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("data", data);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected int getContentId() {
        return R.layout.designer_viewpager_fragment_layout;
    }


    @Override
    protected void init(View view) {

        designerRecycler = (RecyclerView) view.findViewById(R.id.designer_recycler);

    }

    @Override
    protected void getDatas(Bundle bundle) {
        DesignerEntity data = (DesignerEntity) bundle.getSerializable("data");
        //获取作者集合
        designers = data.getDesigners();
        //布局管理器
        designerRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        designerRecycler.setAdapter(new CommonAdapter<DesignerEntity.DesignersBean>(getContext(), R.layout.designer_recycler_layout, designers) {

            @Override
            protected void convert(ViewHolder holder, DesignerEntity.DesignersBean designersBean, int position) {
                holder.setText(R.id.name_tv, designersBean.getName());

                holder.setText(R.id.content_tv, designersBean.getLabel());
                CircleImageView circleImageView = holder.getView(R.id.circle_image);
                ImageView imageTop = holder.getView(R.id.imge_top);

                Glide.with(getContext().getApplicationContext())
                        .load(designersBean.getAvatar_url())
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .crossFade()
                        .thumbnail(0.1f)
                        .into(circleImageView);
                Glide.with(getContext().getApplicationContext())
                        .load(designersBean.getRecommend_images().get(0))
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .crossFade()
                        .thumbnail(0.1f)
                        .into(imageTop);
            }


        });

        Log.w("print", "getDatas: " + designers);
    }

}
