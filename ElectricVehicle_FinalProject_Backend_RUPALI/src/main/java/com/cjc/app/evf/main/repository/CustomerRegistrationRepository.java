package com.cjc.app.evf.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.evf.main.model.Customer_Registration;

@Repository
public interface CustomerRegistrationRepository extends JpaRepository<Customer_Registration, Integer> {

}
