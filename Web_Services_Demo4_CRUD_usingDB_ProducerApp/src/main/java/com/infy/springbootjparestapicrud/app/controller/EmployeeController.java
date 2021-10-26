package com.infy.springbootjparestapicrud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.springbootjparestapicrud.app.model.Employee;
import com.infy.springbootjparestapicrud.app.service_Interface.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService es;
	
	@GetMapping("/home")
	public String home() {
		return "this in my web service";
		
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return es.saveEmployee(employee);
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee(){
		return es.getAllData();
	}
	
	@PutMapping("/employee/{eid}")
	public String updateEmployee(@RequestBody Employee employee) {
		es.updatEmployee(employee);
		return "Data Updated Successfully";
		
	}
	
//	@DeleteMapping("/employee/{eid}")
//	public Employee deleteEmployee(@RequestBody Employee employee) {
//		return es.deleteEmployee(employee);
//	}
	
	@DeleteMapping("/employee/{eid}")
	public String deleteEmployee(@RequestBody Employee employee) {
		es.deleteEmployee(employee);
		return "Data Successfully Deleted!!";
	}
}
