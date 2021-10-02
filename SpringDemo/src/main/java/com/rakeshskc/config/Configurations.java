package com.rakeshskc.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.rakeshskc.interceptor.HelloWorldInterceptor;

@Configuration
public class Configurations implements WebMvcConfigurer {

	Logger logger = LoggerFactory.getLogger(Configurations.class);

	@Autowired
	HelloWorldInterceptor helloWorldInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		logger.info("Configure Interceptor");
		registry.addInterceptor(helloWorldInterceptor);
	}

}
