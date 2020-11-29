package com.yash.productapp.model;

import com.yash.productapp.exception.NumberSignException;

public class Refrigerator extends Product{
	String type;
	int stars;
	int temperature;
	public Refrigerator(int pid, String name, double price, String brand, String type, int stars, int temperature)
			throws NumberSignException {
		super(pid, name, price, brand);
		this.type = type;
		this.stars = stars;
		this.temperature = temperature;
	}
	public void getDetails() {
		System.out.println("pid="+pid+" ,name="+name+" ,price="+price+" ,brand="+brand+" ,type="+type
				+" ,stars="+stars+" ,temperature="+temperature);
		
	}
	public void orderProduct() {
		System.out.println("Your fridge is ordered");
		totalPrice+=price;
		
	}
	
	
	
	
	
}
