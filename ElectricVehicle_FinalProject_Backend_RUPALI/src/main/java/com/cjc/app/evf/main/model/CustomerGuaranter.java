package com.cjc.app.evf.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerGuaranter {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int gId;
	private String gName;
	private String gRealtionWithCustomer;
	private Long gMobileNo;
	private String gAadhar;
	private String gPan;
	private String gJobDetails;
	private Long gAlternateNo;
	private String houseNo;
	private String city;
	private int pincode;
	private String streetName;
	private String area;
	private String landmark;
	private String taluka;
	private String district;
	private String state;
	private String country;
	
//	@OneToOne(cascade=CascadeType.ALL)
//	private GuaranterAddress gAddress;

	public int getgId() {
		return gId;
	}

	public void setgId(int gId) {
		this.gId = gId;
	}

	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public String getgRealtionWithCustomer() {
		return gRealtionWithCustomer;
	}

	public void setgRealtionWithCustomer(String gRealtionWithCustomer) {
		this.gRealtionWithCustomer = gRealtionWithCustomer;
	}

	public Long getgMobileNo() {
		return gMobileNo;
	}

	public void setgMobileNo(Long gMobileNo) {
		this.gMobileNo = gMobileNo;
	}

	public String getgAadhar() {
		return gAadhar;
	}

	public void setgAadhar(String gAadhar) {
		this.gAadhar = gAadhar;
	}

	public String getgPan() {
		return gPan;
	}

	public void setgPan(String gPan) {
		this.gPan = gPan;
	}

	public String getgJobDetails() {
		return gJobDetails;
	}

	public void setgJobDetails(String gJobDetails) {
		this.gJobDetails = gJobDetails;
	}

	public Long getgAlternateNo() {
		return gAlternateNo;
	}

	public void setgAlternateNo(Long gAlternateNo) {
		this.gAlternateNo = gAlternateNo;
	}

	

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getTaluka() {
		return taluka;
	}

	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

////	@JsonManagedReference
//	@JsonBackReference
//	public GuaranterAddress getgAddress() {
//		return gAddress;
//	}
//
//	public void setgAddress(GuaranterAddress gAddress) {
//		this.gAddress = gAddress;
//	}
//	
	
	
	
	
}
