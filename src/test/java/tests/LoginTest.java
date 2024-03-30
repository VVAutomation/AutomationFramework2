package tests;

import org.testng.annotations.Test;

import base.TestBase;
import pageObject.Login.LoginPage;

public class LoginTest extends TestBase {

	
	
	@Test
	public void loginUserTest() {
		
		LoginPage login =  new LoginPage(driver);
		login.doLogin("standard_user", "secret_sauce");
		
	}
	
	
	

}
