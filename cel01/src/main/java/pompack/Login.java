package pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
@FindBy (xpath="//input[@id='email']")            // user name
private WebElement email;
@FindBy (xpath="//input[@id='user-password']")    // password
private WebElement password;
@FindBy (xpath="//button[@type='submit']")        // login button
private WebElement loginButton;
@FindBy(xpath="//a[text()='Register here']")      //sign up link (register here)
private WebElement signupLink;

public Login(WebDriver driver) {                       // constructor
	PageFactory.initElements(driver,this);
}

// action methods

public void enterEmailid() {
	email.sendKeys("ganesh.b@celcius.in");
}
public void enterPassword() {
	password.sendKeys("Ganesh@8041");
}
public void clickOnLoginButton() {
	loginButton.click();
}
public void clickOnSignupLink() {
	signupLink.click();
}
}
