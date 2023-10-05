package com.example.demo.entity;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name ="Food_Category")
public class Food_Category {

	@Id
	@Column(name="fcid")
	private int fcid;

	@Column(name="fcname")
	private String fcname;

	
	@OneToMany(mappedBy = "fc")    
	private Set<Food> food;

	public Food_Category()
	{


	}

	public Food_Category(int fcid, String fcname) {
		super();
		this.fcid = fcid;
		this.fcname = fcname;
	}
	
	public int getfcid() {
		return fcid;
	}
	public void setfcid(int fcid) {
		this.fcid = fcid;
	}
	public String getfcname() {
		return fcname;
	}
	public void setfcname(String fcname) {
		this.fcname = fcname;
	}

	@Override
	public String toString() {
		return "Food_Category [fcid=" + fcid + ", fcname=" + fcname + "]";
	}



}
