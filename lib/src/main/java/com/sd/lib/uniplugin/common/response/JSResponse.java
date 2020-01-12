package com.sd.lib.uniplugin.common.response;

import com.sd.lib.uniplugin.common.constant.ResponseCode;

public class JSResponse
{
    private final int code;
    private final String codeMsg;

    public JSResponse()
    {
        this(ResponseCode.OK);
    }

    public JSResponse(int code)
    {
        this(code, null);
    }

    public JSResponse(int code, String codeMsg)
    {
        this.code = code;
        this.codeMsg = codeMsg;
    }

    public int getCode()
    {
        return code;
    }

    public String getCodeMsg()
    {
        return codeMsg;
    }
}
