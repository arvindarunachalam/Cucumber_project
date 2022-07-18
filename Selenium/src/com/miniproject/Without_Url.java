package com.miniproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_Url {
  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aruna\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 	
}
}
