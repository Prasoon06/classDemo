package testdemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemoNew {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		
		try {
			int size=sc.nextInt();
			int array[]=new int[size];
			System.out.println("Array is created successfully");
		}
		catch(NumberFormatException | NegativeArraySizeException | InputMismatchException e)
		{
			System.err.println(e+" Array cannot be created");
		}

	}
}
