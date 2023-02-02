package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.user.HomePageObject;
import pageObjects.user.PageGeneratorManager;

public class HomePageSteps {
	WebDriver driver;
	HomePageObject homePage;

	public HomePageSteps() {
		
		this.driver = Hooks.openAndQuitBrowser();
		homePage = PageGeneratorManager.getHomePage(driver);
	}
	
	@Given("^Open Register page$")
	public void openRegisterPage() {
	    homePage.openRegisterPage();
	}
	
	@Given("^Open Login page$")
	public void openLoginPage()  {
	   homePage.clickToLoginLink();
	}
	
	@Given("^Open MyAccount page$")
	public void openMyAccountPage() {
	    homePage.clickToMyAccountLink(driver);
	}
	
	@Then("^MyAccount link displays$")
	public void myaccountLinkDisplays(){
	   homePage.IsMyAccountLinkDisplayed();
	}
	
	@Then("^Logout link displays$")
	public void logoutLinkDisplays(){
		Assert.assertTrue(homePage.IsLogoutLinkDisplayed());
	}
}