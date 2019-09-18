package com.p2p.yk.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
//开启swagger2
@EnableSwagger2
public class MySwaggerConfig {

	//配置swagger的Docket实例
	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.enable(true)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.p2p.yk.controller"))
				.build();
	}
	
	//配置ApiInfo信息
	public ApiInfo apiInfo() {
		
		//作者信息
		Contact contact=new Contact("姚奎", "", "m18374903481@163.com"); 
		
		return new ApiInfo(
				"姚奎的API文档",
				"文档描述",
				"1.0",
				"",
				contact,
		        "Apache 2.0",
		        "http://www.apache.org/licenses/LICENSE-2.0",
		        new ArrayList<>()
		);
	}
	
}
