package com.example.p4pay.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
				.apiInfo(apiInfo()).select().paths(postPaths()).build();
	}

	private Predicate<String> postPaths() {
		return or(regex("/api/auth.*"), regex("/api.*"));
	}

	
	//url:http://localhost:8080/swagger-ui.html
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Prowise API")
				.description("P4 Pay API reference for developers")
				.termsOfServiceUrl("http://POC.com")
				.contact("leelakrishnacce2018@gmail.com").license("@P4pay 2019 ")
				.licenseUrl("https://www.p4pay.com/").version("1.0").build();
	}


}
