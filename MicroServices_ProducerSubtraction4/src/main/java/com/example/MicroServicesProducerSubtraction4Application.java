package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MicroServicesProducerSubtraction4Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesProducerSubtraction4Application.class, args);
	}

}
