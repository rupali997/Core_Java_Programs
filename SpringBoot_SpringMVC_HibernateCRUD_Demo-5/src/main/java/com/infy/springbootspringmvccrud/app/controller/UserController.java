package com.infy.springbootspringmvccrud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.infy.springbootspringmvccrud.app.model.User;
import com.infy.springbootspringmvccrud.app.service_Interface.UserService;

@Controller
public class UserController {
	@Autowired
	UserService us;

	@RequestMapping("/")
	public String preLogin() {
		return "login";
	}
	
	@RequestMapping("/register")
	public String preRegisterpage() {
		
		return "registration";
	}
	
	// 1 : Login Check credentials
	
	@RequestMapping("/log")
	public String loginUser(@RequestParam String username,@RequestParam String password,Model m) {
		System.out.println("In Login User");
		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
		
		int id = us.loginCheck(username,password);
		List<User> lis=us.getAllUsers();
		if(id>0){
			m.addAttribute("ulist",lis);
			return "success";
		}
		else {
			return "login";
		}
		
	}

	// 2 : Inserting Data
	@RequestMapping("/reg")
	public String saveUser(@ModelAttribute User u) {
	us.saveUser(u);
		return "login";
	}
	
	// 3 : Deleting Data
	
	@RequestMapping("/delete")
	public String deleteUser(@RequestParam int uid, Model m){
		
		System.out.println("In Delete User!!!");
		int id = us.deleteUser(uid);
		List<User> lis=us.getAllUsers();
		if(id>0){
			m.addAttribute("ulist",lis);
			return "success";
		}
		else{
			m.addAttribute("ulist",lis);
			return "success";
		}
		
	}
	
	// 4 : for Pressing  UPDATE button, here is the logic
	
	@RequestMapping("/edit")
	public String editUser(@RequestParam int uid,Model m) {
		
		System.out.println("In editUser!!");
		User u = us.editUser(uid);
		List<User> lis=us.getAllUsers();
		if(u!=null) {
			m.addAttribute("us", u);
			return "update";
		}
		else{
			return "success";
		}
	}
	
	@RequestMapping("/update")
	public String updateUser(@ModelAttribute User u , Model m) {
		 us.updateUser(u);
		 List<User> lis = us.getAllUsers();
		 m.addAttribute("ulist", lis);
		 return "success";
	}
}
