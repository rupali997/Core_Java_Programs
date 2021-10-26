package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WebServicesConsumerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebServicesConsumerAppApplication.class, args);
	}

	@Bean
	public RestTemplate restTemp() {
		RestTemplate rt = new RestTemplate();
		return rt;
	}
}
