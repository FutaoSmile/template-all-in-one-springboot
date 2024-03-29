package com.up.study.message.board.framework.util;

import lombok.experimental.UtilityClass;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Optional;

/**
 * @author fish_temp_author
 * @since fish_temp_since
 */
@UtilityClass
public class HttpContextHolder {

    /**
     * 获取请求
     *
     * @return 请求
     */
    public Optional<ServletRequestAttributes> getRequest() {
        return Optional.ofNullable(((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()));
    }

    /**
     * 获取响应
     *
     * @return 响应
     */
    public Optional<ServletRequestAttributes> getResponse() {
        return Optional.ofNullable(((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()));
    }

}
