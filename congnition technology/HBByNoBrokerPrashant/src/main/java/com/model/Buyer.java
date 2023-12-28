package com.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Buyer {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Buyer_id")
	int bid;
	@Column(name="Buyer_Name")
	String bName;
	@Column(name="MobileNo")
	String bMob;
	@Column(name="Email")
	String bEmail;
	@Column(name="Password")
	String bPass;
	@Column(name="Address")
	String bAddr;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbMob() {
		return bMob;
	}
	public void setbMob(String bMob) {
		this.bMob = bMob;
	}
	public String getbEmail() {
		return bEmail;
	}
	public void setbEmail(String bEmail) {
		this.bEmail = bEmail;
	}
	public String getbPass() {
		return bPass;
	}
	public void setbPass(String bPass) {
		this.bPass = bPass;
	}
	public String getbAddr() {
		return bAddr;
	}
	public void setbAddr(String bAddr) {
		this.bAddr = bAddr;
	}

}
