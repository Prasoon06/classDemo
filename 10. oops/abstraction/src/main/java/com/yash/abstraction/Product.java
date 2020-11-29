package com.yash.abstraction;

public abstract class Product {

	int pid;
	String name;
	double price;
	String company;
	
	Product()
	{
		System.out.println("empty");
	}

	public Product(int pid, String name, double price, String company) throws NumberSizeException {
		if(price<0) {
			throw new NumberSizeException();
		}
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.company = company;
	}

	abstract void showMessage();
	abstract void showMessage(int i);


	abstract void getDetails();
	
	void a()
	{
		System.out.println("a");
	}
	
	void a(int i)
	{
		System.out.println("a"+i);
	}
}
