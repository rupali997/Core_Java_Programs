package com.infy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroServicesProducerCreateCrud7OperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesProducerCreateCrud7OperationApplication.class, args);
	}

}
