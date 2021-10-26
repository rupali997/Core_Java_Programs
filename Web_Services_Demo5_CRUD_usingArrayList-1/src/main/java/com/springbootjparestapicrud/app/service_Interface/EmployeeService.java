package com.springbootjparestapicrud.app.service_Interface;

import java.util.List;

import com.springbootjparestapicrud.app.model.Employee;

public interface EmployeeService {

	Employee saveData(Employee employee);

	List<Employee> getAllEmployee();

	Employee updateEmployee(int eid, Employee employee);

	String deleteEmployee(int eid, Employee employee);

}
