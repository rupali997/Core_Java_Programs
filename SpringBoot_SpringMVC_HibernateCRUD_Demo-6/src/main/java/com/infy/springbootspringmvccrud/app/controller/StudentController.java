package com.infy.springbootspringmvccrud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.infy.springbootspringmvccrud.app.model.Student;
import com.infy.springbootspringmvccrud.app.service_Interface.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService ss;

	@RequestMapping("/")
	public String preLogin() {
		return "login";
	}
	
	@RequestMapping("/register")
	public String preRegister(){
		return "registration";
	}
	
	@RequestMapping("/reg")
	public String saveUser(@ModelAttribute Student s){
		ss.saveUser(s);
		return "login";
	}
	
	@RequestMapping("/log")
	public String studentLogin(@RequestParam String username,@RequestParam String password, Model m) {
		System.out.println("In Student Login");
		System.out.println("UserName : "+username+"   "+"Password : "+password);
		int id = ss.loginCheck(username,password);
		
		List<Student> lis = ss.getAllStudents();
		if(id>0){
			m.addAttribute("slist",lis);
			return "success";
		}
		else {
			return "login";
		}
	}
	
	@RequestMapping("/edit") 
	public String editStudent(@RequestParam int sid , Model m){
		
		Student s = ss.editUser(sid);
		
		if(s!=null) {
			m.addAttribute("stu", s);
			return "update";
		}
		else {
			
			return "success";
		}
	}
	
	@RequestMapping("/update")
	public String updateStudent(@ModelAttribute Student s, Model m) {
		
		ss.updateUser(s);
		List<Student> lis = ss.getAllStudents();
		m.addAttribute("slist", lis);
		return "success";

		}
	
	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam int sid,Model m) {
		int id = ss.deleteStudent(sid);
		List<Student> lis = ss.getAllStudents();
		if(id>0) {
			m.addAttribute("slist", lis);
			return "success";
		}
		else {
			m.addAttribute("slist", lis);
			return "success";
		}

	}
}
