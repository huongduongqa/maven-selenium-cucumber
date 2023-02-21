package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumberOptions.Hooks;
import io.cucumber.java.en.When;
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
