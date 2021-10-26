package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UiController {

	@RequestMapping("/log")
	public String preLogin() {
		
		return "login";
	}
}
