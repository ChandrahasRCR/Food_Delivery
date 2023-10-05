package com.example.demo.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="Orders")
public class Orders {

    @Id
	@Column(name="oid")
	private int oid;
	
	@Column(name="uid")
	private int uid;
	
	@Column(name="foodid")
	private int foodid;
	
	//manytoone(user)
	
	
//	@ManyToOne(mappedBy = "User")    
//	private Set<User> user;
	
	@ManyToOne(targetEntity=User.class,fetch = FetchType.EAGER) 
    @JoinColumn(name="uid",insertable = false, updatable = false)
	private User user;
	
	
	public Orders() {
		
	}
	public Orders(int oid, int uid, int foodid) {
		super();
		this.oid = oid;
		this.uid = uid;
		this.foodid = foodid;
	}
	public int getoid() {
		return oid;
	}
	public void setoid(int oid) {
		this.oid = oid;
	}
	public int getuid() {
		return uid;
	}
	public void setuid(int uid) {
		this.uid = uid;
	}
	public int getfoodid() {
		return foodid;
	}
	public void setfoodid(int foodid) {
		this.foodid = foodid;
	}
	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", uid=" + uid + ", foodid=" + foodid + "]";
	}


}
