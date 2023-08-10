package org.sky.fly.exception;

import lombok.Getter;
import org.sky.fly.common.Code;

/**
 * custom exception class
 *
 * @author skyclouds2001
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
@Getter
public class CustomException extends RuntimeException {

    protected Code code = Code.FAIL;

    public CustomException() {
        super();
    }

    public CustomException(Code code) {
        super(code.getMessage());
        this.code = code;
    }

}
