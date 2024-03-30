package pageObject.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "login")
	WebElement loginId;

	@FindBy(id = "login2")
	WebElement loginId2;

	
	public void getLogin() {
		
		loginId.click();
		loginId2.sendKeys("TestUser123");
	}
}
