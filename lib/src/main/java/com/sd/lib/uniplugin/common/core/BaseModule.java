package com.sd.lib.uniplugin.common.core;

import com.alibaba.fastjson.JSONObject;
import com.sd.lib.uniplugin.common.callback.impl.UniJSCallback;
import com.sd.lib.uniplugin.common.constant.ResponseCode;
import com.sd.lib.uniplugin.common.response.JSResponse;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.bridge.JSCallback;

public abstract class BaseModule extends WXSDKEngine.DestroyableModule
{
    protected boolean checkOptionsEmpty(JSONObject options, JSCallback callback)
    {
        if (options == null || options.isEmpty())
        {
            new UniJSCallback(callback).response(new JSResponse(ResponseCode.PARAM_MISSING));
            return false;
        }
        return true;
    }

    protected String optionsToJson(JSONObject options)
    {
        if (options == null)
            return null;
        return options.toJSONString();
    }
}
