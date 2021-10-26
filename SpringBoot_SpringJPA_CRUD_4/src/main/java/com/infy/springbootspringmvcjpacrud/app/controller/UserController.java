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
	public String preLogin() {
		return "login";
	}
	
	@RequestMapping("/register")
	public String preRegisteration() {
		return "Registration";
	}
	
	@RequestMapping("/reg")
	public String saveUser(@ModelAttribute User u) {
		
		System.out.println(u.getRole().getRolename());
		if("Admin".equalsIgnoreCase(u.getRole().getRolename())) {
			System.out.println(u.getRole().getRolename());
			u.getRole().setRid(1);
			us.saveData(u);
			return "login";
			
		}
		else if("Trainer".equalsIgnoreCase(u.getRole().getRolename())) {
			System.out.println(u.getRole().getRolename());
			u.getRole().setRid(2);
			us.saveData(u);
			return "login";
			
		}
		else if("Student".equalsIgnoreCase(u.getRole().getRolename())) {
			System.out.println(u.getRole().getRolename());
			u.getRole().setRid(3);
			us.saveData(u);
			return "login";
			
		}
		return "login";
	}
	
	
	@RequestMapping("/log")
	public String userLogin(@ModelAttribute User u,Model m) {
		User u1 = us.loginCheck(u.getUsername(),u.getPassword());
		
		
		System.out.println(u1.getName());
		System.out.println(u1.getMobile());
		
		System.out.println();
		if(u.getRole().getRid()==1) {
			Iterable<User> lis = us.displayAllDataRid(2);
			m.addAttribute("h", "TRAINER");
			m.addAttribute("ulist", lis);
			return "success";
		}
		else if(u.getRole().getRid()==2) {
			Iterable<User> lis = us.displayAllDataRid(3);
			m.addAttribute("h", "STUDENT");
			m.addAttribute("ulist", lis);
			return "success";
		}
		else if(u.getRole().getRid()==3) {
			
			
			m.addAttribute("h", "STUDENT");
			m.addAttribute("ulist", u1);
			return "singleStudentSuccess";
		}
		return "login";
	}
	
	
	@RequestMapping("/edit")
	public String editUser(@ModelAttribute User u,Model m) {
		User u1 = us.getsingledatabyUid(u.getUid());
		
		if(u1.getRole().getRid()==2) {
			m.addAttribute("u", u1);
			return "edittrainer";
				
		}
		else {
			m.addAttribute("u", u1);
			return "editstudent";
		}
		
	}
	
	
	@RequestMapping("/update")
	public String updateUser(@ModelAttribute User u) {
		System.out.println(u.getRole().getRolename());
		if("Admin".equalsIgnoreCase(u.getRole().getRolename())) {
			System.out.println(u.getRole().getRolename());
			u.getRole().setRid(1);
			us.saveData(u);
			return "login";
			
		}
		else if("Trainer".equalsIgnoreCase(u.getRole().getRolename())) {
			System.out.println(u.getRole().getRolename());
			u.getRole().setRid(2);
			us.saveData(u);
			return "login";
			
		}
		else if("Student".equalsIgnoreCase(u.getRole().getRolename())) {
			System.out.println(u.getRole().getRolename());
			u.getRole().setRid(3);
			us.saveData(u);
			return "login";
			
		}
		return "login";
	
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
