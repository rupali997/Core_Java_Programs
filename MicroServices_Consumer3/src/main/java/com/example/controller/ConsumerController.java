package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
	
	@Autowired
	RestTemplate rt;

	@GetMapping("/getConsumerData")
	public List getData() {
		
		//return rt.getForObject("http://localhost:9091/getProduceData", List.class); 
		
		return rt.getForObject("http://desktop-gk9nfif:7777/getprod/getProduceData",List.class);
	}
}
