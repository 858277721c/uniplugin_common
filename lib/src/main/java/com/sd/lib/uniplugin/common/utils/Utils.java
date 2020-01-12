package com.sd.lib.uniplugin.common.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

import java.util.UUID;

public class Utils
{
    private static final Handler HANDLER = new Handler(Looper.getMainLooper());

    private Utils()
    {
    }

    public static void runOnUiThread(Runnable runnable)
    {
        if (Looper.myLooper() == Looper.getMainLooper())
            runnable.run();
        else
            HANDLER.post(runnable);
    }

    public static int getScreenWidth(Context context)
    {
        if (context == null)
            return 0;
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int getScreenHeight(Context context)
    {
        if (context == null)
            return 0;
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int dp2px(Context context, float dp)
    {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }

    public static int px2dp(Context context, float px)
    {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (px / scale + 0.5f);
    }

    public static String randomUUID()
    {
        return UUID.randomUUID().toString();
    }
}
