 package com.pojo;

public class Pojo_B {
	public static void main(String[] args) {
		 Pojo_A p=new Pojo_A();
		 
	int a = p.getA();
	System.out.println(a);
	
	p.setA(199);
	
	int a2 = p.getA();
	System.out.println(a2);
	}
   
}
