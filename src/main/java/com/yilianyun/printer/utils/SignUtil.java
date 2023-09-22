package com.yilianyun.printer.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author JanYork
 * @version 1.0.0
 * @date 2023/09/22
 * @description 签名工具类
 * @since 1.0.0
 */
public class SignUtil {
    /**
     * @param clientId     客户端ID
     * @param clientSecret 客户端密钥
     * @param timestamp    时间戳
     * @return {@link String} 签名
     */
    public static String getSign(String clientId, String clientSecret, String timestamp) {
        String sign = clientId + timestamp + clientSecret;
        return DigestUtils.md5Hex(sign);
    }

    /**
     * @param clientId     客户端ID
     * @param clientSecret 客户端密钥
     * @return {@link String} 签名
     */
    public static String getSign(String clientId, String clientSecret) {
        String timestamp = String.valueOf(System.currentTimeMillis());
        String sign = clientId + timestamp + clientSecret;
        return DigestUtils.md5Hex(sign);
    }
}
