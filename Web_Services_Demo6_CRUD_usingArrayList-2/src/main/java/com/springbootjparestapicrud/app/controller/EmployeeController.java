package com.springbootjparestapicrud.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootjparestapicrud.app.model.Employee;

@RestController
public class EmployeeController {

	List<Employee> lis = new ArrayList<>();

	// Insert Employee

	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee e) {
		lis.add(e);
		return e;
	}

	// Retrieve Employee

	@GetMapping("/employee")
	public List<Employee> getAllData() {
		return lis;
	}

	// Update Employee

	@PutMapping("/employee/{eid}")
	public Employee updateEmployee(@PathVariable int eid, @RequestBody Employee employee) {
		for (Employee emp : lis) {
			if (emp.getEid() == eid) {
				emp.setName(employee.getName());
				emp.setUsername(employee.getUsername());
				emp.setPassword(employee.getPassword());
				emp.setSalary(employee.getSalary());

				int i = lis.indexOf(emp);
				lis.set(i, emp);
				return emp;
			}
		}
		return employee;
	}

	//Delete Record
	@DeleteMapping("/employee/{eid}")
	public String deleteEmployee(@PathVariable int eid, @RequestBody Employee employee) {

		for (Employee emp : lis) {
			if (emp.getEid() == eid) {
				lis.remove(emp);
				return "record deleted : " + eid;
			} else {
				return "no record found!";
			}
		}
		return "deleted successfully!!";
	}

}
