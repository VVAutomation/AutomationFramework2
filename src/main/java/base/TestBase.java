package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import utils.ExtentManager;
import utils.ProjectConstant;
import utils.ReadPropertyFile;

public class TestBase {
	
	
	/*Page Object class - WebELements
	 *Test Class -> Assertion and validations
	 *TestBase(Super most class) -> All the common setup will be done - precondition
	 *Child Test class  is going to extends TestBase class
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static WebDriver driver;
	public String browserName = ReadPropertyFile.getProperties("browser");
	public static ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;

	// setup
	// teardown

	/*
	 * @BeforeSuite-> before all the test methods in 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	@BeforeSuite
	public void setUp() {

		// launching chrome Browser
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\91982\\JavaNovBatch\\Selenium4Demo\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		else if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(ProjectConstant.url);

	}

	@AfterSuite
	public void tearDown() {
		if (driver != null) {
			// driver.close();
			driver.quit();
			
			//Close DB connection
		}

	}

}
