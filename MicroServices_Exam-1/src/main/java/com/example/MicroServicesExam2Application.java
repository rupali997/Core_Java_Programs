package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroServicesExam2Application {

	public static void main(String[] args) {
		System.out.println("In Exam client!!");
		SpringApplication.run(MicroServicesExam2Application.class, args);
	}

}
