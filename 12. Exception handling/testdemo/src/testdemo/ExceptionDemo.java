package testdemo;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to convert to double:");
		String s=sc.next();
		try {
			double d=Double.parseDouble(s);
			System.out.println(d);
		}
		catch(NumberFormatException e)
		{
			System.err.println("String "+s+" cannnot be converted to double");
		}

	}

}
