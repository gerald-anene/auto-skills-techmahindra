package menuItems;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;
import utils.BaseTests;

public class AutomationSkillsTests extends BaseTests {
	
	@Test
	public void verifyAutomationCareer() {
		Page currentPage=homePage.clickMenuItem("Careers", "Vacancies");
		currentPage.clickMenuItem("TEST AUTOMATION ENGINEER");
		currentPage.WaitForElementToBeVisible(By.xpath(".//li[contains(text(),'Autonomous and independent work')]"));
		List<WebElement> count=Page.getWebDriver().findElements(By.cssSelector("div[data-href*='test-automation-engineer'] div >div ul"));

		int AutoTestSkillsCount = count.size();
		Assert.assertEquals(5, AutoTestSkillsCount);
	}

}
