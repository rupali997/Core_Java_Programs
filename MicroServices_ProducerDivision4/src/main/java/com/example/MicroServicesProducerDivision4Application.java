package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MicroServicesProducerDivision4Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesProducerDivision4Application.class, args);
	}

}
