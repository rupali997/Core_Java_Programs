package com.infy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MicroServicesProducerUpdateCrud7OperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesProducerUpdateCrud7OperationApplication.class, args);
	}

}
