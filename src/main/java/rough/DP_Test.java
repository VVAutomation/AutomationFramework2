package rough;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP_Test {
	WebDriver driver;
	
	@BeforeMethod
	public void invokeBrowser(){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91982\\JavaNovBatch\\Selenium4Demo\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.facebook.com");
	
	}
	
	@Test(dataProvider="getData")
	public void facebookLogin(String username, String password){
	
	driver.findElement(By.id("email")).clear();
	driver.findElement(By.id("email")).sendKeys(username);
	
	driver.findElement(By.id("pass")).clear();
	driver.findElement(By.id("pass")).sendKeys(password);
	
	//driver.findElement(By.id("u_0_l")).click();
	
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[4][2];
		
		data[0][0] = "username1@gmail.com";
		data[0][1] = "password1";
		
		data[1][0] = "username2@gmail.com";
		data[1][1] = "password2";
		
		data[2][0] = "username3@gmail.com";
		data[2][1] = "password3";
		
		data[3][0] = "username4@gmail.com";
		data[3][1] = "password4";
		
		return data;
	}

}
