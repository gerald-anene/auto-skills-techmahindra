package careers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.Page;
import utils.BaseTests;

public class CareerTests extends BaseTests {
	
	@Test
	public void verifyAutomationCareer() {
		homePage.clickMenuItem("Careers", "Vacancies");
		homePage.clickMenuItem("TEST AUTOMATION ENGINEER");
		homePage.WaitForElementToBeVisible(By.xpath(".//li[contains(text(),'Autonomous and independent work')]"));
		List<WebElement> count=getWebDriver().findElements(By.cssSelector("div[data-href*='test-automation-engineer'] div >div ul"));

		int AutoTestSkillsCount = count.size();
		Assert.assertEquals(5, AutoTestSkillsCount);
	}

}
