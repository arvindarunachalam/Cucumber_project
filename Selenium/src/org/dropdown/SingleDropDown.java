package org.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDown {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\aruna\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		WebElement account = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		account.click();

		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(day);
		s.selectByValue("8");

		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s.selectByIndex(6);

		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select s2 = new Select(year);
		s.selectByVisibleText("1999");

	}

}
