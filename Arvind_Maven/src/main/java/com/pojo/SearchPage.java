package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
   public static WebDriver driver;
   
   @FindBy(id="location")
   private WebElement loc;
   
   public SearchPage(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
}
   public WebElement getLoc() {
	return loc;
	   
   }
   
}
