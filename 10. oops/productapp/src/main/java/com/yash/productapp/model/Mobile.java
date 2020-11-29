package com.yash.productapp.model;

import com.yash.productapp.exception.NumberSignException;

public class Mobile extends Product {
	String processor;
	int ram;
	int cameraPixels;
	
	public Mobile(int pid, String name, double price, String brand, String processor, int ram,
			int cameraPixels) throws NumberSignException {
		super(pid, name, price, brand);
		this.processor = processor;
		this.ram = ram;
		this.cameraPixels = cameraPixels;
	}

	public void getDetails() {
		System.out.println("pid="+pid+" ,name="+name+" ,price="+price+" ,brand="+brand+" ,processor="+
	         processor+" ,ram="+ram+" ,cameraPixels="+cameraPixels);
	}

	public void orderProduct() {
		System.out.println("Your mobile is ordered");
		totalPrice+=price;
	}	
}
