package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroServicesAdmission1Application {

	public static void main(String[] args) {
		System.out.println("In admission client!");
		SpringApplication.run(MicroServicesAdmission1Application.class, args);
	}

}
