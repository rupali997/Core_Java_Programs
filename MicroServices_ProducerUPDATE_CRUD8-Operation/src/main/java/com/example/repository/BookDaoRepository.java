package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Book;

@Repository
public interface BookDaoRepository extends JpaRepository<Book, Integer> {

	Book findByBookId(int bookId);

}
