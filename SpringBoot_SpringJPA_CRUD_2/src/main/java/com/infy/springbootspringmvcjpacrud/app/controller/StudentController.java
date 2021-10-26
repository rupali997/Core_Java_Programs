package com.infy.springbootspringmvcjpacrud.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.infy.springbootspringmvcjpacrud.app.model.Student;
import com.infy.springbootspringmvcjpacrud.app.service_Interface.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService ss;

	@RequestMapping("/")
	public String preLogin() {

		return "login";
	}

	@RequestMapping("/register")
	public String preRegister() {

		return "registration";
	}

	@RequestMapping("/reg")
	public String saveUser(@ModelAttribute Student s) {

		ss.saveUser(s);
		return "login";
	}

	@RequestMapping("/log")
	public String studentLogin(@ModelAttribute Student s, Model m) {

		Student s1 = ss.loginCheck(s.getUsername(), s.getPassword());
		Iterable<Student> lis = ss.getAllData();

		if (s1 != null) {
			m.addAttribute("slist", lis);
			return "success";
		} else {
			return "login";
		}
	}

	@RequestMapping("/delete")
	public String deleteData(@ModelAttribute Student s, Model m) {

		ss.deleteStudent(s);

		Iterable<Student> lis = ss.getAllData();
		m.addAttribute("slist", lis);
		return "success";

	}
	
	@RequestMapping("/edit")
	public String editStudent(@ModelAttribute Student s,Model m){
		Student s1 = ss.editStudent(s.getSid());
		Iterable<Student> lis = ss.getAllData();
		if(s1!=null){
			m.addAttribute("stu", s1);
			return "update";
		}
		else {
			m.addAttribute("slist", lis);
			return "success";
		}
	}
	
	@RequestMapping("/update")
	public String updateStudent(@ModelAttribute Student s,Model m){
		
		ss.updateStudent(s);
		Iterable<Student> lis = ss.getAllData();
		m.addAttribute("slist", lis);
		return "success";
		
		
	}
}
