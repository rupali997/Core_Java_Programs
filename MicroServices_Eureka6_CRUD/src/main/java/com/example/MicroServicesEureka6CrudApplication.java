package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroServicesEureka6CrudApplication {

	public static void main(String[] args) {
		System.out.println("Eureka start!");
		SpringApplication.run(MicroServicesEureka6CrudApplication.class, args);
	}

}
