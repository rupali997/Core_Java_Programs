package com.infy.springbootspringmvcjpacrud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan
@EnableJpaRepositories
@SpringBootApplication
public class SpringBootSpringJpaCrud2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSpringJpaCrud2Application.class, args);
	}

}
