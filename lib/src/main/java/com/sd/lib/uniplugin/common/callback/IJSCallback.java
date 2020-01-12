package com.sd.lib.uniplugin.common.callback;

public interface IJSCallback
{
    void response(Object object);

    void response(Object object, boolean keepAlive);
}
