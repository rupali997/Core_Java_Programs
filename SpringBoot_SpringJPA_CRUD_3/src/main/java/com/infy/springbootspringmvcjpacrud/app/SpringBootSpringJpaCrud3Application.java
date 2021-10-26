package com.infy.springbootspringmvcjpacrud.app;

import org.apache.catalina.security.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan("com.infy.springbootspringmvcjpacrud.app")
@EnableJpaRepositories(basePackages = { "com.infy.springbootspringmvcjpacrud.app" })
@Import(SecurityConfig.class)
public class SpringBootSpringJpaCrud3Application {

	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(SpringBootSpringJpaCrud3Application.class, args);
	}

}
