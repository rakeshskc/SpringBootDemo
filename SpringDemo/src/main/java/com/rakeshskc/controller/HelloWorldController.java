package com.rakeshskc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rakeshskc.model.ResponsePayload;

@RestController
@RequestMapping("api/v/service")
public class HelloWorldController {

	private static Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
	
	@GetMapping(path = "/test")
	public @ResponseBody ResponsePayload test() {
		logger.debug("Calling controller");
		return new ResponsePayload("success",HttpStatus.OK.toString());
	}
	
	
}
