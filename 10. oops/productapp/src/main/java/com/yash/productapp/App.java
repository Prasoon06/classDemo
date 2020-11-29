package com.yash.productapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.yash.productapp.exception.NumberSignException;
import com.yash.productapp.model.Led;
import com.yash.productapp.model.Mobile;
import com.yash.productapp.model.Product;
import com.yash.productapp.model.Refrigerator;

/**
 * Hello world!
 *
 */
public class App 
{

	public static void main( String[] args ) throws NumberSignException
	{
		char ch='y';
		ArrayList<Product> Products=new ArrayList<Product>();
		while(ch=='y'){
			System.out.println("--------------Welcome to my supermarket--------------------");
			System.out.println("--------------What do you want to order--------------------");
			System.out.println("1. Mobile");
			System.out.println("2. Led");
			System.out.println("3. Refrigerator");
			System.out.println("0. Exit");

			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();

			switch(choice)
			{
			case 0:
				displayOrder(Products);
				System.out.println("Thanks for your visit \nYour total bill is "+Product.totalPrice+" rs");
				System.exit(0);
			case 1:
				Product mobile=new Mobile(1,"Samsung m31",10000,"Samsung","exynnos",6,64);
				mobile.orderProduct();
				Products.add(mobile);
				break;

			case 2:
				Product led=new Led(2,"Sony tv 560",50000,"Sony","smart",2640,43);
				led.orderProduct();
				Products.add(led);
				break;

			case 3:
				Product fridge=new Refrigerator(3,"Kelvinator x430",20000,"Kelviantor","double door",5,15);
				fridge.orderProduct();
				Products.add(fridge);
				break;

			default:
				System.out.println("Enter a valid option.");
			}
			System.out.println("Do you want to continue:y/n");
			ch=sc.next().charAt(0);
			if(ch=='n'||ch=='N')
			{
				displayOrder(Products);
				System.out.println("Thanks for your visit \nYour total bill is "+Product.totalPrice+" rs");
			}
			else if(ch!='y'||ch!='Y')
				System.out.println("Invalid input:");
			
		}
		
	}
	public static void displayOrder(ArrayList<Product> products)
	{
		System.out.println("------------------Your order summary----------------------");
		Iterator<Product> i=products.iterator();
		while(i.hasNext())
		{
			i.next().getDetails();
		}
	}
}
