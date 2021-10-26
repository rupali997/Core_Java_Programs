package com.infy.springbootspringmvccrud.app.dao_Interface;

import java.util.List;

import com.infy.springbootspringmvccrud.app.model.Student;

public interface StudentDao {

	public void saveUser(Student s);

	public int loginCheck(String username, String password);

	public List<Student> getAllStudents();

	public Student editUser(int sid);

	public void updateUser(Student s);

	public int deleteStudent(int sid);

}
