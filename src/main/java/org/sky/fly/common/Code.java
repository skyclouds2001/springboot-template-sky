package org.sky.fly.common;

import lombok.Getter;

/**
 * code enum
 *
 * @author skyclouds2001
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
@Getter
public enum Code {

    SUCCESS(0,"成功"),
    FAIL(1, "失败");

    private final Integer code;

    private final String message;

    Code(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
