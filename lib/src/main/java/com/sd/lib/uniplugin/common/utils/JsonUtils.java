package com.sd.lib.uniplugin.common.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

import java.util.Map;

public class JsonUtils
{
    public static <T> T jsonToObject(String json, Class<T> clazz)
    {
        return JSON.parseObject(json, clazz);
    }

    public static String objectToJson(Object object)
    {
        return JSON.toJSONString(object);
    }

    public static Map<String, Object> jsonToMapObject(String json)
    {
        final Map<String, Object> map = JSON.parseObject(json, new TypeReference<Map<String, Object>>()
        {
        });
        return map;
    }

    public static Map<String, String> jsonToMapString(String json)
    {
        final Map<String, String> map = JSON.parseObject(json, new TypeReference<Map<String, String>>()
        {
        });
        return map;
    }

    public static <T> T fromJSONObject(JSONObject object, Class<T> clazz)
    {
        if (object == null || object.isEmpty())
            return null;

        final String json = object.toJSONString();
        return jsonToObject(json, clazz);
    }

    public static JSONObject toJSONObject(Object object)
    {
        final String json = objectToJson(object);
        final Map<String, Object> map = JSON.parseObject(json, new TypeReference<Map<String, Object>>()
        {
        });
        return new JSONObject(map);
    }
}
