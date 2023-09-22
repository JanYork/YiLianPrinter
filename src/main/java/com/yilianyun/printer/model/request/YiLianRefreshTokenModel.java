package com.yilianyun.printer.model.request;

import lombok.Data;

/**
 * @author JanYork
 * @version 1.0.0
 * @date 2023/09/22
 * @description 易联云刷新授权TOKEN模型
 * @since 1.0.0
 */
@Data
public class YiLianRefreshTokenModel {
    /**
     * 应用ID
     */
    private String clientId;
    /**
     * 刷新凭证
     */
    private String refreshToken;
    /**
     * 签名
     */
    private String sign;
    /**
     * 权限范围，默认值all
     */
    private String scope;
    /**
     * 时间戳（秒）
     */
    private Integer timestamp;
    /**
     * 请求唯一标识码
     */
    private String id;
    /**
     * 应用密钥
     */
    private String clientSecret;
}
