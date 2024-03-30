package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test2 {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91982\\JavaNovBatch\\Selenium4Demo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		

	}

}
