package com.windowhandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {
    public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aruna\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement mob = driver.findElement(By.xpath(" //a[text()='Mobiles']"));
    	
		Actions act = new Actions(driver);
		act.contextClick(mob).build().perform();
		
		Robot ro = new Robot();
		
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);

		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement fas = driver.findElement(By.xpath("//a[text()='Fashion']"));
		act.contextClick(fas).build().perform();
		 
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);

		ro.keyPress(KeyEvent.VK_ENTER);
		ro .keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> wh = driver.getWindowHandles();
		for (String t : wh) {
		 String title = driver.switchTo().window(t).getTitle();
			System.out.println(title);
		}
		
		String mytitle = "Clothing, Footwear and Accessories online for Men, Women and Kids";
		for (String string : wh) {
			System.out.println(string);
		}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}
}
