package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Simple_Annotation {
	public static WebDriver driver;
    @BeforeSuite
       private void browserLaunch() {
        System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
	}
       @BeforeTest
       private void url() {
       driver.get("https://www.amazon.com/");
       driver.manage().window().maximize();
	}
	   @Ignore
       @Test
       private void amazonBasic() {
       driver.findElement(By.linkText("Amazon Basics")).click();
	}
       
       @Test(priority = -1)
       private void customerService() {
    	   driver.findElement(By.linkText("Customer Service")).click();
	}
       
       @Test (invocationCount = 3)
       private void regIstry() {
        driver.findElement(By.linkText("Registry")).click();
	}
	
        @Test(priority = -2)
        private void searchBox() {
        	 driver.findElement(By.id("twotabsearchtextbox")).click();
		}
        
        @AfterTest
        private void deleteCookies() {
        driver.manage().deleteAllCookies();
		}
	    @AfterSuite
	    private void colse() {
        driver.close();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
