package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Review;
import com.example.repository.ReviewDaoRepository;

@Service
public class ReviewServices {
	
	@Autowired
	ReviewDaoRepository rd;

	public Review saveOrUpdateABook(Review r) {
		// TODO Auto-generated method stub
		return rd.save(r);
	}

}
