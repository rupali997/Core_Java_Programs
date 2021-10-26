package com.infy.springbootmvcjparestapistatuscodecrud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.springbootmvcjparestapistatuscodecrud.app.model.Product;

@Repository
public interface ProductDaoRepository extends JpaRepository<Product, Integer>{

	

	

	public Product findAllProductByPid(int pid);

	
	
	
}
