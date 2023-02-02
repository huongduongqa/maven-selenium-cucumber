package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.user.LoginPageObject;
import pageObjects.user.PageGeneratorManager;

public class LoginPageSteps {

	WebDriver driver;
	LoginPageObject loginPage;
	public LoginPageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
		loginPage = PageGeneratorManager.getLoginPage(driver);
	}
	
	@When("^Input email textbox with value \"([^\"]*)\"$")
	public void inputEmailTextboxWithValue(String email) {
	   loginPage.inputToEmailTextbox(email);
	}

	@When("^Input to password textboox with value \"([^\"]*)\"$")
	public void inputToPasswordTextbooxWithValue(String password) {
	    loginPage.inputToPasswordTextbox(password);
	}

	@When("^Click To Login button$")
	public void clickToLoginButton()  {
	   loginPage.clickToLoginButton();
	}
}
