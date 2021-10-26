package com.infy.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.infy.springmvc.model.User;
import com.infy.springmvc.servicei.UserService;

@Controller
public class UserController {
	@Autowired
	UserService us;
	
	@RequestMapping("/")
	public String prelogin() {
		
		return "login";
	}
	
	@RequestMapping("register")
	public String preRegister() {
		
		return "Registration";
	}
	
	@RequestMapping("regi")
	public String postRegister(@ModelAttribute User u) {
		
		System.out.println(u.getRole().getRolename());
		if("Admin".equals(u.getRole().getRolename())) {
			System.out.println("Rupali Borkar" +u.getRole().getRolename());
			u.getRole().setRid(1);
			us.savedata(u);
			return "login";
		}
		else if("Trainer".equals(u.getRole().getRolename())) {
			System.out.println("Daksha Borkar  : "+u.getRole().getRolename());
			u.getRole().setRid(2);
			us.savedata(u);
			return "login";
		}
		else if("Student".equals(u.getRole().getRolename())) {
			System.out.println("kalash Borkar  : "+u.getRole().getRolename());
			u.getRole().setRid(3);
			us.savedata(u);
			return "login";
		}
		return "login";
	}
	
	@RequestMapping("log")
	public String postLogin(@ModelAttribute User u,Model m) {
		User unew=us.logincheck(u);
		if(unew==null) {
			System.out.println("****    ******");
			return "login";
		}
		else {
			System.out.println(u.getLogin().getUsername());
			System.out.println(u.getLogin().getPassword());
			System.out.println(unew.getRole().getRid());
			System.out.println("-----------------");
			System.out.println(unew.getMobilenumber()+ "  :  "+unew.getRole().getRolename() );
			
			if(unew.getRole().getRid()==1) {
				List<User> ul=us.displayList(2);
				m.addAttribute("ulist", ul);
				return "success";
			}
			else if(unew.getRole().getRid()==2) {
				List<User> ul=us.displayList(3);
				m.addAttribute("ulist", ul);
				return "success";
			}
			else if(unew.getRole().getRid()==3) {
				List<User> ul=us.displayList(3);
				m.addAttribute("ulist", ul);
				
				u.setName("Pawan Gadge");
				u.setMobilenumber("67899");
				return "success";
			}
			
			return "success";
		}
		

	}
	
	@RequestMapping("edit")
	public String editdata(@ModelAttribute User u, Model m) {
		User u1=us.getSingleUserData(u);
		if(u1==null) {
			return "login";
		}
		else {
			m.addAttribute("data", u1);
			return "editdata";
		}
	}
	
	@RequestMapping("update")
	public String updateData(@ModelAttribute User u,Model m) {
		
		if("Admin".equals(u.getRole().getRolename())) {
			System.out.println("Rupali Borkar" +u.getRole().getRolename());
			u.getRole().setRid(1);
			us.savedata(u);
			return "login";
		}
		else if("Trainer".equals(u.getRole().getRolename())) {
			System.out.println("Daksha Borkar  : "+u.getRole().getRolename());
			u.getRole().setRid(2);
			us.savedata(u);
			return "login";
		}
		else if("Student".equals(u.getRole().getRolename())) {
			System.out.println("Kalash Borkar  : "+u.getRole().getRolename());
			u.getRole().setRid(3);
			us.savedata(u);
			return "login";
		}
		return "login";
	}
	
	@RequestMapping("delete")
	public String deleteData(@ModelAttribute User u) {
		if(u==null) {
			return "login";
		}
		else {
			us.deleteUserData(u);
			System.out.println("Deleted Data...");
			return "login";
		}

	}
	
	
}
