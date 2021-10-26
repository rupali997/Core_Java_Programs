package com.springbootjparestapicrud.app.service_Interface;

import java.util.List;

import com.springbootjparestapicrud.app.controller.model.Employee;

public interface EmployeeService {

	Employee saveData(Employee employee);

	List<Employee> getAllEmployee();

}
