package com.infy.springbootspringmvcjpacrud.app.service_Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springbootspringmvcjpacrud.app.model.Student;
import com.infy.springbootspringmvcjpacrud.app.repository_Interface.StudentRepository;
import com.infy.springbootspringmvcjpacrud.app.service_Interface.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository sr;

	@Override
	public void saveUser(Student s) {
		
		sr.save(s);
		
	}

	@Override
	public Student loginCheck(String username, String password) {
		
		return sr.findAllByUsernameAndPassword(username,password);
	}

	@Override
	public Iterable<Student> getAllData() {
		return sr.findAll();
	}

	@Override
	public void deleteStudent(Student s) {
		sr.delete(s);
		
	}

	@Override
	public Student editStudent(int sid) {
		
		return sr.findAllBySid(sid);
	}

	@Override
	public void updateStudent(Student s) {
		sr.save(s);
		
	}

	

	

}
