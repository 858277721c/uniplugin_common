package com.sd.lib.uniplugin.common.response;

public class DataResponse<T> extends JSResponse
{
    private final T data;

    public DataResponse(T data)
    {
        this.data = data;
    }

    public T getData()
    {
        return data;
    }
}
