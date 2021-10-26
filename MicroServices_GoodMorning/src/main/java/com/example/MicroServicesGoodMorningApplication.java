package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroServicesGoodMorningApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesGoodMorningApplication.class, args);
	}

}
