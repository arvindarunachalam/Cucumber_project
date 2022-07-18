package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pojo.LoginPage;
import com.pojo.SearchPage;

public class PageObjectManager_POM {
   public static WebDriver driver;
   
   private LoginPage lp;
   private SearchPage spage;
   
     public PageObjectManager_POM(WebDriver driver2) {
	   this.driver=driver2;
	   PageFactory.initElements(driver2, this);
}
    public LoginPage getInstanceLp() {
	lp=new LoginPage(driver);
	return lp;
}
    public SearchPage getInstanceSpage() {
	spage=new SearchPage(driver);
	return spage;
}
   
   
   
   
}
