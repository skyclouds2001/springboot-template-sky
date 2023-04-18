package org.sky.fly.exception;

import lombok.Getter;
import org.sky.fly.result.Code;

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
