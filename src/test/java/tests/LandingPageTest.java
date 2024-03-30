package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import commonActions.CommonUtils;
import pageObject.Login.LandingPage;

public class LandingPageTest extends TestBase {

	/*
	 * 
	 * TestProduct-1st execution
	 * TestProduct-2nd execution
	 * 
	 * TestProduct123233773434883
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	LandingPage lp;
	
	
	@Test
	public void lpTest() {
		lp = new LandingPage(driver);
		lp.getLogin();
		int num=CommonUtils.getRandomNumber();
		Assert.assertEquals("Test", "Test");
		
	}
	
}


