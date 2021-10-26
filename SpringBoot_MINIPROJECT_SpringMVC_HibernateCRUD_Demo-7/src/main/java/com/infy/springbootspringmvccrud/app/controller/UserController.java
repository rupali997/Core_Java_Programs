package com.infy.springbootspringmvccrud.app.controller;

import java.util.ArrayList;
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

//	1------>
	@RequestMapping("/")
	public String preLogin() {
		return "login";
	}
	
//	2------->

	@RequestMapping("/register")
	public String preregister() {
		return "registration";
	}
	
	
//	3------->

	@RequestMapping("/reg")
	public String saveUser(@ModelAttribute User u) {
		System.out.println(u.getRol().getRolename());

		if ("admin".equalsIgnoreCase(u.getRol().getRolename())) {
			System.out.println("Rupali Borkar : " + u.getRol().getRolename());
			u.getRol().setRid(1);
			us.saveUser(u);
			return "login";
		} else if ("trainer".equalsIgnoreCase(u.getRol().getRolename())) {
			System.out.println("Daksha Borkar : " + u.getRol().getRolename());

			u.getRol().setRid(2);
			us.saveUser(u);
			return "login";
		} else if ("student".equalsIgnoreCase(u.getRol().getRolename())) {
			System.out.println("Kalash Borkar : " + u.getRol().getRolename());

			u.getRol().setRid(3);
			us.saveUser(u);
			return "login";
		}

		return "login";
	}

//	4------>
	
	@RequestMapping("/log")
	public String loginCheck(@ModelAttribute User u,Model m) {
		
		User newuser = us.loginCheck(u);
		
		if(newuser==null) {
			System.out.println("*****No Data*******");
			return "login";
		}
		else {
			
			System.out.println("Name : "+newuser.getName());
			System.out.println("Mobile : "+newuser.getMobile());
			System.out.println("Username : "+u.getLogin().getUsername());
			System.out.println("Password : "+u.getLogin().getPassword());
			System.out.println("RID : "+newuser.getRol().getRid());
			System.out.println("Rolename : "+newuser.getRol().getRolename());
			
			if(newuser.getRol().getRid()==1) {
				List<User> lis1 = us.getAllUsers(2);
				m.addAttribute("ulist", lis1);
				return "success";
			}
			else if(newuser.getRol().getRid()==2) {
				List<User> lis1 = us.getAllUsers(3);
				m.addAttribute("ulist", lis1);
				return "success";
			}
			else if(newuser.getRol().getRid()==3) {
				List<User> lis1 = us.getAllUsers(3);
				m.addAttribute("ulist", lis1);
//				u.setName("pawan gadge");
//				u.setMobile(90876);
//				u.getLogin().setUsername("pawand");
//				u.getLogin().setPassword("pg@123");
//				u.getRol().setRolename("student");
//				List<User> lis = new ArrayList<>();
//				lis.add(u);
//				m.addAttribute("ulist", lis);
//				
				
				return "success";
			}
			return "success";
		}
		
		
	}
//	5------>
	@RequestMapping("/delete")
	public String deleteUser(@ModelAttribute User u) {

		if(u==null) {
			return "login";
		}
		else {
			us.deleteUser(u);
			System.out.println("data delete!!");
			return "login";
		}
	}

	
	@RequestMapping("/edit")
	public String editdata(@ModelAttribute User u, Model m) {

		User u1=us.getSingleUserData(u);
		if(u1!=null) {
			m.addAttribute("us", u1);
			return "update";
		}
		else {
			return "login";
		}
	}
	
	@RequestMapping("/update")
	public String updateData(@ModelAttribute User u,Model m) {

		if ("admin".equalsIgnoreCase(u.getRol().getRolename())) {
			System.out.println("Rupali Borkar : " + u.getRol().getRolename());
			u.getRol().setRid(1);
			
			us.updateData(u);
			return "login";
		} else if ("trainer".equalsIgnoreCase(u.getRol().getRolename())) {
			System.out.println("Daksha Borkar : " + u.getRol().getRolename());

			u.getRol().setRid(2);
			us.updateData(u);
			return "login";
		} else if ("student".equalsIgnoreCase(u.getRol().getRolename())) {
			System.out.println("Kalash Borkar : " + u.getRol().getRolename());

			u.getRol().setRid(3);
			us.updateData(u);
			return "login";
		}

		return "login";
		
	}
	
}
