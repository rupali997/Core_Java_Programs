package com.infy.springbootspringmvcjpacrud.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.infy.springbootspringmvcjpacrud.app.model.User;

@Repository
public interface UserDaoImplRepository extends JpaRepository<User, Integer>{

	@Query(value="select * from User where username=:un and password=:ps",nativeQuery=true)
	List<User> findAllByUsernameAndPassword(@Param("un") String username,@Param("ps") String password);

	@Query(value="select * from User",nativeQuery=true)
	Iterable<User> findAllUser();

	@Modifying
	@Query(value="delete from User where uid=:id",nativeQuery=true)
	int deleteByUid(@Param("id") int uid);

	

//	@Modifying
//	@Query(value="select * from User where uid=:id",nativeQuery=true)
	User findAllUsersByUid(int uid);

}
