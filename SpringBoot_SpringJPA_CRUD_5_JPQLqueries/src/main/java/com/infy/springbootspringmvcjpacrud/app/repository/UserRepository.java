package com.infy.springbootspringmvcjpacrud.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.infy.springbootspringmvcjpacrud.app.model.User;


@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

	@Query(value="from User")
	List<User> findAllUsers();

	@Modifying
	@Query(value="delete from User where uid=:id" , nativeQuery = true)
	void deleteByData(@Param("id") int uid);

	

	
	User findAllByUid(int uid);

	

	

	

	


}
