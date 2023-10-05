package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="Food")
public class Food {
	
	@Id
	@Column(name="foodid")
	private int foodid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private int price;
	
	@Column(name="description")
	private String description;
	
	@Column(name="fcid")
	private int fcid;
	
	@Column(name="image")
	private String image;
	
	
	@ManyToOne(targetEntity=Food_Category.class,fetch = FetchType.EAGER) 
	@JoinColumn(name="fcid",insertable = false, updatable = false)
	private Food_Category fc;
	
	
	public Food() {
		
	}
	
	

	public Food(int foodid, String name, int price, String description, int fcid,String image) {
		super();
		this.foodid = foodid;
		this.name = name;
		this.price = price;
		this.description = description;
		this.fcid = fcid;
		this.image=image;
	}
	public int getfoodid() {
		return foodid;
	}
	public void setfoodid(int foodid) {
		this.foodid = foodid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getfcid() {
		return fcid;
	}
	public void setfcid(int fcid) {
		this.fcid = fcid;
	}
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}



	@Override
	public String toString() {
		return "Food [foodid=" + foodid + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", fcid=" + fcid + ", image=" + image + ", fc=" + fc + "]";
	}
	
	
	

}
