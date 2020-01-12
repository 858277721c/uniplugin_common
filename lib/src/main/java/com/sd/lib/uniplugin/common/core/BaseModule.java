package com.sd.lib.uniplugin.common.core;

import com.alibaba.fastjson.JSONObject;
import com.taobao.weex.WXSDKEngine;

public abstract class BaseModule extends WXSDKEngine.DestroyableModule
{
    protected String optionsToJson(JSONObject options)
    {
        return options == null ? null : options.toJSONString();
    }
}
