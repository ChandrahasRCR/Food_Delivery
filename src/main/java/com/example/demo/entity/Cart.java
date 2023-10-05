package com.example.demo.entity;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name ="Cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="serialno")
	private int serialno;
//	@Id
	@Column(name="cartid")
	private int cartid;
	
	@Column(name="uid")
	private int uid;
	
	@Column(name="foodid")
	private int foodid;
	
	@Column(name="quantity")
	private int quantity;

	public Cart() {
	}

	public Cart(int serialno, int cartid, int uid, int foodid, int quantity) {
		super();
		this.serialno = serialno;
		this.cartid = cartid;
		this.uid = uid;
		this.foodid = foodid;
		this.quantity = quantity;
	}
	public Cart( int cartid, int uid, int foodid, int quantity) {
	super();
		this.cartid = cartid;
		this.uid = uid;
		this.foodid = foodid;
		this.quantity = quantity;
	}

	public int getSerialno() {
		return serialno;
	}

	public void setSerialno(int serialno) {
		this.serialno = serialno;
	}

	public int getCartid() {
		return cartid;
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getFoodid() {
		return foodid;
	}

	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Cart [serialno=" + serialno + ", cartid=" + cartid + ", uid=" + uid + ", foodid=" + foodid
				+ ", quantity=" + quantity + "]";
	}
	
	}
	 
	