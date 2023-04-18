package org.sky.fly.exception;

import lombok.extern.slf4j.Slf4j;
import org.sky.fly.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result<?> defaultExceptionHandler(Exception e) {
        log.error("[Exception]", e);
        return Result.fail();
    }

    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public Result<?> customExceptionHandler(CustomException e) {
        log.error("[Custom Exception]", e);
        return Result.build(null, e.getCode());
    }

}
