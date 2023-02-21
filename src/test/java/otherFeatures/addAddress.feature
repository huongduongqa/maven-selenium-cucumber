@add_address_feature
Feature: Register_Login 

@register 
Scenario Outline: 
	Given Open Register page	
    When Input to Lastname textbox with value "<FirstName>"
    And Input to Firstname textbox with value "<LastName>"
    And Input to Email textbox with value "<Email>"
    And Input to Password textbox with value "<Password>"
    And Input to ConfirmPassword textbox with value "<ConfirmPassword>"
    And Click To Register button
    Then Message of Successful Register displays
    #And Close nopcommerce application 
    
    Examples: 
    | FirstName | LastName | Email         | Password      | ConfirmPassword |
    | Helen     | Hein     | abc@gmail.com | abc123        | abc123          | 
	
@login 
Scenario Outline:
	Given Open Login page	
    When Input email textbox with value "<Email>"
    And Input to password textboox with value "<Password>"
    And Click To Login button
    Then MyAccount link displays
    And Logout link displays
   
   Examples: 
   |Email         | Password      | 
   |abc@gmail.com | abc123        | 
	
@add_address
Scenario Outline: 
	Given Open MyAccount page 
	And Open "Addresses" page in MyAccount
	And Click AddNew button 
	When Input to "First name:" textbox with value "<FirstName>"
	And Input to "Last name:" textbox with value "<LastName>"
	And Input to "Email:" textbox with value "<Email>" 
	And Select "Country:" combobox with value "<Country>" 
	And Select "State / province:" combobox with value "<State>" 
	And Input to "City:" textbox with value "<City>" 
	And Input to "Address 1:" textbox with value "<Address1>" 
	And Input to "Zip / postal code:" textbox with value "<ZipCode>" 
	And Input to "Phone number:" textbox with value "<PhoneNumber>"
	And click Save 
	Then Fullname is displayed as "<FirstName>" "<LastName>" at page title
	And Submited Fullname is displayed as "<FirstName>" "<LastName>" 
	And Submited "Email:" is displayed as "<Email>" 
	And Submited "Phone number:" is displayed as "<PhoneNumber>" 
	And Close nopcommerce application
	
	Examples: 
		| FirstName | LastName | Email       | Country       | State         | City   | Address1 | ZipCode | PhoneNumber | 
		| Helen     | Hein     | abc@gmail.com | United States | Alabama       | Horace | 6st E    | 588047  | 2129892321  |
		| Huong     | Duong    | abc@gmail.com | United States | Alabama       | Horace | East N   | 821171  | 2212121213  | 
		
		
		
