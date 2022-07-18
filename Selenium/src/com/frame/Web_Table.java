package com.frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
       public static void main(String[] args) {
    		System.setProperty("webdriver.chrome.driver", 
    				"C:\\Users\\aruna\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
    		
    		WebDriver driver = new ChromeDriver();
    		
    		driver.get("http://www.leafground.com/pages/table.html");
    		
    		driver.manage().window().maximize();
    		
    		System.out.println("****all data****");
    		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
    		for (WebElement all : alldata) {
				String text = all.getText();
				System.out.println(text);
			}
    		
    		System.out.println("***");
	}
}
