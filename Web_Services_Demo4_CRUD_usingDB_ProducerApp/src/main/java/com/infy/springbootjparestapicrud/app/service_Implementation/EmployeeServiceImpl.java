package com.infy.springbootjparestapicrud.app.service_Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springbootjparestapicrud.app.model.Employee;
import com.infy.springbootjparestapicrud.app.repository.EmployeeDaoRepository;
import com.infy.springbootjparestapicrud.app.service_Interface.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDaoRepository edr;

	@Override
	public Employee saveEmployee(Employee employee) {
		
		return edr.save(employee);
	}

	@Override
	public List<Employee> getAllData() {
		
		return edr.findAll();
	}

	@Override
	public Employee updatEmployee(Employee employee) {
		// TODO Auto-generated method stub
		edr.save(employee);
		
		return employee;
	}

	@Override
	public Employee deleteEmployee(Employee employee) {
		edr.delete(employee);
		System.out.println("data deleted");
		return employee;
	}

}
