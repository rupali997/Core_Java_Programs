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
	public String preRegisteration() {
		return "Registration";
	}
	
	@RequestMapping("/reg")
	public String saveUser(@ModelAttribute User u) {
		
		us.saveData(u);
		return "login";
		
		}
	
	
	@RequestMapping("/log")
	public String userLogin(@ModelAttribute User u,Model m) {
		List<User> lis = us.loginCheck(u.getUsername(),u.getPassword());
		if(lis.isEmpty()) {
			return "login";
		}
		else {
			m.addAttribute("ulist", lis);
			return "success";
		}
		
	}
	
	
	@RequestMapping("/edit")
	public String editUser(@ModelAttribute User u,Model m) {
		User u1 = us.editUser(u.getUid());
		
		m.addAttribute("u",u1);
		return "update";
		
	}
	
	@RequestMapping("/update")
	public String updateUser(@ModelAttribute User u) {
		us.updateUser(u);
		Iterable<User> lis = us.getAllUsers();
		return "success";
		
	}
	
	@RequestMapping("/delete")
	public String deleteUser(@ModelAttribute User u) {
		if(u!=null) {
			us.deleteUser(u);
			return "success";
		}
		else {
			return "login";
		}
	}
}
