package com.infy.springbootjparestapicrud.app;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WebServicesConsumerApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(WebServicesConsumerApp2Application.class, args);
	}

	@Bean
	public RestTemplate restTemp() {
		return new RestTemplate();
	}
}
