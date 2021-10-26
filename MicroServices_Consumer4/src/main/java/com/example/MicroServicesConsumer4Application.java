package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableEurekaClient
@SpringBootApplication
public class MicroServicesConsumer4Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesConsumer4Application.class, args);
	}

	@LoadBalanced
	@Bean
	public RestTemplate rt() {
		return new RestTemplate();
	}
}
