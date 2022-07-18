package com.org.WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Method {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\aruna\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
//		sendkeys
		
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("arvindvijay@gmail.com");
		
//		isdisplayed
		
		boolean displayed = findElement.isDisplayed();
		System.out.println(displayed);
		
//		sendkeys
		
		WebElement password = driver.findElement(By.id("pass"));	
		password.sendKeys("12345678");
//		isenabled
		
		boolean enabled = password.isEnabled();
		System.out.println(enabled);
		
//		click
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
//		isselected
		
		boolean selected = findElement.isSelected();
		System.out.println();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
