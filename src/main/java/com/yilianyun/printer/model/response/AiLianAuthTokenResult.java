package com.yilianyun.printer.model.response;

import lombok.Data;

/**
 * @author JanYork
 * @version 1.0.0
 * @date 2023/09/22
 * @description 易联云获取授权TOKEN结果模型（与刷新TOKEN结果模型相同）
 * @since 1.0.0
 */
@Data
public class AiLianAuthTokenResult {
    /**
     * 应用ID
     */
    private String clientId;
    /**
     * 授权凭证
     */
    private String accessToken;
    /**
     * 刷新凭证
     */
    private String refreshToken;
    /**
     * 终端号
     */
    private String machineCode;
    /**
     * 调用凭证有效时间（秒）
     */
    private String expiresIn;
    /**
     * 刷新凭证有效时间（秒）
     */
    private String refreshExpiresIn;
    /**
     * 权限范围
     */
    private String scope;
}
