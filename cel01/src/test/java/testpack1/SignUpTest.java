package testpack1;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepack.BaseClass;
import pompack.CustomerHome;
import pompack.Login;
import pompack.SignUp;

public class SignUpTest extends BaseClass{
	
SignUp sign;
Login log;
CustomerHome ch;

@BeforeClass
public void beforeClass() {
	  launchBrowser();
	 log=new Login(driver);
	 sign=new SignUp(driver);
	 ch= new CustomerHome(driver);
}

@BeforeMethod
public void beforeMethod() throws InterruptedException {
	log.clickOnSignupLink();
	Thread.sleep(3000);
	sign.enterCompanyName();
	sign.enterEmailId();
	sign.enterMobileNumber();
	sign.enterPassword();
	sign.acceptTerms();
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
   Thread.sleep(2000);
    sign.clickOnSubmit();
}

@Test
public void SignUpTest01 () {
	System.out.println("Welcome to Celcius");
}


@AfterClass
public void afterClass() {
	//driver.close();
}
}
