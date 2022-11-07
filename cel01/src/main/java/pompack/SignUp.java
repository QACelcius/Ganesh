package pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
@FindBy(xpath="//input[@id='company_name']")      // company name text box
private WebElement companyName;
@FindBy(xpath="//input[@id='email']")             // email id text box
private WebElement emailid;
@FindBy(xpath="//input[@id='contact_person_mobile_no']")
private WebElement mobileNumber;
@FindBy(xpath="//input[@id='password']")          // password text box
private WebElement password;
@FindBy(xpath="//input[@id='is_terms_condi']")    // terms check box
private WebElement termsAndConditions;
@FindBy(xpath="//button[@type='submit']")         // submit button
private WebElement registerButton;

public SignUp(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

// action methods

public void enterCompanyName() {
	companyName.sendKeys("Swaraj");
}
public void enterEmailId() {
	emailid.sendKeys("swaraj@gmail.com");
}
public void enterMobileNumber() {
	mobileNumber.sendKeys("7620398709");
}
public void enterPassword() {
	password.sendKeys("Swap@123");
}
public void acceptTerms() {
	termsAndConditions.click();
}
public void clickOnSubmit() {
	registerButton.click();
}

}
