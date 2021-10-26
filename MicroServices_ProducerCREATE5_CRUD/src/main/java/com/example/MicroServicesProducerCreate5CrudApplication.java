package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MicroServicesProducerCreate5CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesProducerCreate5CrudApplication.class, args);
	}

}
