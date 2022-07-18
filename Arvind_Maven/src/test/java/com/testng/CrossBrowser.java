package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CrossBrowser {
	@DataProvider
	private Object[][] loginData() {
		return new Object[][] { { "arvind1", "12345678" } };
	}

	public static WebDriver driver;

	@Test(dataProvider = "loginData")
	private void adactinChrome(String uname,String pass) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}

	@Test(dataProvider = "loginData")
	private void adactinEdge(String uname,String pass) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "E:\\eclipse-workspace\\Arvind_Maven\\Driver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

	}

}
