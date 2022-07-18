  package com.testng;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test_Ng {
	
	@BeforeSuite
	
	
	public void browser() {
		System.out.println("browser");
		
	}
	@Test
	public void url() {
		System.out.println("url");
	}

}
