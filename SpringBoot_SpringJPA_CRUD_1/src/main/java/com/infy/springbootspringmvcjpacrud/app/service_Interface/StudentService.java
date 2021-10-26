package com.infy.springbootspringmvcjpacrud.app.service_Interface;

import com.infy.springbootspringmvcjpacrud.app.model.Student;

public interface StudentService {

	void saveUser(Student s);

	Student loginCheck(String un, String ps);

	Iterable<Student> getAllData();

	

	

	void updateStudent(Student s);

	Student editStudent(int sid);

	void deleteStudent(Student s);

	

	
	

	

}
