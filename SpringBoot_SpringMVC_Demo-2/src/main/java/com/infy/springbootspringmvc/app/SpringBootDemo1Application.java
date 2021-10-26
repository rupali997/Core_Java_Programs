package com.infy.springbootspringmvc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.infy.springbootspringmvc.app")
public class SpringBootDemo1Application {

	public static void main(String[] args) {
		System.out.println("Hello World");
		SpringApplication.run(SpringBootDemo1Application.class, args);
	}

}
