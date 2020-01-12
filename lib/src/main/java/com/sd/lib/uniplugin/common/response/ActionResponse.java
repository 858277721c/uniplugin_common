package com.sd.lib.uniplugin.common.response;

public class ActionResponse extends JSResponse
{
    private final String action;

    public ActionResponse(String action)
    {
        this.action = action;
    }

    public String getAction()
    {
        return action;
    }
}
