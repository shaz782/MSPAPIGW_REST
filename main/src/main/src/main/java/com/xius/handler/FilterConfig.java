package com.xius.handler;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

	 @Bean
	   public FilterRegistrationBean abcFilter() {
		   FilterRegistrationBean filterRegBean = new FilterRegistrationBean();
		   filterRegBean.setFilter(new RequestResponseLogFilter());
		   filterRegBean.addUrlPatterns("/MSP/API/*");
		   filterRegBean.addUrlPatterns("/API/*");
		   filterRegBean.addUrlPatterns("/Notification/*");
		   return filterRegBean;
	   }
}
