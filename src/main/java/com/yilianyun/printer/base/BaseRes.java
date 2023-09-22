package com.yilianyun.printer.base;

import com.yilianyun.printer.constant.YiLianConstant;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author JanYork
 * @version 1.0.0
 * @date 2023/09/22
 * @description 基础响应类
 * @since 1.0.0
 */
@Data
@Slf4j
public class BaseRes {
    /**
     * 成功0，其他为异常
     */
    private int error;
    /**
     * 提示信息
     */
    private String errorDescription;
    /**
     * 时间戳
     */
    private int timestamp;
    /**
     * 数据，json格式
     */
    private String body;

    /**
     * 判断是否成功
     *
     * @return boolean 是否成功
     */
    public boolean isOk() {
        return error == YiLianConstant.OK_CODE;
    }

    /**
     * 判断是否成功，并记录错误信息
     *
     * @return boolean 是否成功
     */
    public boolean isOkAndLogError() {
        boolean isOk = isOk();
        if (!isOk) {
            String errorDescription = this.errorDescription == null ? "未知错误" : this.errorDescription;
            log.error(errorDescription);
        }
        return isOk;
    }

    /**
     * @param clazz Class
     * @return {@link T} 对象
     */
    public <T> T convert(Class<T> clazz) {
        // TODO: 2023/09/22 JSON转化为对象，蛇形转驼峰
        return null;
    }
}
