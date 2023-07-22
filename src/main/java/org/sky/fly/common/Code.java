package org.sky.fly.common;

import lombok.Getter;

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
