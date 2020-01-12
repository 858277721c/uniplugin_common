package com.sd.lib.uniplugin.common.utils;

import android.text.TextUtils;

import com.alibaba.fastjson.JSONObject;
import com.sd.lib.uniplugin.common.callback.IJSCallback;
import com.sd.lib.uniplugin.common.constant.ResponseCode;
import com.sd.lib.uniplugin.common.core.CommonRuntimeInfo;
import com.sd.lib.uniplugin.common.response.JSResponse;

public class CheckUtils
{
    private CheckUtils()
    {
    }

    /**
     * 是否已经初始化
     *
     * @param callback
     * @return true-已经初始化
     */
    public static boolean isInitialized(IJSCallback callback)
    {
        if (CommonRuntimeInfo.getInstance().isInitialized())
            return true;

        if (callback != null)
            callback.response(new JSResponse(ResponseCode.NOT_INIT));
        return false;
    }

    /**
     * 参数是否为空
     *
     * @param param
     * @param callback
     * @return true-参数为空
     */
    public static boolean isEmptyParam(String param, IJSCallback callback)
    {
        if (TextUtils.isEmpty(param))
        {
            if (callback != null)
                callback.response(new JSResponse(ResponseCode.PARAM_MISSING));
            return true;
        }
        return false;
    }

    /**
     * 参数是否为空
     *
     * @param param
     * @param callback
     * @return true-参数为空
     */
    public static boolean isEmptyParam(JSONObject param, IJSCallback callback)
    {
        if (param == null || param.isEmpty())
        {
            if (callback != null)
                callback.response(new JSResponse(ResponseCode.PARAM_MISSING));
            return true;
        }
        return false;
    }
}
