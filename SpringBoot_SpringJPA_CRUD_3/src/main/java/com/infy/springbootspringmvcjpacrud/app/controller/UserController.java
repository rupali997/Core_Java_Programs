package com.infy.springbootspringmvcjpacrud.app.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.infy.springbootspringmvcjpacrud.app.model.User;
import com.infy.springbootspringmvcjpacrud.app.service_Interface.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService us;

	@RequestMapping("/")
	public String preLogin(){
		return "login";
	}
	
	@RequestMapping("/register")
	public String preRegister(){
		return "registration";
	}
	
	@RequestMapping("/reg")
	public String RegistrationPage(@ModelAttribute User u, Model m) {
		System.out.println(u.getRole().getRolename());
		if("Admin".equals(u.getRole().getRolename())) {
			System.out.println("Rupali Borkar : "+u.getRole().getRolename());
			u.getRole().setRid(1);
			us.saveUser(u);
			return "login";
			
		}
		else if("Trainer".equals(u.getRole().getRolename())) {
			System.out.println("Daksha Borkar : "+u.getRole().getRolename());
			u.getRole().setRid(2);
			us.saveUser(u);
			return "login";
			
		}
		else if("Student".equals(u.getRole().getRolename())) {
			System.out.println("Kalash Borkar : "+u.getRole().getRolename());
			u.getRole().setRid(3);
			us.saveUser(u);
			return "login";
			
		}
		return "login";
		
	}
	
//	@RequestMapping("/log")
//	public String UserLogin(@ModelAttribute User u,Model m) {
//		
//		int id = us.loginCheck(u.getLogin().getUsername(),u.getLogin().getPassword());
//	}
}
