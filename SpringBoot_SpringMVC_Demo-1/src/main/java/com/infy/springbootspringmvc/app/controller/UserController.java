package com.infy.springbootspringmvc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	@RequestMapping("/")
	public String preLogin() {
		System.out.println("In PreLogin Page!!!");
		return "login";
		
	}
	
	@RequestMapping("/log")
	public String loginPage(@RequestParam String username,@RequestParam String password , Model m) {
		
		System.out.println("UserName : "+username);
		System.out.println("Password : "+password);
		m.addAttribute("un", username);
		m.addAttribute("ps", password);
		
		return "success";
	}
	
	@RequestMapping("/register")
	public String preRegisterPage() {
		System.out.println("Open registration page");
		
		return "registration";
	}
	
	@RequestMapping("/reg")
	public String registrationPage() {
		
		return "login";
		
	}
}
