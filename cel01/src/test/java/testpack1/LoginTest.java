package testpack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pompack.CustomerHome;
import pompack.Login;
import basepack.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LoginTest extends BaseClass {
 
	Login log;
	CustomerHome ch;
  @BeforeClass
  public void beforeClass() {
	  launchBrowser();
	  log=new Login(driver);
	  ch=new CustomerHome(driver);
  }
  @BeforeMethod
public void beforeMethod() throws InterruptedException {
	  driver.navigate().refresh();
	  Thread.sleep(2000);
	 log.enterEmailid();
	 log.enterPassword();
	 log.clickOnLoginButton();
	 Thread.sleep(10000);
  }
  @Test
  public void Test1() {
	  System.out.println("Hello Celcius");
  }
  @org.testng.annotations.AfterMethod
  public void AfterMethod() throws InterruptedException {
	  Thread.sleep(5000);
	  ch.clickOnCustomerName();
	  ch.clickOnLogoutButton();
	 
  }
  @AfterClass
  public void afterClass() {
	  driver.close();
	  driver.quit();
  }

 
}
