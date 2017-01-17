package com.qf.project.zuimeiyouwu.util;

import android.content.Context;
import android.graphics.Typeface;

/**
 * 设置字体的工具类
 * Created by Administrator on 2017/1/17.
 */
public class SetTextStyle {

    public static Typeface setFZTextStyle(Context context){
        Typeface typeface = Typeface.createFromAsset(context.getAssets(),"fonts/FZLanTingHeiS_Regular.otf");
        return typeface;
    }
}
