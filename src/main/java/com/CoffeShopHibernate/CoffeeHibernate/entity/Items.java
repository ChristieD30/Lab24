package com.CoffeShopHibernate.CoffeeHibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Items {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	
	 private String brand;
	 private String description;
	 private String imagePath;
	 private Double price;
	 
	 
	 
	 
	 
	 
	public Items(String brand, String description, String imagePath,  double price, int id) {
		super();
		this.brand = brand;
		this.description = description;
		this.price = price;
		this.id = id;
		this.imagePath = imagePath;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Items(String brand, String description, double price, int id) {
		super();
		this.brand = brand;
		this.description = description;
		this.price = price;
		this.id = id;
	}
	public Items(String brand, String description, double price) {
		super();
		this.brand = brand;
		this.description = description;
		this.price = price;
	}
	public Items() {
		super();
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}



}
