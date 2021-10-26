package com.cjc.app.evf.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.evf.main.model.Customer_Address;

@Repository
public interface Customer_AddressRepository extends JpaRepository<Customer_Address, Integer> {

}
