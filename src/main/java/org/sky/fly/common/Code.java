package org.sky.fly.common;

import lombok.Getter;

/**
 * code enum
 *
 * @author skyclouds2001
 * @version 1.1.0
 * @since 1.0.0
 */
@Getter
public enum Code {

    SUCCESS(true, 0,"成功"),
    FAIL(false, 1, "失败");

    private final Boolean success;

    private final Integer code;

    private final String message;

    Code(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

}
