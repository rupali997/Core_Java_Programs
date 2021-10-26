package com.cjc.app.evf.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Previous_Loan {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pLoanId;
	private String bName;
	private Long bAccNo;
	private String ifscCode;
	private String micrCode;
	private String bBranch;
	private double pLoanAmt;
	private int pLoanTenure;
	private double paidAmt;
	private double remainingAmt;
	private int defaulterCount;
	public int getpLoanId() {
		return pLoanId;
	}
	public void setpLoanId(int pLoanId) {
		this.pLoanId = pLoanId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public Long getbAccNo() {
		return bAccNo;
	}
	public void setbAccNo(Long bAccNo) {
		this.bAccNo = bAccNo;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getMicrCode() {
		return micrCode;
	}
	public void setMicrCode(String micrCode) {
		this.micrCode = micrCode;
	}
	public String getbBranch() {
		return bBranch;
	}
	public void setbBranch(String bBranch) {
		this.bBranch = bBranch;
	}
	public double getpLoanAmt() {
		return pLoanAmt;
	}
	public void setpLoanAmt(double pLoanAmt) {
		this.pLoanAmt = pLoanAmt;
	}
	public int getpLoanTenure() {
		return pLoanTenure;
	}
	public void setpLoanTenure(int pLoanTenure) {
		this.pLoanTenure = pLoanTenure;
	}
	public double getPaidAmt() {
		return paidAmt;
	}
	public void setPaidAmt(double paidAmt) {
		this.paidAmt = paidAmt;
	}
	public double getRemainingAmt() {
		return remainingAmt;
	}
	public void setRemainingAmt(double remainingAmt) {
		this.remainingAmt = remainingAmt;
	}
	public int getDefaulterCount() {
		return defaulterCount;
	}
	public void setDefaulterCount(int defaulterCount) {
		this.defaulterCount = defaulterCount;
	}

	
	
	
	
	
	

}
