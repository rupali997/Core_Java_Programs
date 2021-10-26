package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DivController {

	@GetMapping("/gd/{a}/{b}")
	public String division(@PathVariable int a,@PathVariable int b) {
		return "Division is : "+(a/b);
		
	}
}
