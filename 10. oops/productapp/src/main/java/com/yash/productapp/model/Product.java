package com.yash.productapp.model;

import com.yash.productapp.exception.NumberSignException;

public abstract class Product {
	int pid;
	String name;
	double price;
	String brand;
	public static double totalPrice;
	
	public Product(int pid, String name, double price, String brand) throws NumberSignException {
		if(price<0)
			throw new NumberSignException("Please enter a positive price");
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.brand = brand;
	}

	public abstract void orderProduct();
	public abstract void getDetails();
	

}
