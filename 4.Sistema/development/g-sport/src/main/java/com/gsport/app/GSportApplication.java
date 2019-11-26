package com.gsport.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.gsport.controllers"})
public class GSportApplication {

	public static void main(String[] args) {
		SpringApplication.run(GSportApplication.class, args);
	}

}