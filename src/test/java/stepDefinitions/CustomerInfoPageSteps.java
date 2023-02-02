package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumberOptions.Hooks;
import pageObjects.user.CustomerInfoPageObject;
import pageObjects.user.PageGeneratorManager;

public class CustomerInfoPageSteps {
	WebDriver driver;
	CustomerInfoPageObject customerInfoPage;
	
	public CustomerInfoPageSteps () {
		this.driver = Hooks.openAndQuitBrowser();
		customerInfoPage = PageGeneratorManager.getCustomerInfoPage(driver);
	}

}
