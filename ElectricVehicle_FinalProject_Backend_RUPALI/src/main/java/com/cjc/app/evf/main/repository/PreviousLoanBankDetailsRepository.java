package com.cjc.app.evf.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.evf.main.model.PreviousLoanBankDetails;

@Repository
public interface PreviousLoanBankDetailsRepository extends JpaRepository<PreviousLoanBankDetails, Integer>{

}
