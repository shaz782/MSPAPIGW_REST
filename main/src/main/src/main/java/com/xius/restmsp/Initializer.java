package com.xius.restmsp;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan("com")
public class Initializer {
	
	private static final Logger LOGGER = LogManager.getLogger(Initializer.class);

	public static void main(String[] args) {
		LOGGER.info("Appication Intiation Started.");
		SpringApplication.run(Initializer.class, args);
	}

	public static Properties getErrorDetails() {
		Properties errorProps = new Properties();
		try {
			errorProps.load(new FileInputStream("config/ErrorDetails.properties"));
		} catch (Exception e) {
			LOGGER.error("getErrorDetails Exception :" + e);
		}
		return errorProps;
	}

}
