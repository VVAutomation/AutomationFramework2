package rough;

import base.TestBase;
import pageObject.Login.LoginPage;

public class TestLogin extends TestBase{

	public static void main(String[] args) {
		
		
		LoginPage login= new LoginPage(driver);
		
		//100*3=300 = repeated piece of code
		//100*1= 100 => saving 200 extra line of code
		//login.
		//login.doLogin("Username1", "Password1");
		login.getUserName().sendKeys("Username1");
		login.getPassword().sendKeys("Password1");
		login.getLoginButton().click();
		

	}

}
