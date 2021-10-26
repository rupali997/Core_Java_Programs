package com.cjc.app.evf.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.evf.main.model.Previous_Loan;

@Repository
public interface PreviousLoanRepository extends JpaRepository<Previous_Loan, Integer> {

}
