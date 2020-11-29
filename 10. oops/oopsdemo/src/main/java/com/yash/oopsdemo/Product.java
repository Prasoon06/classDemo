package com.yash.oopsdemo;

public class Product {

	int pid;
	String name;
	double price;
	String company;

	public Product(int pid, String name, double price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
	}
	
	

	public Product(int pid, String name, double price, String company) {
		this(pid,name,price);
		this.company = company;
	}



	void getDetails()
	{
		System.out.println(pid+" "+name+" "+price+" "+company);
	}
	
	/*void setDetails(int pid,String name,double price,String company)
	{
		this.pid=pid;
		this.name=name;
		this.price=price;
		this.company=company; 
	}
	public static void main(String[] args) {
		
//		Product product=new Product();
//		product.setDetails(1,"tv",21000.0,"lg");
//		product.getDetails();
		
		Product product=new Product(1,"tv",21000.0,"lg");
		product.getDetails();
		product.price= 27000.0;
		product.getDetails();
		

	}*/

}
