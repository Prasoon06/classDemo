package com.yash.abstraction;

public class Mobile extends Product implements IProduct{

	int ram;
	String processor;
	int cameraPixels;

	

	Mobile()
	{
		super();
	}
	public Mobile(int pid, String name, double price, String company, int ram, String processor, int cameraPixels) throws NumberSizeException {
		super(pid, name, price, company);
		this.ram = ram;
		this.processor = processor;
		this.cameraPixels = cameraPixels;
	}

	@Override
	void showMessage() {
		System.out.println("hiii");

	}

	@Override
	void showMessage(int i) {
		System.out.println("hii "+i);

	}

	@Override
	void getDetails() {
		System.out.println(pid+" "+name+" "+price+" "+company+" "+ram+" "+processor+" "+cameraPixels+" "+productCategory);
		
	}

	public void orderProduct() {
		System.out.println("Product is ordered");
		
	}

}
