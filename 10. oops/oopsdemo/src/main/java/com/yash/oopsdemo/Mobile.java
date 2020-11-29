package com.yash.oopsdemo;

public class Mobile extends Product {

	int ram;
	String processor;
	int cameraPixels;
	public Mobile(int pid, String name, double price,String company, int ram, String processor, int cameraPixels) {
		super(pid, name, price,company);
		this.ram = ram;
		this.processor = processor;
		this.cameraPixels = cameraPixels;
	}
	
	void getDetails()
	{
		System.out.println(pid+" "+name+" "+price+" "+company+" "+ram+" "+processor+" "+cameraPixels);
	}
	
	
	
}
