package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumberOptions.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
	
	@When("^Input into Lastname textbox with value \"([^\"]*)\"$")
	public void inputToLastnameTextboxWithValue(String lastName)  {
	   registerPage.inputToLastnameTextbox(lastName);
	}

	@When("^Input into FirstName textbox with value \"([^\"]*)\"$")
	public void inputToFirstnameTextboxWithValue(String firstName)  {
	   registerPage.inputToFirstnameTextbox(firstName);
	}

	@When("^Input into Email textbox with value \"([^\"]*)\"$")
	public void inputToEmailTextboxWithValue(String email) {
	   registerPage.inputToEmailTextbox(email);
	}

	@When("^Input into Password textbox with value \"([^\"]*)\"$")
	public void inputToPasswordTextboxWithValue(String password)  {
	   registerPage.inputToPasswordTextbox(password);
	}

	@When("^Input into Confirm Password textbox with value \"([^\"]*)\"$")
	public void inputToConfirmPasswordTextboxWithValue(String confirmPass)  {
	   registerPage.inputToConfirmPasswordTextbox(confirmPass);
	}

	@When("^Click Register button$")
	public void clickToRegisterButton() {
	   registerPage.clickToRegisterButton();
	}

	@Then("^Verify Register Sucessful Message displays$")
	public void messageOfSuccessfulRegisterDisplays()  {
	   Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");
	}
}