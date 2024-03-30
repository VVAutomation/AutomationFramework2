package pageObject.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	public WebDriver driver;

	public LoginPage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//driver.findELement
	@FindBy(id = "login")
	WebElement loginBtn;
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement Password;
	
	public void doLogin(String username, String password) {
		userName.sendKeys(username);
		Password.sendKeys(password);
		loginBtn.click();
		
	}
	
	//Add to Cart 
	
	public void addToCart() {
		
		/*
		 * 
		 * 
		 * 
		 * 
		 */
	}
	
	

}
