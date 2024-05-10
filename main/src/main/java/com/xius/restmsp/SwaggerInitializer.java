package com.xius.restmsp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
	
	@Configuration
	@EnableSwagger2
	public class SwaggerInitializer{

	        @Bean
		    @Profile("prod")
		    public Docket produceApi(){
		    return new Docket(DocumentationType.SWAGGER_2)
		    .groupName("MSPAPIGW-APIs")
		    .apiInfo(apiInfo())
		    .enable(false)
		    .select()
		    .apis(RequestHandlerSelectors.basePackage("com.xius.rmsp.controler"))
		    .paths(paths())
		    .build();
		
		}
	    
	    @Bean
	    @Profile("dev")
	    public Docket produceApiForDev(){
	    return new Docket(DocumentationType.SWAGGER_2)
	    .groupName("MSPAPIGW-APIs")
	    .apiInfo(apiInfo())
	    .enable(true)
	    .select()
	    .apis(RequestHandlerSelectors.basePackage("com.xius.rmsp.controler"))
	    .paths(paths())
	    .build();

	}
	    
	// Describe your apis

	@SuppressWarnings("deprecation")
	private ApiInfo apiInfo() {

	    return new ApiInfoBuilder()

	    .title("MSP-API-GW")
	    .description("Following are the list of MSP-API-GW of Apis.")
	    .termsOfServiceUrl("https://www.xius.com")
		.contact("XIUS-MSP").license("https://www.xius.com/")
	    .version("1.0-SNAPSHOT")
	    .licenseUrl("https://www.xius.com/")
	    .build();

	}

	// Only select apis that matches the given Predicates.

	private Predicate<String> paths() {

	// Match all paths except /error

	    return Predicates.and(
	    PathSelectors.any(),
	    Predicates.not(PathSelectors.regex("/error.*"))
	    );

	    }

	}

