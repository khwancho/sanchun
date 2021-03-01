package com.mjbc.sanchun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;

@Configuration
@EnableSwagger2
//@EnableSwagger2WebFlux

public class SwaggerConfig {

//    private ApiInfo apiInfo() {
//
//        return new ApiInfoBuilder()
//                .title("sanchun")
//                .description("sanchun api")
//                .build();
//    }

//    @Bean
//    public Docket commonApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("webFlux")
//                .apiInfo(this.apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors
//                        .basePackage("com.mjbc.sanchun"))
//                .paths(PathSelectors.ant("/api/v1/**"))
//                .build();
//    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

//    @Bean
//    public Docket commonApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("common")
//                .apiInfo(this.apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors
//                        .basePackage("com.mjbc.sanchun"))
//                .paths(PathSelectors.ant("/api/v2/**"))
//                .build();
//    }

}