package com.infy.springbootspringmvcjpacrud.app.service_Interface;

import com.infy.springbootspringmvcjpacrud.app.model.Student;

public interface StudentService {

	void saveUser(Student s);

	Student loginCheck(String username, String password);

	Iterable<Student> getAllData();

	void deleteStudent(Student s);

	Student editStudent(int sid);

	void updateStudent(Student s);

	

}
