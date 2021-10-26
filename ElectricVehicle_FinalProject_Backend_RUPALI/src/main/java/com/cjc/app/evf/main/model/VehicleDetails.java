package com.cjc.app.evf.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VehicleDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int vId;
	private String vType;
	private String vModelNo;
	private String companyName;
	private double vPrice;
	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}
	public String getvType() {
		return vType;
	}
	public void setvType(String vType) {
		this.vType = vType;
	}
	public String getvModelNo() {
		return vModelNo;
	}
	public void setvModelNo(String vModelNo) {
		this.vModelNo = vModelNo;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getvPrice() {
		return vPrice;
	}
	public void setvPrice(double vPrice) {
		this.vPrice = vPrice;
	}
	
	

}
