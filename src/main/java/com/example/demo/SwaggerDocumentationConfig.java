package com.example.demo;


import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;

@Configuration
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Anshi")
                .description("")
                .license("")
                .licenseUrl("")
                .termsOfServiceUrl("")
                .version("4.0.0")
                .contact(new Contact("", "", ""))
                .build();
    }
}