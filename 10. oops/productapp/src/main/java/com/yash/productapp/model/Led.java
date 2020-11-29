package com.yash.productapp.model;

import com.yash.productapp.exception.NumberSignException;

public class Led extends Product{
	String type;
	int resolution;
	int screenSize;
	public Led(int pid, String name, double price, String brand, String type, int resolution, int screenSize)
			throws NumberSignException {
		super(pid, name, price, brand);
		this.type = type;
		this.resolution = resolution;
		this.screenSize = screenSize;
	}
	public void getDetails() {
		System.out.println("pid="+pid+" ,name="+name+" ,price="+price+" ,brand="+brand+" ,type="+type+" "
				+ " ,resolution="+resolution+" ,screenSize="+screenSize);

	}
	public void orderProduct() {
		System.out.println("Your led is ordered");
		totalPrice+=price;
	}
}
