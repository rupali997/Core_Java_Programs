package com.springbootjparestapicrud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootjparestapicrud.app.controller.model.Employee;
import com.springbootjparestapicrud.app.service_Interface.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService es;

	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return es.saveData(employee);
		
	}
	
	@GetMapping
	public List<Employee> getAllEmployee(){
		return es.getAllEmployee();
		
	}
}
