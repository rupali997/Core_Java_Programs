package com.example.model;

import javax.persistence.Entity;

@Entity
public class Faculty {

	private Long fid;
	private String name;
	private int experience;
	private boolean isactive=true;
	
	private boolean isactive() {
		return isactive;
	}
	
	public void isactive(boolean isactive) {
		this.isactive=isactive;
	}
	
	public String image;

	public Long getFid() {
		return fid;
	}

	public void setFid(Long fid) {
		this.fid = fid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
}
