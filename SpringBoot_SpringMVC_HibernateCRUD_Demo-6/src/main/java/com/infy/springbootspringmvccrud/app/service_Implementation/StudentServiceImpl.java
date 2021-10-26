package com.infy.springbootspringmvccrud.app.service_Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springbootspringmvccrud.app.dao_Interface.StudentDao;
import com.infy.springbootspringmvccrud.app.model.Student;
import com.infy.springbootspringmvccrud.app.service_Interface.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDao sd;
	@Override
	public void saveUser(Student s) {
		sd.saveUser(s);
	}
	@Override
	public int loginCheck(String username, String password) {
		
		return sd.loginCheck(username,password);
	}
	@Override
	public List<Student> getAllStudents() {
		
		return sd.getAllStudents();
	}
	@Override
	public Student editUser(int sid) {
		
		return sd.editUser(sid);
	}
	@Override
	public void updateUser(Student s) {
		sd.updateUser(s);
		
	}
	@Override
	public int deleteStudent(int sid) {
		
		return sd.deleteStudent(sid);
	}

}
