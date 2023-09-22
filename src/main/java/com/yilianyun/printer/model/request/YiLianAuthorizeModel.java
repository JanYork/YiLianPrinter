package com.yilianyun.printer.model.request;

import lombok.Data;

/**
 * @author JanYork
 * @version 1.0.0
 * @date 2023/09/22
 * @description 易联云获取授权CODE模型
 * @since 1.0.0
 */
@Data
public class YiLianAuthorizeModel {
    /**
     * 易联云颁发给开发者的应用ID
     */
    private String clientId;
    /**
     * 授权类型，固定参数为“code”，表示授权码模式
     */
    private String responseType;
    /**
     * 开发者自身的回调地址 (需要url encode)
     */
    private String redirectUri;
    /**
     * 用于保持请求和回调的状态，在回调时，会回传该参数。<br>
     * 开发者可以用这个参数验证请求有效性，也可以记录用户请求授权页前的位置。可防止CSRF攻击
     */
    private String state;
}
