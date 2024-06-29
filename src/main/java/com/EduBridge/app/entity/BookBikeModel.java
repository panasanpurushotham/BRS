package com.EduBridge.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class BookBikeModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String brand;
	String model;
	String fname;
	
	String contact;
	String date;
	 int userid;

public BookBikeModel() {
		
	}

public BookBikeModel(int id, String brand, String model, String fname, String contact, String date,int userid) {
	super();
	this.id = id;
	this.brand = brand;
	this.model = model;
	this.fname = fname;
	this.contact = contact;
	this.date = date;
	this.userid = userid;
}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	

	
}
