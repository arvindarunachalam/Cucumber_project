import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunClass_Day1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");

     driver.navigate().to("https://www.flipkart.com/");
     
      driver.navigate().back();
      driver.navigate().forward();
      driver.navigate().refresh();
//      driver.quit();
      driver.close();
      
















}
	
	
	
}
