package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {
	public static WebDriver driver;
	 
	
	@Test
        private void amazonUrl() {
         System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
         driver=new ChromeDriver();
         driver.get("https://www.amazon.com/");
         driver.manage().window().maximize();
		}
	
	@Test
	   private void filpkartUrl() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
		
	}
	
	
	
}
