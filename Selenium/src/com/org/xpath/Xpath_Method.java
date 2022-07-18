package com.org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Method {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aruna\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("arvindvijay");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("arv1234");
		
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
