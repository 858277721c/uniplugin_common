package com.sd.lib.uniplugin.common.core;

import android.content.Context;

public class CommonRuntimeInfo
{
    private static CommonRuntimeInfo sInstance = null;

    /**
     * 是否已经初始化过了
     */
    private boolean mIsInitialized = false;
    private Context mContext;

    private CommonRuntimeInfo()
    {
    }

    public static CommonRuntimeInfo getInstance()
    {
        if (sInstance == null)
        {
            synchronized (CommonRuntimeInfo.class)
            {
                if (sInstance == null)
                    sInstance = new CommonRuntimeInfo();
            }
        }
        return sInstance;
    }

    public boolean isInitialized()
    {
        return mIsInitialized;
    }

    public void setInitialized(boolean initialized)
    {
        mIsInitialized = initialized;
    }

    public Context getContext()
    {
        return mContext;
    }

    public void setContext(Context context)
    {
        mContext = context;
    }
}
