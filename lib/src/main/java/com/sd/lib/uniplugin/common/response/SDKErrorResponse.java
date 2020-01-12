package com.sd.lib.uniplugin.common.response;

import com.sd.lib.uniplugin.common.constant.ResponseCode;

/**
 * sdk错误应答
 */
public class SDKErrorResponse extends JSResponse
{
    private final String sdkCode;
    private final String sdkMsg;

    public SDKErrorResponse(String sdkCode, String sdkMsg)
    {
        super(ResponseCode.SDK_ERROR);
        this.sdkCode = sdkCode;
        this.sdkMsg = sdkMsg;
    }

    public String getSdkCode()
    {
        return sdkCode;
    }

    public String getSdkMsg()
    {
        return sdkMsg;
    }
}
