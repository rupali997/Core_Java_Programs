package com.infy.springbootmvcjpacrud.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {
	@Id
	private int rid;
	private String rolename;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	
	

}
