package com.chengzejun.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket createResApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                   .apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.basePackage("com.chengzejun.user.controller"))
                    .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("springCloud的swagger接口文档")
                .description("简单优雅的restful")
                .termsOfServiceUrl("http://www.chengzejun.com")
                .version("1.0")
                .build();
    }
}
