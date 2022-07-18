package com.ada.Arvind;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pojo.LoginPage;
import com.pojo.SearchPage;
import com.pom.PageObjectManager_POM;
import com.properties.File_Reader;

public class Adactin_TestRunner extends BaseClass {
   
	public static void main(String[] args) throws IOException {
	 
//		getbrowser("chrome"); 
//		getUrl("https://adactinhotelapp.com/");
//		
//	    	WebElement username = driver.findElement(By.id("username"));
//	    	Inputs(username, "arvind19");
//        	WebElement password=driver.findElement(By.id("password"));
//	    	Inputs(password, "12345678");
//	    	WebElement login=driver.findElement(By.id("login"));
//	    	click(login);
//	    	WebElement dropdownLoc = driver.findElement(By.id("location"));
//		    dropDown(dropdownLoc, "byindex", "2");
//		
//		 
//		driver=getbrowser("chrome");
//		getUrl("https://adactinhotelapp.com/");
//		LoginPage lp=new LoginPage(driver);
//		Inputs(lp.getUsername(),"arvind19" );
//		Inputs(lp.getPassword(), "12345678");
//		click(lp.getLogin());
//		SearchPage sp=new SearchPage(driver);
//		WebElement dropdownLoc = driver.findElement(By.id("location"));
//	    dropDown(dropdownLoc, "byindex", "2");
		
	    driver=getbrowser(File_Reader.getInstance_Fr().getInstance_cr().get_browser());
		getUrl(File_Reader.getInstance_Fr().getInstance_cr().get_url());
		
		PageObjectManager_POM pom=new PageObjectManager_POM(driver);
		
		Inputs(pom.getInstanceLp().getUsername(), File_Reader.getInstance_Fr().getInstance_cr().get_uname());
		Inputs(pom.getInstanceLp().getPassword(), File_Reader.getInstance_Fr().getInstance_cr().get_pass());
		click(pom.getInstanceLp().getLogin());
		dropDown(pom.getInstanceSpage().getLoc(), "byindex", File_Reader.getInstance_Fr().getInstance_cr().get_dropdown());
		
		
		
		
		  
		
		
		
		
		
	}
}
