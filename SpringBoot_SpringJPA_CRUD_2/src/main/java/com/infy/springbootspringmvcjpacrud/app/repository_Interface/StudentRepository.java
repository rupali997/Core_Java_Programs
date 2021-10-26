package com.infy.springbootspringmvcjpacrud.app.repository_Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.springbootspringmvcjpacrud.app.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	Student findAllByUsernameAndPassword(String username, String password);

	Student findAllBySid(int sid);

	

}
