package com.sd.lib.uniplugin.common.core;

import android.content.Context;

public abstract class BaseManager
{
    protected Context getContext()
    {
        return CommonRuntimeInfo.getInstance().getContext();
    }

    public abstract void destroy();
}
