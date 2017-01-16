package com.qf.chenhao.mr_chenlibrary.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Administrator on 2016/12/28.
 */
public class SharedUtil {

    private static SharedPreferences sp;
    private static SharedPreferences.Editor edit;

    public static void init(Context context) {
        sp = context.getSharedPreferences("configer", Context.MODE_PRIVATE);
        edit = sp.edit();
    }

    /**
     * 写入int类型
     * @param name
     * @param value
     */
    public static void setInt(String name,int value){
        edit.putInt(name,value);
        edit.commit();
    }

    /**
     * 获取int类型
     * @param name
     * @return
     */
    public static int getInt(String name){
        return sp.getInt(name,-1);
    }

    /**
     * 写入String类型
     * @param name
     * @param value
     */
    public static void setString(String name,String value){
        edit.putString(name,value);
        edit.commit();
    }

    /**
     * 获取String类型
     * @param name
     * @return
     */
    public static String getString(String name){
        return sp.getString(name,null);
    }
}
