package com.infy.springbootspringmvcjpacrud.app.controller;

import java.util.List;

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
	public String preLogin() {
		return "login";
		
	}
	
	@RequestMapping("/register")
	public String preRegistration() {
		return "Registration";
		
	}
	
	@RequestMapping("/reg")
	public String saveUser(@ModelAttribute User u) {
		
		us.saveData(u);
		return "login";
	}
	
	@RequestMapping("/log")
	public String loginUser(@ModelAttribute User u, Model m) {
		List<User> lis= us.loginCheck(u.getUsername(),u.getPassword());
		if(lis.isEmpty()) {
			
			return "login";
		}
		else {
			m.addAttribute("ulist",lis);
			return "success";
		}
		
	}
	
	@RequestMapping("/delete")
	public String deleteUser(@ModelAttribute User u,Model m) {
		
		int id = us.deleteData(u.getUid());
		Iterable<User> lis = us.getAllUser();
		if(id>0) {
			
			m.addAttribute("ulist",lis);
			return "success";
			
		}
		else {
			m.addAttribute("ulist",lis);
			return "success";
		}
	}
	
	@RequestMapping("/edit")
	public String editUser(@ModelAttribute User u,Model m) {
			User u1= us.editData(u.getUid());
		
			m.addAttribute("us", u1);
			return "update";
		
	}
	
	@RequestMapping("/update")
	public String UpdateUser(@ModelAttribute User u,Model m) {
		us.saveData(u);
		Iterable<User> lis = us.getAllUser();
		m.addAttribute("ulist",lis);
		return "success";
	}
}
