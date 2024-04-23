package org.sky.fly.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * city entity class
 *
 * @author skyclouds2001
 * @version 1.0.0
 * @since 1.0.0
 */
@Schema(description = "城市")
@AllArgsConstructor
@Data
@NoArgsConstructor
@TableName("city")
public class City implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "城市ID", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(description = "城市名称", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    @TableField("name")
    @NotBlank(message = "city name is required")
    private String name;

    @Schema(description = "城市所属地区名称", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    @TableField("district")
    @NotBlank(message = "city district is required")
    private String district;

    @Schema(description = "城市所属国家名称", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    @TableField("country")
    @NotBlank(message = "city country is required")
    private String country;

    @Schema(description = "城市人口", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    @TableField("population")
    @Min(value = 0, message = "city population must be an positive integer")
    @Max(value = Integer.MAX_VALUE, message = "city population must not be an too big integer")
    private Integer population;

    @TableField(value="create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(value="update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    @TableLogic
    private Integer deleted;

    @Version
    private Integer version;

}
