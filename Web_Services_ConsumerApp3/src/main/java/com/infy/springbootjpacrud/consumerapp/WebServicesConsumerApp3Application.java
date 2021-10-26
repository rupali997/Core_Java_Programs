package com.infy.springbootjpacrud.consumerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WebServicesConsumerApp3Application {

	public static void main(String[] args) {
		System.out.println("This is WS UI Application");
		SpringApplication.run(WebServicesConsumerApp3Application.class, args);
	}

	@Bean
	public RestTemplate restTemp() {
		return new RestTemplate();
	}
}
