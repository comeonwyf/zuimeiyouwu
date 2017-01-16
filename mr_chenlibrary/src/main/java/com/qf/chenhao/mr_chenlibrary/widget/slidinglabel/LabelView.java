package com.qf.chenhao.mr_chenlibrary.widget.slidinglabel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2016/12/27.
 */
public class LabelView extends View {

    private Paint backgroundPaint;
    private Paint labelPaint;
    private String text;//需要绘制的文本
    private float cr = 60;

    public LabelView(Context context) {
        this(context,null);
    }

    public LabelView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public LabelView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        //绘制背景圆圈
        backgroundPaint = new Paint();
        backgroundPaint.setAntiAlias(true);
        backgroundPaint.setColor(Color.parseColor("#54d0de"));
        //绘制中间选中字母
        labelPaint = new Paint();
        labelPaint.setAntiAlias(true);
        labelPaint.setColor(Color.WHITE);
        labelPaint.setTextSize(80);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (text!= null){
            canvas.drawCircle(getWidth()/2,getHeight()/2,cr,backgroundPaint);
            canvas.drawText(text,
                    getWidth()/2 - labelPaint.measureText(text)/2,
                    getHeight()/2 + (labelPaint.descent() - labelPaint.ascent())/2 - labelPaint.descent(),
                    labelPaint);
        }
    }

    /**
     * 提供一个方法供外界调用，用于设置显示的文本内容
     * @param text
     */
    public void setText(String text){
        this.text = text;
        invalidate();
    }
}
