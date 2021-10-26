package com.cjc.app.evf.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProfessionDetails {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	private String presentEmployee;
	private String designation;
	private String currentOccupation;
	private int yoe;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPresentEmployee() {
		return presentEmployee;
	}
	public void setPresentEmployee(String presentEmployee) {
		this.presentEmployee = presentEmployee;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCurrentOccupation() {
		return currentOccupation;
	}
	public void setCurrentOccupation(String currentOccupation) {
		this.currentOccupation = currentOccupation;
	}
	public int getYoe() {
		return yoe;
	}
	public void setYoe(int yoe) {
		this.yoe = yoe;
	}
	
	
	
	
	
}
