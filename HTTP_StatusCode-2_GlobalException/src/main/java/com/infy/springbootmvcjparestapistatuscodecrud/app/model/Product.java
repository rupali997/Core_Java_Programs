package com.infy.springbootmvcjparestapistatuscodecrud.app.model;

public class Product {

	
	private int pid;
	private String pname;
	private String cost;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public Product(int pid, String pname, String cost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.cost = cost;
	}
	
	
	
}
