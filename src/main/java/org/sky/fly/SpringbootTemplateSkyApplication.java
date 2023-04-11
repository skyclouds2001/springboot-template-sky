package org.sky.fly;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.sky.fly.mapper")
public class SpringbootTemplateSkyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTemplateSkyApplication.class, args);
    }

}