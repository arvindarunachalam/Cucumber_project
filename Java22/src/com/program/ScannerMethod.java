package com.program;

import java.util.Scanner;

public class ScannerMethod {
	

	public static void main(String[] args) {
		
		Scanner y = new Scanner(System.in);
		
		System.out.println("enter your name");
		String name = y.next();
		System.out.println(name);
		
		y.nextLine(); //for void 
		
		System.out.println(" enter your name1");
		String name1 = y.nextLine();
		System.out.println(name1);
		
		System.out.println("enter your id");
		int id = y.nextInt();
		System.out.println(id);
		
		System.out.println("enter your number");
		float number = y.nextFloat();
				System.out.println(number);
				

		
	}
	
}
