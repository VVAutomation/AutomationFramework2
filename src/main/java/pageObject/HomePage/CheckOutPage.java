package pageObject.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {

	public WebDriver driver;

	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// All the WebElement

	@FindBy(id = "first-name")
	WebElement firstName;

	@FindBy(id = "last-name")
	WebElement lastName;

	@FindBy(id = "postal-code")
	WebElement postalCode;

	@FindBy(id = "continue")
	WebElement continueButton;

	public void addCheckOutInfo(String fName, String lName, String pCode) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		postalCode.sendKeys(pCode);
	}

	public void continueCheckOut() {
		continueButton.click();
	}

}
