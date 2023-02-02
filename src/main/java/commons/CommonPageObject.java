package commons;

import org.openqa.selenium.WebDriver;

import pageUIs.user.CommonPageUI;

public class CommonPageObject extends BasePage {
	
	WebDriver driver;
	
	public CommonPageObject(WebDriver driver)
	{
		this.driver = driver;
	}

	public void inputToDynamicTextbox(String fieldName, String inputValue) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXTBOX, fieldName);
		sendkeyToElement(driver, CommonPageUI.DYNAMIC_TEXTBOX, inputValue, fieldName);
	} 
	
	public void selectDynamiCombobox(String fieldName, String selectValue)
	{
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_COMBOBOX,fieldName);
		selectItemInDefaultDropdown(driver, CommonPageUI.DYNAMIC_COMBOBOX, selectValue, fieldName);
	}
	
	public void clickToDynamicButton(String buttonName)
	{
		waitForElementClickable(driver, CommonPageUI.DYNAMIC_BUTTON, buttonName);
		clickToElement(driver, CommonPageUI.DYNAMIC_BUTTON, buttonName);
	}
	
	public void clickToDynamicLink (String linkName)
	{
		waitForElementClickable(driver, CommonPageUI.DYNAMIC_LINK_IN_MY_ACCOUNT,linkName);
		clickToElement(driver, CommonPageUI.DYNAMIC_LINK_IN_MY_ACCOUNT, linkName);
	}
	
	public String getTextInAddressForm()
	{
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXT_IN_ADDRESS_FORM);
		return getElementText(driver, CommonPageUI.DYNAMIC_TEXT_IN_ADDRESS_FORM);
	}
}
