package com.sd.lib.uniplugin.common.response;

import com.sd.lib.uniplugin.common.constant.ResponseCode;

public class UUIDResponse extends JSResponse
{
    private final String uuid;

    public UUIDResponse(String uuid)
    {
        super(ResponseCode.UUID);
        this.uuid = uuid;
    }

    public String getUuid()
    {
        return uuid;
    }
}
