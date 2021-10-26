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

	@Modifying
	@Query(value="select * from User where username=:user and password=:pass",nativeQuery=true)
	List<User> findAllByUsernameAndPassword(@Param("user")String username, @Param("pass")String password);

	@Query(value="from User")
	Iterable<User> getAlldataofUser();
	
	@Query(value="from User")
	List<User> findAllUser();

	@Modifying
	@Query(value="from User where uid=?1",nativeQuery=true)
	User findAllDataByUid(int uid);

	

	

	


}
