package com.qf.chenhao.mr_chenlibrary.widget.slidinglabel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 2016/12/27.
 * 侧边字母标签控件
 */
public class SlidingLabelView extends View {
    //画的内容
    private String[] labels = {"热门","A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    private Paint unCheckedPaint;
    private Paint CheckedPaint;
    private int index = -1;//表示被选中的字母下标

    private OnSelectorListener onSelectorListener;

    public OnSelectorListener getOnSelectorListener() {
        return onSelectorListener;
    }

    public void setOnSelectorListener(OnSelectorListener onSelectorListener) {
        this.onSelectorListener = onSelectorListener;
    }

    public SlidingLabelView(Context context) {
        this(context,null);
    }

    public SlidingLabelView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public SlidingLabelView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        unCheckedPaint = new Paint();
        unCheckedPaint.setAntiAlias(true);
        unCheckedPaint.setDither(true);
        unCheckedPaint.setColor(Color.parseColor("#88888888"));
        unCheckedPaint.setTextSize(35);

        CheckedPaint = new Paint();
        CheckedPaint.setAntiAlias(true);
        CheckedPaint.setDither(true);
        CheckedPaint.setColor(Color.parseColor("#54d0de"));
        CheckedPaint.setTextSize(35);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int width = getWidth();//控件高度
        for (int i = 0; i <labels.length ; i++) {
            if (i == index){//被选中的字母

                canvas.drawText(labels[i],
                        width/2-CheckedPaint.measureText(labels[i])/2,
                        (CheckedPaint.descent()-CheckedPaint.ascent())*(i+1),
                        CheckedPaint);
            }else{
                canvas.drawText(labels[i],
                        width/2 - unCheckedPaint.measureText(labels[i])/2,
                        (unCheckedPaint.descent() - unCheckedPaint.ascent())*(i+1),
                        unCheckedPaint);
            }
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = getMeasureSize(widthMeasureSpec, 0);
        int height = getMeasureSize(heightMeasureSpec, 1);
        //保存测量高度
        setMeasuredDimension(width,height);
    }

    /**
     *对宽高进行测量的方法
     * @param spec 高度或者宽度的空间值
     * @param type  0 - 宽度 1 - 高度
     */
    private int getMeasureSize(int spec, int type) {
        int mode = MeasureSpec.getMode(spec);
        int size = MeasureSpec.getSize(type);
        switch (mode){
            case MeasureSpec.EXACTLY:
                return size;
            case MeasureSpec.AT_MOST:
                switch (type){
                    case 0:
                        //测量宽度
                        return (int) (unCheckedPaint.measureText(labels[0])+getPaddingLeft()+getPaddingRight());
                    case 1:
                        //测量高度
                        return (int) (((unCheckedPaint.descent() - unCheckedPaint.ascent())*labels.length)+getPaddingTop()+getPaddingBottom());
                }
                break;
            case MeasureSpec.UNSPECIFIED:
                break;
        }
        return -1;
    }

    /**
     * 事件处理方法
     * @param event
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_MOVE:
                touch(event);
                break;
            case MotionEvent.ACTION_UP:
                index = -1;
                invalidate();
                //抬起手指回调方法
                if (onSelectorListener!= null){
                    onSelectorListener.eventUp();
                }
                break;
        }
        return true;
    }

    private void touch(MotionEvent event) {
        int clickY = (int) event.getY();
        //获取当前点击字母的下标
        int index = (int) (clickY/(unCheckedPaint.descent()-unCheckedPaint.ascent()));

        if(index<0){
            index = 0;
        }
        if (index >=labels.length){
            index = labels.length - 1;
        }

        this.index = index;
        //重绘
        invalidate();
        if (onSelectorListener != null){
            onSelectorListener.selector(labels[index],index);
        }
    }

    public interface OnSelectorListener{
        void selector(String text, int position);
        void eventUp();
    }
}
