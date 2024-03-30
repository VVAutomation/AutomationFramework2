package pageObject.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {

	public WebDriver driver;

	public ConfirmationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//h2")
	WebElement thankYouMessage;

	@FindBy(css = "div.complete-text")
	WebElement getCompleteText;

	public WebElement getthankYouMessage() {
		return thankYouMessage;
	}

	public WebElement getCompleteText() {
		return getCompleteText;
	}

}
