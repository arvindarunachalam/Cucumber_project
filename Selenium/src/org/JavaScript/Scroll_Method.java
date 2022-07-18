package org.JavaScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Method {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aruna\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor ja = (JavascriptExecutor)driver;
		
		ja.executeScript("window.scrollBy(0,5000);");
		
		ja.executeScript("window.scrollBy(0,-2000);");
		
	 WebElement country = driver.findElement(By.xpath("//a [text()='Canada']"));
	 
	 ja.executeScript("arguments[0].click();",country);
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File scr = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\aruna\\eclipse-workspace\\Selenium\\Screenshot\\task.png");
		
		FileUtils.copyFile(scr,dest);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
