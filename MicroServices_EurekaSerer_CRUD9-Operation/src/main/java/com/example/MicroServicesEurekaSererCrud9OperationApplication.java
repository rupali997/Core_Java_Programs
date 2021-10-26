package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class MicroServicesEurekaSererCrud9OperationApplication {

	public static void main(String[] args) {
		System.out.println("Operation CRUD-9 start!!!");
		SpringApplication.run(MicroServicesEurekaSererCrud9OperationApplication.class, args);
	}

}
