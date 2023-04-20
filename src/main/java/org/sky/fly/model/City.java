package org.sky.fly.model;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

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
    private String name;

    @Schema(description = "城市所属地区名称", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    @TableField("district")
    private String district;

    @Schema(description = "城市所属国家名称", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    @TableField("country")
    private String country;

    @Schema(description = "城市人口", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    @TableField("population")
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
