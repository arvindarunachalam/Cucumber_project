package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {

	@DataProvider    //(name ="lg")
	private Object[][] loginData() {
    return new Object[][] {
    	{"arvind1","12345678"},
    	{"arvind19","1234567"},
    	{"arvind19","12345678"}
	};
    }
	@Test (dataProvider = "loginData")   //(dataProvider = "lg")othertype using method call by name tag;
	private void automationLogin(String uname,String pass) {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://adactinhotelapp.com/");
	     
	     WebElement user = driver.findElement(By.id("username"));
	     user.sendKeys(uname);
	     WebElement passwrd = driver.findElement(By.id("password"));
	     passwrd.sendKeys(pass);
	     driver.findElement(By.id("login")).click();
	     
	     
	     
	     
	     
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
