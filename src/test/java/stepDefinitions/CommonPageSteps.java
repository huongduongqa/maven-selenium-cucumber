package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.CommonPageObject;
import cucumberOptions.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.user.PageGeneratorManager;

public class CommonPageSteps  {

	WebDriver driver;
	CommonPageObject commonPage;
	
	public CommonPageSteps () {
		this.driver = Hooks.openAndQuitBrowser();
		commonPage = PageGeneratorManager.getCommonPageObject(driver);
	}
	
	@Then("^Close nopcommerce application$")
	public void closeNopcommerceApplication()  {
	   Hooks.close();
	}

	// open MyAccount link
	@Given("^Open \"([^\"]*)\" page in MyAccount$")
	public void openPage(String pageName) {
	    commonPage.clickToDynamicLink(pageName);
	}
	
}
