package com.cjc.app.evf.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sanction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sid;
	private String sanctionDate;
	private Long contactDetails;
	private double loanAmtSanctioned;
	private String interestType;
	private double rateOfInterest;
	private int loanTenure;
	private double monthlyEMI;
	private String modeOfPayment;
	private String remark;
	private String termsNCondition;
	private String status;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSanctionDate() {
		return sanctionDate;
	}
	public void setSanctionDate(String sanctionDate) {
		this.sanctionDate = sanctionDate;
	}
	public Long getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(Long contactDetails) {
		this.contactDetails = contactDetails;
	}
	public double getLoanAmtSanctioned() {
		return loanAmtSanctioned;
	}
	public void setLoanAmtSanctioned(double loanAmtSanctioned) {
		this.loanAmtSanctioned = loanAmtSanctioned;
	}
	public String getInterestType() {
		return interestType;
	}
	public void setInterestType(String interestType) {
		this.interestType = interestType;
	}
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public int getLoanTenure() {
		return loanTenure;
	}
	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}
	public double getMonthlyEMI() {
		return monthlyEMI;
	}
	public void setMonthlyEMI(double monthlyEMI) {
		this.monthlyEMI = monthlyEMI;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getTermsNCondition() {
		return termsNCondition;
	}
	public void setTermsNCondition(String termsNCondition) {
		this.termsNCondition = termsNCondition;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	

}
