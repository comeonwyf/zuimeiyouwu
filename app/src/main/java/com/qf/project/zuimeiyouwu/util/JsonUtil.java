package com.qf.project.zuimeiyouwu.util;

import com.google.gson.Gson;
import com.qf.project.zuimeiyouwu.Entity.HuaBao;

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
}
