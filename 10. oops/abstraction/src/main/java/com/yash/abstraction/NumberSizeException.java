package com.yash.abstraction;

public class NumberSizeException extends Exception {
	NumberSizeException()
	{
		System.out.println("Invalid input:Price cannot be negative");
	}
}
