package Dummy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Google {
	
	static WebDriver driver;
	
	
	@BeforeMethod
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\sandeep_deloitte\\automation\\chromedriver.exe");
		driver = new ChromeDriver();
			driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
	}
	
  @Test
  public void f() {
	  
  }
  
  @AfterMethod
  public void closebrowser()
  {
	  driver.close();
  }
}
