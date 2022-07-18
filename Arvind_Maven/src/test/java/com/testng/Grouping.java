package com.testng;

import org.testng.annotations.Test;

public class Grouping {
	
	
	@Test (groups = "NonVeg")
	private void chickenBurger() {
    System.out.println("Burger");
	}
	
	@Test(groups = "NonVeg")
	private void chickenPizza() {
    System.out.println("Pizza");
	}
	
	@Test(groups = "Snacks")
	private void frenchFries() {
    System.out.println("Fries");
	}
	
	@Test(groups = "Snacks")
	private void smileyFries() {
    System.out.println("Smiley");
	}
	
	@Test(groups = "Education")
	private void book() {
    System.out.println("book");
	}
	
	@Test(groups = "Education")
	private void pen() {
    System.out.println("pen");
	}
	
	
	
	
	

}
