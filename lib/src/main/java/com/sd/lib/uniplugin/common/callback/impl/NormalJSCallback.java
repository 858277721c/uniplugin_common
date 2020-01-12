package com.sd.lib.uniplugin.common.callback.impl;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;

import com.sd.lib.uniplugin.common.callback.BaseJSCallback;
import com.sd.lib.uniplugin.common.utils.JsonUtils;

public class NormalJSCallback extends BaseJSCallback
{
    private final WebView mWebView;
    private final String mJSMethod;

    public NormalJSCallback(WebView webView, String jsMethod)
    {
        mWebView = webView;
        mJSMethod = jsMethod;
    }

    @Override
    protected void responseImpl(Object object, boolean keepAlive)
    {
        final String json = JsonUtils.objectToJson(object);
        loadJsFunction(mJSMethod + "_callback", json);
    }

    /**
     * 调用js函数
     *
     * @param function js函数名称
     * @param params   参数
     */
    private void loadJsFunction(String function, Object... params)
    {
        loadJsFunction(buildJsFunctionString(function, params));
    }

    /**
     * 调用js函数
     *
     * @param js
     */
    private void loadJsFunction(String js)
    {
        if (TextUtils.isEmpty(js))
            return;

        if (Build.VERSION.SDK_INT >= 19)
        {
            mWebView.evaluateJavascript(js, new ValueCallback<String>()
            {
                @Override
                public void onReceiveValue(String arg0)
                {
                }
            });
        } else
        {
            mWebView.loadUrl("javascript:" + js);
        }
    }

    private static String buildJsFunctionString(String function, Object... params)
    {
        if (TextUtils.isEmpty(function))
            return "";

        final StringBuilder sb = new StringBuilder(function);
        sb.append("(");
        if (params != null && params.length > 0)
        {
            for (Object item : params)
            {
                if (item instanceof String)
                {
                    sb.append("'").append(String.valueOf(item)).append("'");
                } else
                {
                    sb.append(String.valueOf(item));
                }
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
        }
        sb.append(")");
        return sb.toString();
    }
}
