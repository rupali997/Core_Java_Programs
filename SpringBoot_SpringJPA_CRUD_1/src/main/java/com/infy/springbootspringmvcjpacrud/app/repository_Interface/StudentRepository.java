package com.infy.springbootspringmvcjpacrud.app.repository_Interface;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.springbootspringmvcjpacrud.app.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

	public Student findAllByUsernameAndPassword(String un,String ps);

	
	public Student findAllBySid(int sid);


	public Student deleteBySid(int sid);

	  

}
