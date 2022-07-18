package com.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Work {
    public static void main(String[] args) throws InterruptedException {
		
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\aruna\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
    	
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("http://demo.automationtesting.in/Frames.html");
    	
    	driver.switchTo().frame(0);
    	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");   //singleframe
   	driver.switchTo().defaultContent();   //defaultcontent
   	driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
   	Thread.sleep(3000);//iframe or multiframe
 // 	WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
 	driver.switchTo().frame(1);     //outerframe
  	WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
 	driver.switchTo().frame(innerframe); 
 	//innerframe
 	//driver.switchTo().frame(2);
	Thread.sleep(3000);
 	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hi guys");
        	//driver.close();
   	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}
}
