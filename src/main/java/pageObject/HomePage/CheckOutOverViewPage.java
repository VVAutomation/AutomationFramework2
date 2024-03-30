package pageObject.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOverViewPage {

	public WebDriver driver;

	public CheckOutOverViewPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "div.summary_value_label")
	WebElement getCardInfo;

	@FindBy(xpath = "(//div[@class='summary_value_label'])[2]")
	WebElement getShippingInfo;

	@FindBy(css = "div.summary_subtotal_label")
	WebElement getTotalPrice;

	@FindBy(css = "div.summary_info_label.summary_total_label")
	WebElement getFinalPrice;

	@FindBy(id = "finish")
	WebElement getFinishButton;

	public WebElement getShippingInfo() {
		return getShippingInfo;
	}

	public WebElement getTotalPrice() {
		return getTotalPrice;
	}

	public WebElement getCardInfo() {
		return getCardInfo;
	}

	public WebElement getFinalPrice() {
		return getFinalPrice;
	}

	public WebElement getFinishButton() {
		return getFinishButton;
	}

}
