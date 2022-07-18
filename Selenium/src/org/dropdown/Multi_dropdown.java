package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aruna\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize(); 
		
		WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));
		
		Select s = new Select(multiple);
		boolean multi = s.isMultiple();
		System.out.println(multi);
		
		s.selectByValue("1");
		s.selectByIndex(2);
		s.selectByVisibleText("Loadrunner");
		
		
		System.out.println("** get option**");
		List<WebElement> alloptions = s.getOptions();
		for (WebElement all : alloptions) {
			String text = all.getText();
			System.out.println(text);
			
		}
		
		System.out.println("***    getallselect****   ");
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement selected : allSelectedOptions) {
			String text = selected.getText();
			System.out.println(text);
		}
		
		System.out.println("*** getfirstselected***");
	     WebElement firstSelect = s.getFirstSelectedOption();
	     String text = firstSelect.getText();
	     System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
