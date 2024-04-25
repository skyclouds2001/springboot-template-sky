package org.sky.fly.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

/**
 * request response result class
 *
 * @author skyclouds2001
 * @version 1.1.0
 * @since 1.0.0
 */
@Schema(description = "结果返回对象")
@Builder
@Data
public class Result<T> {

    @Schema(description = "状态", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private Boolean success;

    @Schema(description = "状态码", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private Integer code;

    @Schema(description = "状态信息", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String message;

    @Schema(description = "返回数据", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private T data;

    public static<T> Result<T> ok() {
        return Result.ok(null, Code.SUCCESS);
    }

    public static<T> Result<T> ok(T data) {
        return Result.ok(data, Code.SUCCESS);
    }

    public static<T> Result<T> ok(Code c) {
        return Result.ok(null, c);
    }

    public static<T> Result<T> ok(T data, Code c) {
        boolean success = c.getSuccess();
        int code = c.getCode();
        String message = c.getMessage();
        return Result.<T>builder().data(data).success(success).code(code).message(message).build();
    }

    public static<T> Result<T> fail() {
        return Result.fail(null, Code.FAIL);
    }

    public static<T> Result<T> fail(T data) {
        return Result.fail(data, Code.FAIL);
    }

    public static<T> Result<T> fail(Code c) {
        return Result.fail(null, c);
    }

    public static<T> Result<T> fail(T data, Code c) {
        boolean success = c.getSuccess();
        int code = c.getCode();
        String message = c.getMessage();
        return Result.<T>builder().data(data).success(success).code(code).message(message).build();
    }

}
