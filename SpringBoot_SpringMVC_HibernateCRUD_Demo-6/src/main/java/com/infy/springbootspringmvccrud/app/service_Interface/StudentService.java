package com.infy.springbootspringmvccrud.app.service_Interface;

import java.util.List;

import com.infy.springbootspringmvccrud.app.model.Student;

public interface StudentService {

	void saveUser(Student s);

	int loginCheck(String username, String password);

	List<Student> getAllStudents();

	Student editUser(int sid);

	void updateUser(Student s);

	int deleteStudent(int sid);

}
