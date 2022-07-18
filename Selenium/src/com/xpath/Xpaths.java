package com.xpath;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone" + Keys.ENTER);
		driver.findElement(By.xpath(
				"//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Samsung Galaxy M33 5G')]"))
				.click();

		Set<String> handles = driver.getWindowHandles();
		for (String st : handles) {
			driver.switchTo().window(st);

		}

		WebElement title = driver
				.findElement(By.xpath("//span[@id='productTitle'][contains(text(),'Samsung Galaxy M33 5G')]"));
		String text = title.getText();
		System.out.println(text);
	}

}
