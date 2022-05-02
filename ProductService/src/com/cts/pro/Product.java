package com.cts.pro;

import java.io.Serializable;

public class Product implements Serializable{
	private int pId;
	private String name;
	private int price;
	public Product() {
		super();
	}
	public Product(int pId, String name, int price) {
		super();
		this.pId = pId;
		this.name = name;
		this.price = price;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
		
	
}
	
	