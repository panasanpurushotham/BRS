package com.EduBridge.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class AddbikeModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
//	byte[] img;
	String brand;
	String model;
	String price;
	
public AddbikeModel() {
		
	}
public AddbikeModel(int id,  String brand, String model, String price) {
	super();
	this.id = id;
//	this.img = img;
	this.brand = brand;
	this.model = model;
	this.price = price;
}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
//	public byte[] getImg() {
//		return img;
//	}
//	public void setImg(byte[] img) {
//		this.img = img;
//	}
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public static AddbikeModel save(AddbikeModel bike) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
