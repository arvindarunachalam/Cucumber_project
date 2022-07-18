package org.screenshot;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Method {

	public static void main(String[] args) throws IOException   {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aruna\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		TakesScreenshot dde =(TakesScreenshot) driver;
		
		File scr = dde.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\aruna\\eclipse-workspace\\Selenium\\Screenshot\\flips.png");
		
		FileUtils.copyFile(scr,dest); //with dependency

		
		//FileHandler.copy(scr, dest);  //without dependency
		
		
		 
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
