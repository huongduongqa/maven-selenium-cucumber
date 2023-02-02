package pageUIs.user;

public class CommonPageUI {
	public static final String DYNAMIC_TEXTBOX = "xpath=//label[text()='%s']/parent::div/input";
	public static final String DYNAMIC_COMBOBOX = "xpath=//label[text()='%s']/parent::div/select";
	public static final String DYNAMIC_BUTTON = "";
	public static final String DYNAMIC_LINK_IN_MY_ACCOUNT = "xpath=//div[contains(@class, 'block-account-navigation')]//a[text()='%s']";
	public static final String DYNAMIC_TEXT_MESSAGE = "";
	public static final String DYNAMIC_TEXT_IN_ADDRESS_FORM = "xpath=//div[@class='address-list']//label[text()='%s']/parent::li";
}
