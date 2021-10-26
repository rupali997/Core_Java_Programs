package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Review;

@Repository
public interface ReviewDaoRepository extends JpaRepository<Review, Integer> {

}
