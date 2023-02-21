@login_facebook
Feature: Register and Login
  
  @no-param
  Scenario: Register and Login into system
    Given Open facebook application
    When Input to username textbox 
    And Input to password textbox
	And Click to submit button
	And Close application
	
   @param
   Scenario: With parametters
     Given Open facebook application
     When Input to username textbox with "abc@gmail.com"
     And Input to password textbox with "123456"
	 And Click to submit button
	 And Close application
	 
	 @param-but
   Scenario: With parametters
     Given Open facebook application
     When Input to username textbox with abc@gmail.com
     And Input to password textbox with 123456
	 And Click to submit button
	 And Close application
	
  @data-table
   Scenario Outline: Create new Customer with email <Username>
     Given Open facebook application
     When Input to Username and Password
      |Username     |Password  |   Address  |
      |<Username>   |<Password>|  <Address>|
     And Click to submit button
     Then Verify submitted info display
     | Username    |  Address |
     |<Username>   | <Address>|
      
	 And Close application
	 
     Examples: 
     |Username       |Password| Address |
     |abc01@gmail.com|123456  | Horace  |
     |abc02@gmail.com|123456  | Horace  |
     |abc03@gmail.com|123456  | Horace  |
     |abc04@gmail.com|123456  | Horace  |
   