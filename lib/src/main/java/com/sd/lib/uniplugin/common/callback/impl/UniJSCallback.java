package com.sd.lib.uniplugin.common.callback.impl;

import com.alibaba.fastjson.JSONObject;
import com.sd.lib.uniplugin.common.callback.BaseJSCallback;
import com.sd.lib.uniplugin.common.utils.JsonUtils;
import com.taobao.weex.bridge.JSCallback;

public class UniJSCallback extends BaseJSCallback
{
    private final JSCallback mJSCallback;

    public UniJSCallback(JSCallback callback)
    {
        mJSCallback = callback;
    }

    @Override
    protected void responseImpl(Object object, boolean keepAlive)
    {
        if (mJSCallback == null)
            return;

        final JSONObject jsonObject = JsonUtils.toJSONObject(object);
        if (keepAlive)
            mJSCallback.invokeAndKeepAlive(jsonObject);
        else
            mJSCallback.invoke(jsonObject);
    }
}
