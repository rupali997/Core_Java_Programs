package com.infy.springbootjparestapicrud.app.service_Interface;

import java.util.List;

import com.infy.springbootjparestapicrud.app.model.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> getAllData();

	Employee updatEmployee(Employee employee);

	Employee deleteEmployee(Employee employee);

	
}
