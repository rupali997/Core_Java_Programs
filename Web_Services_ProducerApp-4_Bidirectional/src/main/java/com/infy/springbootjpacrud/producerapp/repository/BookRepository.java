package com.infy.springbootjpacrud.producerapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.springbootjpacrud.producerapp.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
