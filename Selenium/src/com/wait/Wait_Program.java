package com.wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Program {
    public static void main(String[] args) {
		
    	System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.facebook.com/");
    	
//    	implicitwait
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	driver.findElement(By.id("email")).sendKeys("arvind@gmail.com");
    	
//    	explicitwait
    	
    	WebElement pw = driver.findElement(By.id("pass"));
    	
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.visibilityOf(pw));
    	
    	pw.sendKeys("1234567");
    	
//    	task
    	
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	driver.findElement(By.xpath("//button[@name='login']")).click();
    	
    	
    	
    	
    	
    	
    	
	}
}
