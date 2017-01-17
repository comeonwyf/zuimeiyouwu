package com.qf.project.zuimeiyouwu.util;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.qf.project.zuimeiyouwu.Entity.DesignerEntity;
import com.qf.project.zuimeiyouwu.Entity.HuaBao;
import com.qf.project.zuimeiyouwu.Entity.TabEntity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/16.
 */
public class JsonUtil {
    /**
     * 获得画报的数据实体类
     * @param json
     * @return
     */
    public static HuaBao getHuaBaoByJSON(String json){
        HuaBao huaBao = new Gson().fromJson(json,HuaBao.class);
        return huaBao;
    }

    /**
     * 获得导航标题的方法
     */
    public static List<TabEntity> getTabListByJSON(String json){
        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONObject data = jsonObject.getJSONObject("data");
            JSONArray jsonArray = data.getJSONArray("categories");
            Gson gson = new Gson();
            TypeToken<List<TabEntity>> tt = new TypeToken<List<TabEntity>>(){};
            return gson.fromJson(jsonArray.toString(), tt.getType());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
    /*获取设计师页viewPager首页*/
    public  static DesignerEntity getDesignerByJson(String json){
        Log.d("爆炸", "getDesignerByJson: "+json);
        try {
            JSONObject jsonObject=new JSONObject(json);
            Log.d("爆炸", "getDesignerByJson: "+jsonObject);
            JSONObject data=jsonObject.getJSONObject("data");
            return new Gson().fromJson(data.toString(),DesignerEntity.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
