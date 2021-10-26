package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroServicesUiCrud6OperationApplication {

	public static void main(String[] args) {
		System.out.println("This is UI!");
		SpringApplication.run(MicroServicesUiCrud6OperationApplication.class, args);
	}

}
