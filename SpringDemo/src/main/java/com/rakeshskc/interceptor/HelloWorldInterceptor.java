package com.rakeshskc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class HelloWorldInterceptor implements HandlerInterceptor {

	private Logger logger = LoggerFactory.getLogger(HelloWorldInterceptor.class);

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response) {
		logger.debug("Inside Interceptor");
		return true; 
	}

}
