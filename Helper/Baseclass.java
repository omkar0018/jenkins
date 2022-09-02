package Helper;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Baseclass {
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("Webdriver.driver.chrome","")
  }

  @AfterTest
  public void afterTest() {
  }

}
