package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumberOptions.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.user.HomePageObject;
import pageObjects.user.PageGeneratorManager;

public class HomePageSteps {
	WebDriver driver;
	HomePageObject homePage;

	public HomePageSteps() {
		
		this.driver = Hooks.openAndQuitBrowser();
		homePage = PageGeneratorManager.getHomePage(driver);
	}
	
	@Given("^Click Register link$")
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