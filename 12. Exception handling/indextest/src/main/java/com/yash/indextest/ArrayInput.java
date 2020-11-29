package com.yash.indextest;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		String array[]= {"aman","aashish","raj","tarun","abhi","vipul","ankur","pawan","prasoon","namrata"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the position to view the name:");
		int choice=sc.nextInt();
		
		try {
			System.out.println("The name at position "+choice+" is "+array[choice]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println(e+" :Please enter a valid index between 0 and 9");
		}
	}

}
