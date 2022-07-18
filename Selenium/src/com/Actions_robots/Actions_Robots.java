package com.Actions_robots;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Robots {
    public static void main(String[] args) throws InterruptedException, AWTException {
//    	action		
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aruna\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.google.com/");
    	driver.manage().window().maximize();
    	

    	WebElement img = driver.findElement(By.xpath("(//a[@target='_top'])[2]"));
    	
    	       Actions act =new Actions(driver);
// (left lick)       	act.click(img).build().perform(); 
    	       
// (right click)   	       act.contextClick(img).build().perform();
    	
//(double click)    	        act.doubleClick(img).build().perform();
    	
//    	          Robot ----> keyword 
    	       
  	          Robot robo = new Robot();
  	    	 Thread.sleep(3000);
  	    	 
  	    	 act.contextClick(img).build().perform();
  	    	 
  	              	robo.keyPress(KeyEvent.VK_PAGE_DOWN);
  	    	        robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
  	    	    	robo.keyPress(KeyEvent.VK_PAGE_DOWN);
	    	        robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    	    	robo.keyPress(KeyEvent.VK_PAGE_DOWN);
  	    	        robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
  	    	        robo.keyPress(KeyEvent.VK_ENTER);
  	    	        
  	    	        
  	   	 
  	   	 
    	
    	
    	
    	
    	
	}
}
