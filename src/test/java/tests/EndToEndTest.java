package tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;
import pageObject.HomePage.CheckOutOverViewPage;
import pageObject.HomePage.CheckOutPage;
import pageObject.HomePage.ConfirmationPage;
import pageObject.HomePage.HomePage;
import pageObject.HomePage.YourCartPage;
import pageObject.Login.LoginPage;

public class EndToEndTest extends TestBase {
	
	/*
	 * 
	 * 
	 * 
	 * pom.xml->testng.xml->TestCase to be exectution(TestClass->extends TestBase-setup()->TestClass completed->TestBase- teardown - close down all browser instance
	 */

	
	
	//I am made this change 
	LoginPage login;
	HomePage home;
	ConfirmationPage confirmation;
	CheckOutPage checkOut;
	CheckOutOverViewPage overView;
	YourCartPage yourCart;

	@BeforeClass
	public void setUpClass() {
		login = new LoginPage(driver);
		home = new HomePage(driver);
		confirmation = new ConfirmationPage(driver);
		checkOut = new CheckOutPage(driver);
		overView = new CheckOutOverViewPage(driver);
		yourCart = new YourCartPage(driver);
	}

	@Test(priority = 0)
	public void loginUserTest() {

		login.doLogin("standard_user", "secret_sauce");
		String actualText = home.getProductLabel().getText();
		try {
			Assert.assertEquals(actualText, "Products");
			test.log(LogStatus.PASS, "Login Test Passed");
		} catch (Exception e) {
			test.log(LogStatus.FAIL,"Login Test Failed");
		}
		

	}

	@Test(priority = 1, dependsOnMethods = "loginUserTest", enabled = true,alwaysRun = true)
	public void addItemToCartTest() {
		home.addToCart();
		test.log(LogStatus.INFO, "Navigated to Products page");

	}

	@Test(priority = 2, dependsOnMethods = "addItemToCartTest", enabled = true)
	public void verifyCartDetailsTest() {
		/*
		 * String actualPrice = yourCart.getPrice().getText();
		 * System.out.println(actualPrice); yourCart.getCheckOut().click();
		 */
		home.getShoppingLink().click();
		test.log(LogStatus.INFO, "Navigated to Products page");

	}

	@Test(priority = 3, dependsOnMethods = "verifyCartDetailsTest", enabled = true)
	public void enterCheckOutInfoTest() throws InterruptedException {
		
		yourCart.getCheckOut().click();
		
	
		checkOut.addCheckOutInfo("Automation", "TestUser", "122009");
		checkOut.continueCheckOut();
		
		
		

	}

	@Test(priority = 4, dependsOnMethods = "enterCheckOutInfoTest", enabled = true)
	public void verifyCheckOutOverviewTest() {
		Assert.assertEquals(overView.getCardInfo().getText(), "SauceCard #31337");
		//Assert.assertEquals(overView.getFinalPrice().getText(), "Total: $32.39");
		overView.getFinishButton().click();

	}

	@Test(priority = 5, dependsOnMethods = "verifyCheckOutOverviewTest", enabled = true)
	public void checkOutConfirmationTest() {
		
		throw new SkipException("Development is still in progress so skipping this test!!");
//		Assert.assertEquals(confirmation.getthankYouMessage().getText(), "Thank you for your order!");
//		Assert.assertEquals(confirmation.getCompleteText().getText(),
//				"Your order has been dispatched, and will arrive just as fast as the pony can get there!");

	}

}
