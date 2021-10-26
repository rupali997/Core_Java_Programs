package com.infy.springbootjparestapicrud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.springbootjparestapicrud.app.model.Book;

@Repository
public interface BookDaoRepository extends JpaRepository<Book, Integer>{
	

}
