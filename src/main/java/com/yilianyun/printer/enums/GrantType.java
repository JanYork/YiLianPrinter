package com.yilianyun.printer.enums;

import lombok.Getter;

/**
 * @author JanYork
 * @version 1.0.0
 * @date 2023/09/22
 * @description 易联云GrantType枚举，详细见易联云文档
 * @since 1.0.0
 */
@Getter
public enum GrantType {
    /**
     * authorization_code
     */
    AUTHORIZATION_CODE("authorization_code"),
    /**
     * client_credentials
     */
    CLIENT_CREDENTIALS("client_credentials");

    private final String value;

    GrantType(String value) {
        this.value = value;
    }
}
