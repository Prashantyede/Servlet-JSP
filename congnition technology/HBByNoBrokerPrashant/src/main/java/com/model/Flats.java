package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.tomcat.jni.Address;

@Entity
@Table
public class Flats {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="FlatID")
  int fid;
	@Column(name="CarpetArea")
  int Carea;
	@Column(name="Type")
	String Type;
	@Column(name="Rooms")
	String Rooms;
	@Column(name="Rent")
	int rent;
	@Column(name="Deposite")
	int deposite;
	@Column(name="Maintinance")
	int maint;
	@Column(name="Amenities")
	String amnt;
	@Column(name="Address")
	@OneToOne(cascade=CascadeType.ALL)
	Address addr;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public int getCarea() {
		return Carea;
	}
	public void setCarea(int carea) {
		Carea = carea;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getRooms() {
		return Rooms;
	}
	public void setRooms(String rooms) {
		Rooms = rooms;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public int getDeposite() {
		return deposite;
	}
	public void setDeposite(int deposite) {
		this.deposite = deposite;
	}
	public int getMaint() {
		return maint;
	}
	public void setMaint(int maint) {
		this.maint = maint;
	}
	public String getAmnt() {
		return amnt;
	}
	public void setAmnt(String amnt) {
		this.amnt = amnt;
	}
	
	
	
  

}
