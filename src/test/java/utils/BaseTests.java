package utils;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		webDriver.quit();
	}
	
	public static WebDriver getWebDriver() {
		return webDriver;
	}
	
	private static void setChromeDriverProperty() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
	}

}
