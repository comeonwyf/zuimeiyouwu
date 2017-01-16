package com.qf.chenhao.mr_chenlibrary.util;

import android.content.Context;

/**
 * Created by Administrator on 2016/12/26.
 */
public class ScreenUtil  {

    private static float screenHeight;

    public static int getStatusHeight(Context context){
        int resid = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resid>0){
            return context.getResources().getDimensionPixelOffset(resid);
        }
        return -1;
    }

    /**
     * 获得屏幕的宽度
     * @return
     */
    public static int getScreenWidth(Context context){
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /**
     * 获得屏幕的高度
     * @return
     */
    public static int getScreenHeight(Context context){
        return context.getResources().getDisplayMetrics().heightPixels;
    }
}
