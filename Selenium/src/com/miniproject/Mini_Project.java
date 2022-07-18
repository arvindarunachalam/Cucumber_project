package com.miniproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
    public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
			//login
	    	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("arvind19");
	    	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345678");
	    	driver.findElement(By.xpath("//input[@type='Submit']")).click();
	    	
    	
    	Actions ac = new Actions(driver);
    	Robot r = new Robot();
    
    	//bookinginformation
    	
    	WebElement loc = driver.findElement(By.xpath("//select[@name='location']"));
    	ac.click(loc).build().perform();
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_ENTER);
    	
    	WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
    	ac.click(hotel).build().perform();
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_ENTER);
    	
    	WebElement rt = driver.findElement(By.xpath("//select[@name='room_type']"));
    	ac.click(rt).build().perform();
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_ENTER);
    	
    	WebElement option = driver.findElement(By.xpath("//select[@name='room_nos']"));
    	Select s =new Select(option);
    	s.selectByValue("3");
    	
    	WebElement in = driver.findElement(By.xpath("//input[@name='datepick_in']"));
    	in.clear();
    	in.sendKeys("22/06/2022");
    	
    	WebElement out = driver.findElement(By.xpath("//input[@name='datepick_out']"));
    	out.clear();
    	out.sendKeys("24/06/2022");
    	
    	WebElement adults = driver.findElement(By.xpath("//select[@name='adult_room']"));
    	Select s1=new Select(adults);
    	s1.selectByValue("2");
    	
    	WebElement children = driver.findElement(By.xpath("//select[@name='child_room']"));
    	ac.click(children).build().perform();
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_ENTER);
    	
    	driver.findElement(By.xpath("//input[@value='Search']")).click();
    	
    	driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
    	
    	//hotelconformation
    	driver.findElement(By.xpath("//input[@name='continue']")).click();
    	
    	
    	//personalinfo
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Arvind");
    	driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("vijay");
    	WebElement add = driver.findElement(By.xpath("//textarea[@name='address']"));
    	add.sendKeys("2/11,nadarajan street,ramapuram,chennai-89");
    	driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("2345768788901122");
    	WebElement cardtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
    	ac.click(cardtype).build().perform();
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_ENTER);
    	
    	WebElement expmonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
    	Select s2=new Select(expmonth);
    	s2.selectByVisibleText("December");
    	
    	WebElement expyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
    	Select s3=new Select(expyear);
    	s3.selectByValue("2022");
    	
    	driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("245");
    	driver.findElement(By.xpath("//input[@name='book_now']")).click();
    	
    	TakesScreenshot ts=(TakesScreenshot)driver;
    	File scr = ts.getScreenshotAs(OutputType.FILE);
    	File dest=new File("C:\\Users\\aruna\\eclipse-workspace\\Selenium\\Screenshot\\room.png");
    	FileUtils.copyFile(scr, dest);
    	Thread.sleep(9000);
    	
    	driver.findElement(By.xpath("//input[@name='logout']")).click();
    	Thread.sleep(2000);
    	driver.quit();
    	
    
    	
    	
    	
    	
    	
    	
    
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}
	
}
