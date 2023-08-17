package org.sky.fly.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * request response result class
 *
 * @author skyclouds2001
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
@Schema(description = "结果返回对象")
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

    private Result() {}

    public static <T> Result<T> build(T data, Code code) {
        return new Result<T>().data(data).code(code);
    }

    public static<T> Result<T> ok() {
        return ok(null);
    }

    public static<T> Result<T> ok(T data) {
        return build(data, Code.SUCCESS);
    }

    public static<T> Result<T> fail() {
        return fail(null);
    }

    public static<T> Result<T> fail(T data) {
        return build(data, Code.FAIL);
    }

    public Result<T> data(T data) {
        this.setData(data);
        return this;
    }

    public Result<T> code(Code code) {
        this.setSuccess(code.getSuccess());
        this.setCode(code.getCode());
        this.setMessage(code.getMessage());
        return this;
    }

}
