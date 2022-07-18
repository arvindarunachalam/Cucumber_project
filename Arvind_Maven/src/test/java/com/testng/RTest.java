package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RTest {
	
	@Test (retryAnalyzer = RetryClass.class)
	private void credenTials() {
     String expected="Dhoni";
     String actual = "Dhoni";
     Assert.assertEquals(actual, expected);
	}

	@Test(retryAnalyzer = RetryClass.class)
	private void logIn() {
		 String expected="MsDhoni";
	     String actual = "Dhoni";
	     Assert.assertEquals(actual, expected);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
