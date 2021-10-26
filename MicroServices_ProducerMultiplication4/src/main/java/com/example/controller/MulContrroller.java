package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MulContrroller {

	@GetMapping("/gm/{a}/{b}")
	public String multiplication(@PathVariable int a,@PathVariable int b) {
		return "Multiplication is : "+(a*b);
		
	}
}
