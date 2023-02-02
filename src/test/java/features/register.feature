@register_alone
Feature: Register into System
  
  Scenario: Register into system
    # Open URL =>Hooks 
    Given Open Register page
    When Input to Lastname textbox with value "lastname"
    And Input to Firstname textbox with value "firstname"
    And Input to Email textbox with value "email"
    And Input to Password textbox with value "password"
    And Input to ConfirmPassword textbox with value "confirmPassword"
    And Click To Register button
    Then Message of Successful Register displays
   # And Close nopcommerce application
	
    
   