package com.qf.project.zuimeiyouwu.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

/**
 * Created by Administrator on 2017/1/25.
 */
public class RollPagerViewAdapter extends PagerAdapter{

    private  List<String> cover_images;

    public RollPagerViewAdapter(List<String> cover_images) {
        this.cover_images = cover_images;
    }

    @Override
    public int getCount() {
        return cover_images.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(container.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Glide.with(container.getContext()).load(cover_images.get(position))
                .diskCacheStrategy(DiskCacheStrategy.ALL).thumbnail(0.1f)
                .into(imageView);
        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
