package com.qf.chenhao.mr_chenlibrary.widget.slidinglabel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import com.qf.chenhao.mr_chenlibrary.R;

/**
 * Created by Administrator on 2016/12/27.
 */
public class SlidingView extends FrameLayout {

    private SlidingLabelView slidingLabelView;
    private LabelView labelView;
    private OnSelectorListener onSelectorListener;

    public OnSelectorListener getOnSelectorListener() {
        return onSelectorListener;
    }

    public void setOnSelectorListener(OnSelectorListener onSelectorListener) {
        this.onSelectorListener = onSelectorListener;
    }

    public SlidingView(Context context) {
        this(context,null);
    }

    public SlidingView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public SlidingView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    /**
     * 初始化
     * inflate(R.layout.widget_slidinglabel, null)
     *      -> 直接将 R.layout.xxx 所对应的布局文件转换成为一个布局对象，该布局对象不会保留layout_开头的属性
     *
     * .inflate(R.layout.widget_slidinglabel, this, false)
     *     -> 直接将 R.layout.xxx 所对应的布局文件转换成为一个布局对象，该布局对象会保留layout_开头的属性
     *
     * .inflate(R.layout.widget_slidinglabel, this, true)
     *     ->将 R.layout.xxx 所对应的布局文件转化成一个布局对象，并且将该布局对象添加到第二个参数所表示的容器中
     */
    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.widget_slidinglabel,this,true);

        slidingLabelView = (SlidingLabelView) this.findViewById(R.id.slv);
        labelView = (LabelView) this.findViewById(R.id.lv);
        slidingLabelView.setOnSelectorListener(new SlidingLabelView.OnSelectorListener() {
            @Override
            public void selector(String text, int position) {
                labelView.setText(text);
                if (onSelectorListener != null){
                    onSelectorListener.selector(text,position);
                }
            }

            @Override
            public void eventUp() {
                labelView.setText(null);
            }
        });
    }

    public interface OnSelectorListener{
        void selector(String text, int position);
    }
}
