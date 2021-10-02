package com.rakeshskc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.rakeshskc.interceptor.HelloWorldInterceptor;

@Configuration
public class Configurations implements WebMvcConfigurer     {

	@Autowired 
	HelloWorldInterceptor helloWorldInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	        registry.addInterceptor(helloWorldInterceptor).addPathPatterns("/");
	}
	
}
