package com.sd.lib.uniplugin.common.response;

import com.sd.lib.uniplugin.common.constant.ResponseCode;

public class SDKErrorEmptyResultResponse extends JSResponse
{
    public SDKErrorEmptyResultResponse()
    {
        super(ResponseCode.SDK_ERROR_EMPTY_RESULT);
    }
}
