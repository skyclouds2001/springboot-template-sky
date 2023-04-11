package org.sky.fly.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("city")
public class City {

    @TableId("id")
    int id;

    @TableField("name")
    String name;

    @TableField("district")
    String district;

    @TableField("countrycode")
    String code;

    @TableField("population")
    int population;

}
