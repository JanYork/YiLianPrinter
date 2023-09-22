package com.yilianyun.printer.constant;

/**
 * <p>
 * 详细见 <a href="https://www.kancloud.cn/ly6886/oauth-api/3170305">易联云开发文档</a>
 * </p>
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2023/09/22
 * @description 易联云授权常量
 * @since 1.0.0
 */
public class YiLianConstant {
    /**
     * access_token 失效时间 30天（Oauth）
     */
    public static final int ACCESS_TOKEN_EXPIRE = 2592000;
    /**
     * refresh_token 失效时间 35天（Oauth）
     */
    public static final int REFRESH_TOKEN_EXPIRE = 2678400;
    /**
     * machine_code 每日获取次数限制
     */
    public static final int MACHINE_CODE_LIMIT = 20;
    /**
     * 接口请求正确返回码
     */
    public static final int OK_CODE = 0;
}
