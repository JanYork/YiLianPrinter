package com.yilianyun.printer.model.request;

import lombok.Data;

/**
 * @author JanYork
 * @version 1.0.0
 * @date 2023/09/22
 * @description 易联云获取授权TOKEN模型（开放模式）
 * @since 1.0.0
 */
@Data
public class YiLianQrCodeAuthTokenModel {
    /**
     * 应用ID
     */
    private String clientId;
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
     * 终端号
     */
    private String machineCode;
    /**
     * 终端密钥，非必填
     */
    private String msign;
    /**
     * 终端临时密钥，非必填
     */
    private String qrKey;
}
