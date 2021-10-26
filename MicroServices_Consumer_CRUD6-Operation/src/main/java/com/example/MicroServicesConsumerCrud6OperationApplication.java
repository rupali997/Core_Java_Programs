package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MicroServicesConsumerCrud6OperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesConsumerCrud6OperationApplication.class, args);
	}

	
}
