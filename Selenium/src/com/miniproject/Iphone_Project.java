package com.miniproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone_Project {
  public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone"+Keys.ENTER);
	List<WebElement> iphone = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	for (WebElement out : iphone) {
		System.out.println(out.getText());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
