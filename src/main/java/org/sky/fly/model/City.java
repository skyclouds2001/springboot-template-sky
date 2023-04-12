package org.sky.fly.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Schema(description = "城市")
@Data
@TableName("city")
public class City implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "城市ID", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    @TableId("id")
    Integer id;

    @Schema(description = "城市名称", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    @TableField("name")
    String name;

    @Schema(description = "城市所属地区名称", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    @TableField("district")
    String district;

    @Schema(description = "城市所属国家编码", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    @TableField("countrycode")
    String code;

    @Schema(description = "城市人口", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    @TableField("population")
    Integer population;

}
