package com.Actions_robots;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
  public static void main(String[] args) throws AWTException, InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	Actions act =new Actions(driver);
	 Robot robo = new Robot();
	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
	
	
	Thread.sleep(2000);
	
	act.dragAndDrop(drag, drop).perform();
	driver.navigate().to("https://www.amazon.in/");
	Thread.sleep(3000);
	
	WebElement fas = driver.findElement(By.linkText("Fashion"));
	act.moveToElement(fas).perform();
	WebElement prime = driver.findElement(By.linkText("Prime"));
	act.moveToElement(prime).perform();
	//contextclick
	WebElement mob = driver.findElement(By.linkText("Mobiles"));
	act.contextClick(mob).perform();
	robo.keyPress(KeyEvent.VK_DOWN);
	robo.keyRelease(KeyEvent.VK_DOWN);
	robo.keyPress(KeyEvent.VK_DOWN);
	robo.keyRelease(KeyEvent.VK_DOWN);
	
	
	
	
	
	
}
}
