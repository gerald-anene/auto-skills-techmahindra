package cucumber.stepdefs;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.Page;
import utils.BaseTests;

public class BaseStepDefs {
	protected Page currentPage;
	
	public BaseStepDefs() {
		currentPage=new Page(BaseTests.getWebDriver());
	}
	
	@Given("^I am on CTCO home page")
	public void verifyHomePage() {
		String pageTitle=BaseTests.getWebDriver().getTitle();
		Assert.assertTrue(pageTitle.equals("C.T.Co People"));
	}
	
	@And("^I hover on \"([^\"]*)\" and click on \"([^\"]*)\"$")
	public void setProduct(String menuItem, String subMenuItem) {
		currentPage.clickMenuItem(menuItem, subMenuItem);
	}

}
