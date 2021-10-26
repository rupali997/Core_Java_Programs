package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroServicesDemo1Application {

	public static void main(String[] args) {
		System.out.println("Hello this is eureka server!!");
		SpringApplication.run(MicroServicesDemo1Application.class, args);
	}

}
