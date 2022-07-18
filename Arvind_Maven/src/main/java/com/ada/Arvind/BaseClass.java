package com.ada.Arvind;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;
	public static WebDriver getbrowser(String browser) { //Getbrowseer 
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		    driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "E:\\eclipse-workspace\\Arvind_Maven\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	public static void getUrl(String Url) {
     driver.get(Url);
	}
	public static void click(WebElement element) {
		  
    element.click();
	}
	public static void Inputs(WebElement element,String value) {
    element.sendKeys(value);
	}
	private void close() {
    driver.close();
	}
	
//	element, string,string
	public static void dropDown(WebElement element,String type,String value) {
    Select s= new Select(element);
    
    if (type.equalsIgnoreCase("byvalue")) {
		s.selectByValue(value);
	}
    else if (type.equalsIgnoreCase("visibletext")) {
		s.selectByVisibleText(value);
	}
    else if (type.equalsIgnoreCase("byindex")) {
    	int index = Integer.parseInt(value);
		s.selectByIndex(index);
	}
    
    
    
    
    
    
    
    
    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
