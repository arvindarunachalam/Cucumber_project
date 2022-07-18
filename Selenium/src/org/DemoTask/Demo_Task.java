package org.DemoTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Task {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aruna\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/register");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Jack");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Sparrow");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("jackie123@gmil.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("jack123");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("jack123");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("jackie123@gmil.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("jack123");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	}
