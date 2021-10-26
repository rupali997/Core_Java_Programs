package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
	
	@Autowired
	RestTemplate rt;
	
	@GetMapping("data/{action}/{a}/{b}")
	public String getData(@PathVariable int a,@PathVariable int b,@PathVariable String action) {
		
		String s=null;
		
		if("add".equals(action)) {
			
			s = rt.getForObject("http://desktop-gk9nfif:7777/getga/ga/"+a+"/"+b+"", String.class);
			
		}
		else if("sub".equals(action)) {
			s = rt.getForObject("http://desktop-gk9nfif:7777/getgs/gs/"+a+"/"+b+"", String.class);

		}
		else if("mul".equals(action)) {
			s = rt.getForObject("http://desktop-gk9nfif:7777/getgm/gm/"+a+"/"+b+"", String.class);

		}
		else if("div".equals(action)) {
			s = rt.getForObject("http://desktop-gk9nfif:7777/getgd/gd/"+a+"/"+b+"", String.class);

		}
		return s;
	}

}
