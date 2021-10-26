package com.springbootjparestapicrud.app.repository;

import java.util.ArrayList;
import java.util.List;

import com.springbootjparestapicrud.app.controller.model.Employee;

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

	
}
