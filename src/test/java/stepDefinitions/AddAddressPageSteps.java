package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import commons.CommonPageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;

import pageObjects.user.AddressPageObject;
import pageObjects.user.PageGeneratorManager;

public class AddAddressPageSteps {

	WebDriver driver;
	AddressPageObject addressPage;
	CommonPageObject commonPage;

	public AddAddressPageSteps() {
		
		this.driver = Hooks.openAndQuitBrowser();
		addressPage = PageGeneratorManager.getAddressPage(driver);
		commonPage = PageGeneratorManager.getCommonPageObject(driver);
	}

	@Given("^Click AddNew button$")
	public void clickAddNewButton()  {
	    addressPage.clickToAddNewButton();
	}

	@When("^click Save$")
	public void clickSave()  {
	   addressPage.clickToSaveButton();
	}

	@When("^Input to \"([^\"]*)\" textbox with value \"([^\"]*)\"$")
	public void inputToTextboxWithValue(String fieldName, String inputValue) {
	    commonPage.inputToDynamicTextbox(fieldName, inputValue);
	}

	@When("^Select \"([^\"]*)\" combobox with value \"([^\"]*)\"$")
	public void selectComboboxWithValue(String fieldName, String selectValue) {
		commonPage.selectDynamiCombobox(fieldName, selectValue);
	}

	@Then("^Fullname is displayed as \"([^\"]*)\" \"([^\"]*)\" at page title$")
	public void fullnameIsDisplayedAsAtPageTitle(String firstName,String lastName )  {
	    Assert.assertEquals(addressPage.getAddressTitle(), firstName + " " +lastName);
	}

	@Then("^Submited Fullname is displayed as \"([^\"]*)\" \"([^\"]*)\"$")
	public void submitedFullnameIsDisplayedAs(String firstName, String lastName)  {
		Assert.assertEquals(addressPage.getAddressName(), firstName + " " +lastName);
	}

	@Then("^Submited \"([^\"]*)\" is displayed as \"([^\"]*)\"$")
	public void submitedIsDisplayedAs(String fieldName, String expectValue)  {
		Assert.assertEquals(commonPage.getTextInAddressForm(), expectValue);
	}	
}
