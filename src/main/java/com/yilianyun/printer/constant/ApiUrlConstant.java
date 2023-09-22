package com.yilianyun.printer.constant;

/**
 * @author JanYork
 * @version 1.0.0
 * @date 2023/09/22
 * @description 接口地址常量
 * @since 1.0.0
 */
public class ApiUrlConstant {
    /**
     * 获取商户CODE
     */
    public static final String OAUTH_AUTHORIZE = "/oauth/authorize";
    /**
     * 获取商户TOKEN（自有，Oauth）
     */
    public static final String OAUTH_TOKEN = "/oauth/oauth";
    /**
     * 获取商户TOKEN（开放）
     */
    public static final String OAUTH_TOKEN_OPEN = "/oauth/scancodemodel";
    /**
     * 刷新商户TOKEN
     */
    public static final String OAUTH_REFRESH_TOKEN = "/oauth/oauth";
}
