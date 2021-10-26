package com.infy.springbootspringmvcjpacrud.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.infy.springbootspringmvcjpacrud.app.model.Student;
import com.infy.springbootspringmvcjpacrud.app.service_Interface.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService ss;

	// 1]---->login page view

	@RequestMapping("/")
	public String preLogin() {
		return "login";
	}

	// 2]---->to go on register page view

	@RequestMapping("/register")
	public String preRegister() {
		return "registration";
	}

	// 3]---->registering data on registration page

	@RequestMapping("/reg")
	public String saveUser(@ModelAttribute Student s) {

		ss.saveUser(s);

		return "login";

	}

	// 4]---->for entering login credentials to see all table data

	@RequestMapping("/log")
	public String afterLogin(@RequestParam("username") String un, @RequestParam("password") String ps, Model m) {
		System.out.println("In Login check****");
		Student s = ss.loginCheck(un, ps);
		if (s != null) {

			Iterable<Student> lis = ss.getAllData();
			m.addAttribute("slist", lis);
			return "success";
		} else {
			return "login";
		}

	}

	// 5]---->delete method for deleting particular existing data from table

	@RequestMapping("/delete")
	public String deleteStudent(@ModelAttribute Student s, Model m) {
		System.out.println("In delete user!!");
		ss.deleteStudent(s);

		Iterable<Student> lis = ss.getAllData();

		m.addAttribute("slist", lis);

		return "success";

	}

	// 6]---->logic for , what happen after pressing UPDATE button

	@RequestMapping("/edit")
	public String editStudent(@RequestParam int sid, Model m) {

		System.out.println("In Edit User!!");
		Student s = ss.editStudent(sid);
		if (s != null) {
			Iterable<Student> lis = ss.getAllData();
			m.addAttribute("stu", s);

			return "update";

		} else {
			Iterable<Student> lis = ss.getAllData();
			m.addAttribute("slist", lis);

			return "success";
		}

	}

	// 7]---->After pressing UPDATE button , open page in editable mode to modify
	// existing data

	@RequestMapping("/update")
	public String updateStudent(@ModelAttribute Student s, Model m) {
		ss.updateStudent(s);
		Iterable<Student> lis = ss.getAllData();
		m.addAttribute("slist", lis);
		return "success";

	}
}
