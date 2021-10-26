package com.springbootjparestapicrud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootjparestapicrud.app.model.Employee;
import com.springbootjparestapicrud.app.service_Interface.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService es;

	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return es.saveData(employee);
		
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee(){
		return es.getAllEmployee();
		
	}
	
	@PutMapping("/employee/{eid}")
	public String updateEmployee(@PathVariable int eid ,@RequestBody Employee employee) {
		Employee e = es.updateEmployee(eid,employee);
		return "Updated Successfully!!";
		
	}
	
	@DeleteMapping("/employee/{eid}")
	public String deleteEmployee(@PathVariable int eid ,@RequestBody Employee employee) {
		String s =  es.deleteEmployee(eid,employee);
		return "Deleted successfully!!";
	}
}
