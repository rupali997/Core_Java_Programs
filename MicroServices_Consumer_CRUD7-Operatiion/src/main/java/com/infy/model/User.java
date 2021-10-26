package com.infy.model;

public class User {

	private int uid;
	private String name;
	private String username;
	private String password;
	
	
	private Address addr;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", username=" + username + ", password=" + password + ", addr="
				+ addr + "]";
	}
	
	
}
