package com.cjc.app.evf.main.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Customer_Registration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int custId;
	private String custName;
	private String custDOB;
	private String custGender;
	private String custMaritalStatus;
	private Long custMobNo;
	private Long custAlternateNo;
	private int custCibilScore;
	private double downpayemnt;
	private double custEMI;
	private double tenure;

	@OneToOne(cascade = CascadeType.ALL)
	private Customer_Address custAddress;
	
	public Customer_Address getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(Customer_Address custAddress) {
		this.custAddress = custAddress;
	}

	@OneToMany(cascade = CascadeType.ALL)
	private List<CustomerGuaranter> custGurantor;

	@OneToOne(cascade = CascadeType.ALL)
	private ProfessionDetails custProfessionDetails;

	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails custBankDetails;

	@OneToOne(cascade = CascadeType.ALL)
	private DocumentDetails custDoc;

	@OneToOne(cascade = CascadeType.ALL)
	private VehicleDetails vehicleDetails;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Previous_Loan> ploan;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustDOB() {
		return custDOB;
	}

	public void setCustDOB(String custDOB) {
		this.custDOB = custDOB;
	}

	public String getCustGender() {
		return custGender;
	}

	public void setCustGender(String custGender) {
		this.custGender = custGender;
	}

	public String getCustMaritalStatus() {
		return custMaritalStatus;
	}

	public void setCustMaritalStatus(String custMaritalStatus) {
		this.custMaritalStatus = custMaritalStatus;
	}

	public Long getCustMobNo() {
		return custMobNo;
	}

	public void setCustMobNo(Long custMobNo) {
		this.custMobNo = custMobNo;
	}

	public Long getCustAlternateNo() {
		return custAlternateNo;
	}

	public void setCustAlternateNo(Long custAlternateNo) {
		this.custAlternateNo = custAlternateNo;
	}

	public int getCustCibilScore() {
		return custCibilScore;
	}

	public void setCustCibilScore(int custCibilScore) {
		this.custCibilScore = custCibilScore;
	}

	public double getDownpayemnt() {
		return downpayemnt;
	}

	public void setDownpayemnt(double downpayemnt) {
		this.downpayemnt = downpayemnt;
	}

	public double getCustEMI() {
		return custEMI;
	}

	public void setCustEMI(double custEMI) {
		this.custEMI = custEMI;
	}

	public double getTenure() {
		return tenure;
	}

	public void setTenure(double tenure) {
		this.tenure = tenure;
	}

	public List<CustomerGuaranter> getCustGurantor() {
		return custGurantor;
	}

	public void setCustGurantor(List<CustomerGuaranter> custGurantor) {
		this.custGurantor = custGurantor;
	}

	public ProfessionDetails getCustProfessionDetails() {
		return custProfessionDetails;
	}

	public void setCustProfessionDetails(ProfessionDetails custProfessionDetails) {
		this.custProfessionDetails = custProfessionDetails;
	}

	public BankDetails getCustBankDetails() {
		return custBankDetails;
	}

	public void setCustBankDetails(BankDetails custBankDetails) {
		this.custBankDetails = custBankDetails;
	}

	public DocumentDetails getCustDoc() {
		return custDoc;
	}

	public void setCustDoc(DocumentDetails custDoc) {
		this.custDoc = custDoc;
	}

	public VehicleDetails getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(VehicleDetails vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

//	@JsonBackReference
//	 @JsonManagedReference
	public List<Previous_Loan> getPloan() {
		return ploan;
	}

	public void setPloan(List<Previous_Loan> ploan) {
		this.ploan = ploan;
	}

}
