package pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerHome {
@FindBy(xpath="//span[@class='user-name text-bold-600']")
private WebElement customerName;
@FindBy(xpath="//*[@id=\"menuCustomer\"]/ul/li[7]/div/a[3]")
private WebElement logoutButton;

public CustomerHome(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void clickOnCustomerName() {
	customerName.click();
}

public void clickOnLogoutButton() {
	logoutButton.click();
}
}
