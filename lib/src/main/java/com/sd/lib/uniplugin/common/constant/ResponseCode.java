package com.sd.lib.uniplugin.common.constant;

public class ResponseCode
{
    /**
     * 正常状态
     */
    public static final int OK = 0;

    /**
     * 唯一识别码
     */
    public static final int UUID = 100;

    /**
     * 未初始化
     */
    public static final int NOT_INIT = 1000;
    /**
     * 初始化失败
     */
    public static final int INIT_FAILED = 1001;
    /**
     * 内部错误
     */
    public static final int INTERNAL_ERROR = 1002;

    /**
     * 参数不合法
     */
    public static final int PARAM_ILLEGAL = 2000;
    /**
     * 参数为空，或者缺少参数
     */
    public static final int PARAM_MISSING = 2001;

    /**
     * SDK错误
     */
    public static final int SDK_ERROR = 10000;
    /**
     * SDK返回数据为空
     */
    public static final int SDK_ERROR_EMPTY_RESULT = 10001;
}
