package com.sd.lib.uniplugin.common.core;

import android.content.Context;
import android.text.TextUtils;

import com.sd.lib.uniplugin.common.callback.IJSCallback;
import com.sd.lib.uniplugin.common.constant.ResponseCode;
import com.sd.lib.uniplugin.common.response.JSResponse;

public abstract class BaseManager
{
    protected Context getContext()
    {
        return CommonRuntimeInfo.getInstance().getContext();
    }

    protected boolean checkInitialized(IJSCallback callback)
    {
        if (!CommonRuntimeInfo.getInstance().isInitialized())
        {
            callback.response(new JSResponse(ResponseCode.NOT_INIT));
            return false;
        }
        return true;
    }

    protected boolean checkJsonEmpty(String json, IJSCallback callback)
    {
        if (TextUtils.isEmpty(json))
        {
            if (callback != null)
                callback.response(new JSResponse(ResponseCode.PARAM_MISSING));
            return false;
        }
        return true;
    }

    public abstract void destroy();
}
