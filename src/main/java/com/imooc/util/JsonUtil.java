package com.imooc.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author: Administrator
 * @date: 2018/5/2/002
 * @description:
 */
public class JsonUtil {
    public static String toJson(Object object){
        GsonBuilder gsonBuilder =new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson =gsonBuilder.create();
        return gson.toJson(object);
    }
}
