package com.qf.project.zuimeiyouwu.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import com.qf.project.zuimeiyouwu.Entity.DesignerEntity;
import com.qf.project.zuimeiyouwu.Entity.ProductListEntity;
import com.qf.project.zuimeiyouwu.Entity.TabEntity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by Administrator on 2017/1/16.
 */
public class JsonUtil {

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

    public static DesignerEntity getDesignerByJson(String str) {
        try {
            JSONObject jsonObject=new JSONObject(str);
            JSONObject data = jsonObject.getJSONObject("data");
            return new Gson().fromJson(data.toString(),DesignerEntity.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 获得有物产品列表的方法
     */
    public static List<ProductListEntity> getProductListByJSON(String json){
        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONObject data = jsonObject.getJSONObject("data");
            JSONArray jsonArray = data.getJSONArray("products");
            Gson gson = new Gson();
            TypeToken<List<ProductListEntity>> tt = new TypeToken<List<ProductListEntity>>(){};
            return gson.fromJson(jsonArray.toString(), tt.getType());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
