package com.yash.productapp.exception;

public class NumberSignException extends Exception {
	/**
	 * 
	 */
	public NumberSignException()
	{
		System.err.println("Please enter a positive price");
	}
	public NumberSignException(String s)
	{
		super(s);
	}
}
