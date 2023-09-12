package com.amdocs.commonality.ddu.learning.standalone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"com.amdocs.commonality.ddu.learning.standalone.controller"})
@ComponentScan(basePackages={"com.amdocs.commonality.ddu.learning.standalone.service"})

@SpringBootApplication
public class StandaloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(StandaloneApplication.class, args);
		System.out.println("Hello Preetham");
	}

}
