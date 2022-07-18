package com.testng;

import org.testng.annotations.Test;

public class DependenceOn {

	
	@Test
	private void diwaliFestival() {
    System.out.println("diwali");
	}
	
	@Test(dependsOnMethods = "diwaliFestival")
	private void cracKers() {
    System.out.println("Bijili");
	}
	
	@Test(dependsOnMethods = "diwaliFestival")
	private void gulabJamun() {
    System.out.println("jamun");
	}
	
	@Test
	private void Pongal() {
    System.out.println("pongal");
	}
	
	
}
