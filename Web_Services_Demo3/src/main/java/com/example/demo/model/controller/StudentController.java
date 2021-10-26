package com.example.demo.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentDaoRepository;

@RestController
public class StudentController {
	
	@Autowired
	StudentDaoRepository sdr;

	@RequestMapping("/students")
	public List<Student> studentData(){
		
		return sdr.findAll();
	}
}
