package com.example.demo.entity;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name ="User")
public class User {
	
	@Id
	@Column(name="uid")
	private int uid;
	
	@Column(name="uname")
	private String uname;
	
	@Column(name="uaddress")
	private String uaddress;
	
	@Column(name="umobile")
	private Long umobile;
	
	@Column(name="upassword")
	private String upassword;
	
	@Column(name="uemail")
	private String uemail;
	
	
	@OneToMany(mappedBy="user")
	private Set<Orders> orders;
	
	
	
	@OneToOne(targetEntity=Cart.class,fetch = FetchType.EAGER) 
	@JoinColumn(name="uid",insertable = false, updatable = false)
	private Cart cart;
	
	
	
	public User() {
		
	
	}
	public User(int uid, String uname, String uaddress, Long umobile, String upassword, String uemail) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uaddress = uaddress;
		this.umobile = umobile;
		this.upassword = upassword;
		this.uemail = uemail;
	}
	
	public int getuid() {
		return uid;
	}

	public void setuid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	public Long getUmobile() {
		return umobile;
	}

	public void setUmobile(Long umobile) {
		this.umobile = umobile;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", uaddress=" + uaddress + ", umobile=" + umobile
				+ ", upassword=" + upassword + ", uemail=" + uemail + "]";
	}

	
}
