package com.sd.lib.uniplugin.common.appview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

public class BaseAppView extends FrameLayout
{
    private ViewGroup mContainer;

    public BaseAppView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public final void setContainer(ViewGroup container)
    {
        mContainer = container;
    }

    /**
     * 将广告添加到ui上
     */
    public void attach()
    {
        final ViewGroup container = mContainer;
        if (container == null)
            return;

        if (container == getParent())
            return;

        detach();
        container.addView(this);
    }

    /**
     * 移除广告view
     */
    public void detach()
    {
        final ViewParent viewParent = getParent();
        if (viewParent != null)
        {
            try
            {
                ((ViewGroup) viewParent).removeView(this);
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
