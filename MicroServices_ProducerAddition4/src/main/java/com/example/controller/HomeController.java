package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/ga/{a}/{b}")
	public String addition(@PathVariable int a,@PathVariable int b) {
		return "Addition is : "+(a+b);
		
	}
}
