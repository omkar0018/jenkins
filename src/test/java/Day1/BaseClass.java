package Day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class BaseClass {
	public WebDriver driver;
 /* @BeforeTest
  @Parameters("browser")
  public void beforeTest(String browser) {
	  if(browser.equalsIgnoreCase("chrome")) {
	  System.setProperty("webdriver.chrome.driver","D:\\Shantanu_Practice\\abs\\src\\test\\resources\\Webdriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  }else if(browser.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver","D:\\Shantanu_Practice\\abs\\src\\test\\resources\\Webdriver\\geckodriver.exe");
		  driver = new FirefoxDriver();
	  }
	  else {
		  System.out.println("Invalid Browser");
	  }*/
  
  @BeforeTest
  public void beforeTest() {
	 System.setProperty("webdriver.chrome.driver","D:\\Shantanu_Practice\\abs\\src\\test\\resources\\Webdriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  System.setProperty("webdriver.gecko.driver","D:\\Shantanu_Practice\\abs\\src\\test\\resources\\Webdriver\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  
  }
 
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
}


