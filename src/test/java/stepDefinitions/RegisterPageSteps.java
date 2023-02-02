package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;

import pageObjects.user.PageGeneratorManager;
import pageObjects.user.RegisterPageObject;
import utilities.DataHelper;

public class RegisterPageSteps {
	WebDriver driver;
	RegisterPageObject registerPage;
	DataHelper helper; 
	String firstname, lastname, email, password, confirmPass;
	
	public RegisterPageSteps() {
		
		this.driver = Hooks.openAndQuitBrowser();
		registerPage = PageGeneratorManager.getRegisterPage(driver);
		helper = new DataHelper();
		firstname = helper.getFirstName();
		lastname = helper.getLastName();
		email = helper.getEmail();
		password = confirmPass = helper.getPassword();
	}
	
	@When("^Input to Lastname textbox with value \"([^\"]*)\"$")
	public void inputToLastnameTextboxWithValue(String lastName)  {
	   registerPage.inputToLastnameTextbox(lastName);
	}

	@When("^Input to Firstname textbox with value \"([^\"]*)\"$")
	public void inputToFirstnameTextboxWithValue(String firstName)  {
	   registerPage.inputToFirstnameTextbox(firstName);
	}

	@When("^Input to Email textbox with value \"([^\"]*)\"$")
	public void inputToEmailTextboxWithValue(String email) {
	   registerPage.inputToEmailTextbox(email);
	}

	@When("^Input to Password textbox with value \"([^\"]*)\"$")
	public void inputToPasswordTextboxWithValue(String password)  {
	   registerPage.inputToPasswordTextbox(password);
	}

	@When("^Input to ConfirmPassword textbox with value \"([^\"]*)\"$")
	public void inputToConfirmPasswordTextboxWithValue(String confirmPass)  {
	   registerPage.inputToConfirmPasswordTextbox(confirmPass);
	}

	@When("^Click To Register button$")
	public void clickToRegisterButton() {
	   registerPage.clickToRegisterButton();
	}

	@Then("^Message of Successful Register displays$")
	public void messageOfSuccessfulRegisterDisplays()  {
	   Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");
	}
}