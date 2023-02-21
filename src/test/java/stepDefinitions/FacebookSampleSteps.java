package stepDefinitions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSampleSteps {
	WebDriver driver;

	@Given("^Open facebook application$")
	public void openFacebookApplication()  {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^Input to username textbox$")
	public void inputToUsernameTextbox()  {
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	}

	@When("^Input to password textbox$")
	public void inputToPasswordTextbox()  {
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("123456"); 
	}

	@When("^Click to submit button$")
	public void clickToSubmitButton() { 
	   driver.findElement(By.name("login")).click();
	}

	@When("^Input to username textbox with \"([^\"]*)\"$")
	public void inputToUsernameTextboxWith(String email)  {
		 driver.findElement(By.id("email")).clear();
		 driver.findElement(By.id("email")).sendKeys(email);
	}

	@When("^Input to password textbox with \"([^\"]*)\"$")
	public void inputToPasswordTextboxWith(String password)  {
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password); 
	}
	
	@When("^Input to username textbox with ([^\"]*)$")
	public void inputToUsernameTextbox(String email) {
		 driver.findElement(By.id("email")).clear();
		 driver.findElement(By.id("email")).sendKeys(email);
	}

	@When("^Input to password textbox with ([^\"]*)$")
	public void inputToPasswordTextbox(String password) {
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password); 
	}

	@When("^Input to Username and Password$")
	public void inputToUsernameAndPassword(DataTable table) {
	   //List<Map<String,String>> customer = table.asMaps(String.class, String.class);
	   
	   /*for (Map<String, String> loginInfo : table.asMaps(String.class, String.class)) {
		   driver.findElement(By.id("email")).clear();
		   driver.findElement(By.id("email")).sendKeys(loginInfo.get("Username"));
		   
		   driver.findElement(By.id("pass")).clear();
		   driver.findElement(By.id("pass")).sendKeys(loginInfo.get("Password")); 
	   }  */ 
	}
	
	@Then("^Verify submitted info display$")
	public void verifySubmittedInfoDisplay(DataTable table)  {
	    
	}
	    
	@When("^Close application$")
	public void closeApplication(){
	    driver.close();
	}
}
