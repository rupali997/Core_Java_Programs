package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repository.UserDao;
import com.example.demo.service_Interface.UserService;

@RestController
public class HomeController {
	
	@Autowired
	UserDao ud;

//	@RequestMapping("/")
//	public List<User> preLogin() {
//		List<User> lis = new ArrayList<>();
//		lis.add(new User(101,"Rupali","Pune"));
//		lis.add(new User(102,"Daksha","Pune"));
//		
//		return lis;
//	}
	
//	@RequestMapping("/students")
//	public List<Student> userData() {
//		Student s = new Student();
//		System.out.println(s.getName());
//		System.out.println(s.getUsername());
//		System.out.println(s.getName());
//		System.out.println(s.getMobile());
//		System.out.println(s.getAddr().getCity());
//		System.out.println(s.getAddr().getArea());
//		
//		List<Student> lis = us.getAllStudent();
////		lis.add(s);
//		
//		return  lis;
//	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Student> getAllStudent(){
		return ud.findAll();
		
	}
}
