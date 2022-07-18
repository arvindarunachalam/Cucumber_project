package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Annotation {

	@Parameters({"username","password"})
	@Test
	private void loginDetails(@Optional("VJarvind") String uname,@Optional("7654321") String passwrd) {
		  System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://en-gb.facebook.com/");
	     driver.findElement(By.id("email")).sendKeys(uname);
	     driver.findElement(By.id("pass")).sendKeys(passwrd);
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}
	
	
	
	
	
	
	
	
	
	
	
}
