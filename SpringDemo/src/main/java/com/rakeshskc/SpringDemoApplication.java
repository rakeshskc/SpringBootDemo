package com.rakeshskc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans({ 
				  @ComponentScan(basePackages = "com.rakeshskc.config"),
				  @ComponentScan(basePackages = "com.rakeshskc.controller"),
				  @ComponentScan(basePackages = "com.rakeshskc.interceptor")
			    })

public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}
