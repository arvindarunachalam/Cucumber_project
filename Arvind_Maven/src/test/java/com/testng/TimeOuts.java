package com.testng;

import org.testng.annotations.Test;

public class TimeOuts {
	
	@Test(timeOut = 2000)
	private void credenTials() throws InterruptedException {
     System.out.println("Arvind");
     Thread.sleep(3000);
     System.out.println("Aravind");
	}

}
