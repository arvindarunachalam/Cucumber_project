package org.com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Method {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aruna\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement simp = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		simp.click();
		Alert simpalert = driver.switchTo().alert();
		simpalert.accept();
		
		WebElement conf = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		conf.click();
		Alert confalert = driver.switchTo().alert();
		confalert.dismiss();
	
		WebElement promt = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		promt.click();
		Alert promtalert = driver.switchTo().alert();
		promtalert.sendKeys("Selenium");
		promtalert.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
