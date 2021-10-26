package com.cjc.app.evf.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DocumentDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int docId;
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	private int customerId;
	private String addressProof;
	private String bankStatement;
	private String iTR;
	private String photo;
	private String blankCheck;
	private String thumb;
	private String salarySlip;
	private String signature;
	private String aadharCard;
	private String panCard;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getAddressProof() {
		return addressProof;
	}
	public void setAddressProof(String addressProof) {
		this.addressProof = addressProof;
	}
	public String getBankStatement() {
		return bankStatement;
	}
	public void setBankStatement(String bankStatement) {
		this.bankStatement = bankStatement;
	}
	public String getiTR() {
		return iTR;
	}
	public void setiTR(String iTR) {
		this.iTR = iTR;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getBlankCheck() {
		return blankCheck;
	}
	public void setBlankCheck(String blankCheck) {
		this.blankCheck = blankCheck;
	}
	public String getThumb() {
		return thumb;
	}
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
	public String getSalarySlip() {
		return salarySlip;
	}
	public void setSalarySlip(String salarySlip) {
		this.salarySlip = salarySlip;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	
	
	
	
}
