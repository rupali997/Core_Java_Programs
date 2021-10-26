package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Student;

@Repository
public interface Student_Repository extends JpaRepository<Student, Integer> {

	Student findBySid(int sid);

}
