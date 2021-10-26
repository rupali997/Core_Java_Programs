package com.infy.springbootspringmvc.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infy.springbootspringmvc.app.model.User;

@Controller
public class UserController {

	@RequestMapping("/")	
	public String prelogin() {
		return "login";
	}
	
	@RequestMapping("/log")
	public String loginPage(@RequestParam("username") String us, @RequestParam("password") String ps , Model m){
		
		System.out.println("UserName : "+us);
		System.out.println("PassWord : "+ps);
		
		m.addAttribute("user", us);
		m.addAttribute("pass", ps);
		return "success";
	}
	
	@RequestMapping("/register")
	public String preRegister() {
		
		return "registration";
	}
	
	@RequestMapping("/reg")
	public String registrationPage(@ModelAttribute User u , Model m){
		
		System.out.println(u.getName());
		System.out.println(u.getUsername());
		System.out.println(u.getPassword());
		
		User u1 = new User();
		u1.setName("RupaliBorkar");
		u1.setUsername("rupalib");
		u1.setPassword("rb@123");
		List<User> lis = new ArrayList<>();
		lis.add(u);
		lis.add(u1);
		m.addAttribute("Users", lis);
		return "success";
		
	}
}
