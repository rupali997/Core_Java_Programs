package com.springbootjparestapicrud.app.repository;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springbootjparestapicrud.app.model.Employee;
@Repository
public class ArrayListDataManager {

	List<Employee> elist = new ArrayList<>();
	
	public Employee saveData(Employee employee) {
		elist.add(employee);
		return employee;
	}

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return elist;
	}

	public Employee updateEmployee(int eid, Employee employee) {
		for(Employee emp : elist) {
			if(emp.getEid()==eid) {
				emp.setName(employee.getName());
				emp.setUsername(employee.getUsername());
				emp.setPassword(employee.getPassword());
				emp.setSalary(employee.getSalary());
				
				int i1 = elist.indexOf(emp);
				elist.set(i1, emp);
				return emp;
			}
		}
		return employee;
	}

	public String deleteEmployee(int eid, Employee employee) {
		
		for(Employee emp : elist) {
			if(emp.getEid()==eid) {
				elist.remove(emp);
				return "record deleted : "+eid;
			}
			else {
				return "no record found!";
			}
		}
		return "";
	}

	
}
