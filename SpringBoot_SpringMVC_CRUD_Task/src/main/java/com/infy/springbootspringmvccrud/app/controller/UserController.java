package com.infy.springbootspringmvccrud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.infy.springbootspringmvccrud.app.model.User;
import com.infy.springbootspringmvccrud.app.service_Interface.UserService;

@Controller
public class UserController {

	@Autowired
	UserService us;

	// Step-1--->
	@RequestMapping("/")
	public String preLogin() {
		return "login";
	}

	// Step-2--->

	@RequestMapping("/register")
	public String preregister() {
		return "registration";
	}

	// Step-3--->
	
	

	@RequestMapping("/reg")
	public String saveUser(@ModelAttribute User u) {
		System.out.println(u.getRol().getRolename());

		if ("Admin".equalsIgnoreCase(u.getRol().getRolename())) {
			//System.out.println("Rupali Borkar : " + u.getRol().getRolename());
			u.getRol().setRid(1);
			us.saveUser(u);
			return "login";
		} else if ("Trainer".equalsIgnoreCase(u.getRol().getRolename())) {
			//System.out.println("Daksha Borkar : " + u.getRol().getRolename());

			u.getRol().setRid(2);
			us.saveUser(u);
			return "login";
		} else if ("Student".equalsIgnoreCase(u.getRol().getRolename())) {
			//System.out.println("Kalash Borkar : " + u.getRol().getRolename());

			u.getRol().setRid(3);
			us.saveUser(u);
			return "login";
		}

		return "login";
	}
	
	
	// Step-4--->
	
	@RequestMapping("/log")
	public String postLogin(@ModelAttribute User u,Model m){
		
		System.out.println("In Post Login!!");
		
		User newuser = us.loginCheck(u.getLogin().getUsername(),u.getLogin().getPassword());
		
		if(newuser==null) {
			System.out.println("****No Data Found****");
			return "login";
		}
		else {
			System.out.println(u.getLogin().getUsername());
			System.out.println(u.getLogin().getPassword());
			System.out.println(newuser.getName());
			System.out.println(newuser.getMobile());
			System.out.println(newuser.getRol().getRid());
			System.out.println(newuser.getRol().getRolename());
			
			if(newuser.getRol().getRid()==1){
				List<User> lis = us.getAllUsers(2);
				m.addAttribute("ulist", lis);
				return "success";
			}
			else if(newuser.getRol().getRid()==2){
				List<User> lis = us.getAllUsers(3);
				m.addAttribute("ulist", lis);
				return "success";
			}
			else if(newuser.getRol().getRid()==3){
				newuser.setName("Kishor Kumar");
				newuser.setMobile(98765);
				newuser.getLogin().setUsername("kishork");
				newuser.getLogin().setPassword("kk@123");
				newuser.getRol().setRid(3);
				newuser.getRol().setRolename("Student");
				
				
				List<User> lis = us.getAllUsers(3);
				lis.add(newuser);
				m.addAttribute("ulist", lis);
				return "success";
			}


		}
		return "success";
		
	}
}
