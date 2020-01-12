package com.sd.lib.uniplugin.common.callback;

public abstract class BaseJSCallback implements IJSCallback
{
    @Override
    public final void response(Object object)
    {
        response(object, false);
    }

    @Override
    public final void response(Object object, boolean keepAlive)
    {
        responseImpl(object, keepAlive);
    }

    protected abstract void responseImpl(Object object, boolean keepAlive);
}
