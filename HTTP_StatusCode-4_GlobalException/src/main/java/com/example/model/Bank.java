package com.example.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Bank {
	
	@Id
	private String bname;
	private  String accno;
	private String ifsc;
	private String addr;
	private String balence;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private User user;
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getBalence() {
		return balence;
	}
	public void setBalence(String balence) {
		this.balence = balence;
	}
	
	
}
