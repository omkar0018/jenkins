package Day1;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;

public class second extends BaseClass {
  @Test(dataProvider = "dp")
  public void f(String un, String pwd) {
	  driver.get("http://timesheet.aqmtechnologies.com/");
	  driver.findElement(By.name("txtUserName")).sendKeys(un);
	  driver.findElement(By.name("txtPassword")).sendKeys(pwd);
	  driver.findElement(By.name("btnLogin")).click();
	  if(driver.getCurrentUrl().contains("dashboard")) 
	  
		  System.out.println("Login done");
  
	  else 
		  System.out.println("Login Failed");
  
	  TakesScreenshot tc = (TakesScreenshot)driver;
	  File src = tc.getScreenshotAs(OutputType.FILE);
	  try {
		FileHandler.copy(src,new File("D:/Shantanu_Practice/abs/src/test/resources/Screenshot/TIMESHEET.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }

  
  @DataProvider
  public Object[][] dp() {
      Object[][] Data = new Object[3][2];
      Data[0][0]="Omkar"; //username
      Data[0][1]="Omkar123" ; //password
      Data[1][0]="Ram";
      Data[1][1]="Ram123";
      Data[2][0]="Demon";
      Data[2][1] ="Demon123";
    return Data;
  }
}
