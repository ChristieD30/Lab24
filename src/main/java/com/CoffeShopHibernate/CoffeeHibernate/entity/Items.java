package com.CoffeShopHibernate.CoffeeHibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table (name = "items")
public class Items {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	 private String brand;
	 private String description;
	
	 private Double price;
	 
	 
	 
	 
	 
	 
	public Items(String brand, String description,  double price, Integer id) {
		super();
		this.brand = brand;
		this.description = description;
		this.price = price;
		this.id = id;
	
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
