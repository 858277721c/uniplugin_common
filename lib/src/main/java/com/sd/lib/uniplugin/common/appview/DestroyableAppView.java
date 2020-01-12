package com.sd.lib.uniplugin.common.appview;

import android.content.Context;
import android.util.AttributeSet;

public class DestroyableAppView extends BaseAppView
{
    private boolean mIsDestroyed = false;

    public DestroyableAppView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    @Override
    public void attach()
    {
        if (mIsDestroyed)
            return;

        super.attach();
    }

    /**
     * 销毁
     */
    public final void destroy()
    {
        if (!mIsDestroyed)
        {
            mIsDestroyed = true;
            onDestroy();
            detach();
        }
    }

    protected void onDestroy()
    {
    }
}
