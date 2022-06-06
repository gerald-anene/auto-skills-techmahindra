package utils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Page;

public class BaseTests {
	
	private static WebDriver webDriver;
	protected static Page homePage;
	
	@BeforeClass
	public static void launchApplication() {
		setChromeDriverProperty();
		webDriver=new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get(Links.Home);
		homePage=new Page(webDriver);
	}
	
	@AfterClass
	public static void closeBrowser() {
		webDriver.close();
		webDriver.quit();
		
	}
	
	public static WebDriver getWebDriver() {
		return webDriver;
	}
	
	private static void setChromeDriverProperty() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
	}

}
