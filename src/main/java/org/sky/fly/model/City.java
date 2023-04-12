package org.sky.fly.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@TableName("city")
public class City implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @TableId("id")
    Integer id;

    @TableField("name")
    String name;

    @TableField("district")
    String district;

    @TableField("countrycode")
    String code;

    @TableField("population")
    Integer population;

}
