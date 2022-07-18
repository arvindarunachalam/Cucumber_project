package com.testng;

import org.testng.annotations.Test;

public class ExpectedExpection {
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void arithematicExpection() {
      int a=1/0;
      System.out.println(a);
	}

}
