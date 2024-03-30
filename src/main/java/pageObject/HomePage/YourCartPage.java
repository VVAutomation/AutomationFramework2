package pageObject.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage {

	public WebDriver driver;

	public YourCartPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div.inventory_item_name")
	WebElement itemName;

	@FindBy(css = "item_pricebar")
	WebElement price;

	@FindBy(id = "checkout")
	WebElement checkOut;
	
	@FindBy(css="a.shopping_cart_link")
	WebElement shoppingCartLink;
	
	
	

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;

	}
	

	public WebElement getItemName() {
		return itemName;

	}

	
	public WebElement getPrice() {
		return price;

	}

	public WebElement getCheckOut() {

		return checkOut;
	}

}
