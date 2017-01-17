package com.qf.project.zuimeiyouwu.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.qf.chenhao.mr_chenlibrary.util.ScreenUtil;
import com.qf.project.zuimeiyouwu.Entity.ProductListEntity;
import com.qf.project.zuimeiyouwu.R;
import com.qf.project.zuimeiyouwu.util.MyCircleBitmapView;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Administrator on 2017/1/17.
 */
public class YouWuProductListAdapter extends BaseAdapter {

    private final Context context;
    private final List<ProductListEntity> productList;

    public YouWuProductListAdapter(Context context, List<ProductListEntity> productList) {
        this.context = context;
        this.productList = productList;
    }

    @Override
    public int getCount() {
        return productList.size();
    }

    @Override
    public Object getItem(int position) {
        return productList.get(position);
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
            convertView = LayoutInflater.from(context).inflate(R.layout.item_productlist_layout,null);
            viewHolder.productImgView = (ImageView) convertView.findViewById(R.id.product_iv);
            viewHolder.productNameView = (TextView) convertView.findViewById(R.id.product_name);
            viewHolder.authorImgView = (MyCircleBitmapView) convertView.findViewById(R.id.author_log);
            viewHolder.authorNameView = (TextView) convertView.findViewById(R.id.author);
            viewHolder.authorDescriptionView = (TextView) convertView.findViewById(R.id.author_description);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        final ImageView iv = viewHolder.productImgView;

        Glide.with(context).load(productList.get(position).getCover_images().get(0))
                .asBitmap().diskCacheStrategy(DiskCacheStrategy.ALL).thumbnail(0.1F)
                .dontAnimate()
                .into(new SimpleTarget<Bitmap>() {
                    @Override
                    public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {
                        int width = resource.getWidth();
                        int height = resource.getHeight();
                        int screenWidth = ScreenUtil.getScreenWidth(context);
                        int mHeight = (int) (((float)screenWidth/width)*height);
                        ViewGroup.LayoutParams layoutParams = iv.getLayoutParams();
                        layoutParams.height = mHeight;
                        iv.setLayoutParams(layoutParams);
                        iv.setImageBitmap(resource);
                    }
                });
        viewHolder.productNameView.setText(productList.get(position).getName());
        Glide.with(context).load(productList.get(position).getDesigner().getAvatar_url())
                .diskCacheStrategy(DiskCacheStrategy.ALL).into(viewHolder.authorImgView);
        viewHolder.authorNameView.setText(productList.get(position).getDesigner().getName());
        viewHolder.authorDescriptionView.setText(productList.get(position).getDesigner().getLabel());
        return convertView;
    }
    class ViewHolder{
        ImageView productImgView;
        TextView productNameView;
        MyCircleBitmapView authorImgView;
        TextView authorNameView;
        TextView authorDescriptionView;
    }
}
