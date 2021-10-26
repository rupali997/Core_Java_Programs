package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubController {

	@GetMapping("/gs/{a}/{b}")
	public String substraction(@PathVariable int a,@PathVariable int b) {
		return "Substration is : "+(a-b);
		
	}
}
