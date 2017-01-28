package com.qf.chenhao.mr_chenlibrary.widget.slidinglabel.tabview;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.qf.chenhao.mr_chenlibrary.R;
import com.qf.chenhao.mr_chenlibrary.widget.slidinglabel.loopviewpager.LoopViewPager;

/**
 * Created by Administrator on 2016/12/28.
 */
public class TabView extends LinearLayout {

    private int count ;//导航图标的个数
    //被选中的资源
    private int checkedImg;
    //未被选中的资源
    private int unCheckedImg;
    private LayoutParams params;

    public TabView(Context context) {
        this(context,null);
    }

    public TabView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public TabView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.setOrientation(LinearLayout.HORIZONTAL);//设置布局为横向
        paresAttrs(attrs);
    }

    /**
     * 获取自定义属性
     * @param attrs
     */
    private void paresAttrs(AttributeSet attrs) {
        if (attrs!= null){
            TypedArray typedArray = getContext().getResources().obtainAttributes(attrs, R.styleable.TabView);
            checkedImg = typedArray.getResourceId(R.styleable.TabView_checkdrawable, R.drawable.img_dot_white);
            unCheckedImg = typedArray.getResourceId(R.styleable.TabView_uncheckdrawable, R.drawable.img_dot_gray);
            typedArray.recycle();//回收资源
        }
    }

    /**
     * 由外界调用，传递导航图标
     * @param count
     */
    public void setCount(int count){
        this.count = count;
        init();
    }

    private void init() {
        this.removeAllViews();//清空布局

        params = new LayoutParams(30,30);
        params.leftMargin = 5;
        params.rightMargin = 5;

        for (int i = 0; i < count; i++) {
            ImageView iv = new ImageView(getContext());
            if (i== 0){
                iv.setImageResource(checkedImg);
                iv.setTag("checked");
            }else{
                iv.setImageResource(unCheckedImg);
            }
            this.addView(iv,params);
        }
    }

    /**
     * 外界调用，设置和这个导航控件联动的viewpager对象
     * @param viewPager
     */
    public void setViewPager(ViewPager viewPager){
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
//                position = LoopViewPager.toRealPosition(position, count);

                //将原来选中的 资源换成未被选中的资源
                ImageView iv = (ImageView) findViewWithTag("checked");
                if (iv!= null){
                    iv.setImageResource(unCheckedImg);
                    iv.setTag(null);
                }
                //讲position处的资源换成被选中的资源
                ImageView iv2 = (ImageView) getChildAt(position);
                if (iv2 != null){
                    iv2.setImageResource(checkedImg);
                    iv2.setTag("checked");
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
