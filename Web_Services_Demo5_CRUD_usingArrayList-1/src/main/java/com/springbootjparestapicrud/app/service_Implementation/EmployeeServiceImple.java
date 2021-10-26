package com.springbootjparestapicrud.app.service_Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootjparestapicrud.app.model.Employee;
import com.springbootjparestapicrud.app.repository.ArrayListDataManager;
import com.springbootjparestapicrud.app.service_Interface.EmployeeService;

@Service
public class EmployeeServiceImple implements EmployeeService {

	@Autowired
	ArrayListDataManager adm;

	@Override
	public Employee saveData(Employee employee) {
		
		return adm.saveData(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return adm.getAllEmployee();
	}

	

	@Override
	public Employee updateEmployee(int eid ,Employee employee) {
		
		return adm.updateEmployee(eid,employee);
	}

	@Override
	public String deleteEmployee(int eid, Employee employee) {
		// TODO Auto-generated method stub
		return adm.deleteEmployee(eid,employee);
	}
	
}
