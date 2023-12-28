package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Owner")
public class Owner {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Owner_id")
	int oid;
	@Column(name="Owner_Name")
	String oName;
	@Column(name="MobileNo")
	String oMob;
	@Column(name="Email")
	String oEmail;
	@Column(name="Password")
	String oPass;
	@Column(name="Address")
	String oAddr;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Owner_id")
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	public String getoMob() {
		return oMob;
	}
	public void setoMob(String oMob) {
		this.oMob = oMob;
	}
	public String getoEmail() {
		return oEmail;
	}
	public void setoEmail(String oEmail) {
		this.oEmail = oEmail;
	}
	public String getoPass() {
		return oPass;
	}
	public void setoPass(String oPass) {
		this.oPass = oPass;
	}
	public String getoAddr() {
		return oAddr;
	}
	public void setoAddr(String oAddr) {
		this.oAddr = oAddr;
	}
	
	
}
