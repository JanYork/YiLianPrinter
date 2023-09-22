package com.yilianyun.printer.utils;

import java.util.UUID;

/**
 * @author JanYork
 * @version 1.0.0
 * @date 2023/09/22
 * @description ID工具类
 * @since 1.0.0
 */
public class IdUtil {
    /**
     * 获取易联云UUID
     * @return {@link String} UUID
     */
    public static String getYiLianUUID() {
        return UUID.randomUUID().toString();
    }
}
