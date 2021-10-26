package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;

@RestController
public class ProduceController {

	@GetMapping("/getProduceData")
	public List getData() {
		Student s = new Student();
		s.setSid(101);
		s.setSname("Rupali");
		s.setAge(45);
		s.setAddress("pune");
		
		List lis = new ArrayList();
		lis.add(s);
		
		return lis;
	}
}
