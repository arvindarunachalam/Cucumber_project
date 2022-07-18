package com.ada.Arvind;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	public static void close() {
    driver.close();
	}
	
	public static void quit() {
     driver.quit();
	}
	
	public static void navigateTo(String Url) {
     driver.navigate().to(Url);
	}
	
	public static void navigate(String nav) {
		if (nav.equalsIgnoreCase("back")) {
		     driver.navigate().back();
		}
		else if (nav.equalsIgnoreCase("forward")) {
		     driver.navigate().forward();
		}
		else if (nav.equalsIgnoreCase("refresh")) {
		     driver.navigate().refresh();
		}
     	}
	  public static void Enabled(WebElement element) {
      element.isEnabled();
	}
	  public static void selected(WebElement element) {
      element.isSelected();
	}
	  public static void displayed(WebElement element) {
      element.isDisplayed();	
      }

	  public static void screenShot() throws IOException {
		  TakesScreenshot dde =(TakesScreenshot) driver;
			
			File scr = dde.getScreenshotAs(OutputType.FILE);
			
			File dest = new File("E:\\eclipse-workspace\\Selenium\\Screenshot\\pic.png");
			
			FileUtils.copyFile(scr,dest);
	}
	
	public static void clear(WebElement element) {
    element.clear();
	}
     public static void waits() {
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
     public static void sleep() throws InterruptedException {
     Thread.sleep(4000);
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
