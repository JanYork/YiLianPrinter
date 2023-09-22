package com.yilianyun.printer.model.request;

import com.yilianyun.printer.enums.GrantType;
import lombok.Data;

/**
 * @author JanYork
 * @version 1.0.0
 * @date 2023/09/22
 * @description 易联云获取授权TOKEN模型
 * @since 1.0.0
 */
@Data
public class YiLianAuthTokenModel {
    /**
     * 应用ID
     */
    private String clientId;
    /**
     * 授权类型
     */
    private String grantType = "authorization_code";
    /**
     * 签名
     */
    private String sign;
    /**
     * 权限范围
     */
    private String scope = "all";
    /**
     * 时间戳（秒）
     */
    private String timestamp;
    /**
     * 请求唯一标识码
     */
    private String id;
    /**
     * 终端号的授权码
     */
    private String code;

    /**
     * 切换授权类型
     *
     * @param type 授权类型枚举
     */
    public void switchGrantType(GrantType type) {
        this.grantType = type.getValue();
    }
}
