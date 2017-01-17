package com.qf.project.zuimeiyouwu.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by Administrator on 2016/12/22.
 */
public class MyCircleBitmapView extends ImageView {
    public MyCircleBitmapView(Context context) {
        this(context,null);
    }

    public MyCircleBitmapView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyCircleBitmapView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //得到用户设置的图片
        Drawable drawable = getDrawable();
        if(drawable!=null && drawable instanceof BitmapDrawable){
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap srcBitmap = bitmapDrawable.getBitmap();
            //把用户设置的图片变成圆形图片
             Bitmap dstBitmap = getCircleBitmap(srcBitmap);
            //再绘制到画布：如果要完全显示圆形图像，需要压缩
            Rect srcRect = new Rect(0,0,dstBitmap.getWidth(),dstBitmap.getHeight());
            Rect dstRect;
            if(getWidth()>getHeight()){
                dstRect = new Rect(getWidth()/2-getHeight()/2,0,getWidth()/2+getHeight()/2,getHeight());
            }else {
                dstRect = new Rect(0,getHeight()/2-getWidth()/2,getWidth(),getHeight()/2+getWidth()/2);
            }
            canvas.drawBitmap(dstBitmap,srcRect,dstRect,null);
        }else {
            super.onDraw(canvas);
        }
    }
    private Bitmap getCircleBitmap(Bitmap srcBitmap) {
        //需要一张新的画布：只需要内切圆的部分，新画布的大小应该就是原图内切圆的大小的矩形
        int srcWidth = srcBitmap.getWidth();
        int srcHeight = srcBitmap.getHeight();
        int width = srcWidth<srcHeight?srcWidth:srcHeight;
        Bitmap dstBitmap = Bitmap.createBitmap(width,width, Bitmap.Config.ARGB_8888);
        //画布的构造方法传入了一张空白的Bitmap,将来在这张画布上绘制的图案最终其实就是绘制在Bitmap上了
        Canvas canvas = new Canvas(dstBitmap);
        //先画dst的图形
        Paint paint = new Paint();
        float cr;
        float cy;
        float cx =cy =cr= width/2;
        canvas.drawCircle(cx,cy,cr,paint);
        //设置画笔的混合模式为SrcIn
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        //在画布上绘制原图:原图压缩后绘制
        Rect src = new Rect(0,0,srcWidth,srcHeight);
        Rect dst = new Rect(0,0,width,width);
        canvas.drawBitmap(srcBitmap,src,dst,paint);
        //将混合完成的图片返回
        return dstBitmap;
    }
}
