@login_feature
Feature: Login into System
  

  Scenario: Login into system
    # Open URL =>Hooks 
    Given Open "Login" page	
    When Input email textbox with value "email"
    And Input to password textboox with value "password"
    And Click To Login button
    Then MyAccount link displays
	And Close nopcommerce application
	
    
   