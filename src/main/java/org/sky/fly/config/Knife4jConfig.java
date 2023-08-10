package org.sky.fly.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * knife4j configuration class
 *
 * @author skyclouds2001
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
@Configuration
@EnableKnife4j
public class Knife4jConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("SpringBootTemplateSky接口文档")
                        .version("1.0-SNAPSHOT")
                        .description("springboot template project api document by sky")
                        .termsOfService("https://skyclouds2001.github.io/")
                        .contact(new Contact()
                                .name("skyclouds2001")
                                .email("skyclouds2001@163.com")
                                .url("https://github.com/skyclouds2001/")
                        )
                        .license(new License()
                                .name("MIT")
                                .url("https://mit-license.org/")
                        ));
    }

}
