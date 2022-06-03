package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
	
	protected WebDriver webDriver;
	private static final int TIME_OUT = 30;
	
	public Page(WebDriver webDriver) {
		this.webDriver=webDriver;
	}
	
	String menuItem_Format=".//ul/li[a[contains(text(),'%s')]]/a";
	
	
	public Page clickMenuItem(String menuItem) {
		findMenuItem(menuItem).click();
       return new Page(webDriver);
	}
	
	public Page clickMenuItem(String menuItem,String subMenuItem) {
		Actions action = new Actions(webDriver);
		action.moveToElement(findMenuItem(menuItem)).click().perform();;
		
		return clickMenuItem(subMenuItem);
	}
	
	public WebElement findMenuItem(String menuItem) {
		String xpath=String.format(menuItem_Format, menuItem);
		WaitForElementToBeVisible(By.xpath(xpath));
		return webDriver.findElement(By.xpath(xpath));
	}
	
	public void WaitForElementToBeVisible(By locator) {
		WebDriverWait wait = new WebDriverWait(webDriver, java.time.Duration.ofSeconds(TIME_OUT));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public int AutomationSkillsCount() {
		WaitForElementToBeVisible(By.xpath(".//li[contains(text(),'Autonomous and independent work')]"));
		List<WebElement> count=webDriver.findElements(By.cssSelector("div[data-href*='test-automation-engineer'] div >div ul"));
		int AutoTestSkillsCount = count.size();
		
		return AutoTestSkillsCount;
	}
	
	public WebDriver getWebDriver() {
		return webDriver;
	}
	

}
