Feature: Register into System
  
  Scenario Outline: Register into system
    # Open URL =>Hooks 
    Given Open Register page	
    When Input to Lastname
    And Input to Firstname
    And Input to Email
    And Input to Password
    And Input to ConfirmPassword
    And Click To Register button
    Then Message of Successful Register displays
    And Close application
	
     Examples: 
     |Username       |Password| Address |
     |abc01@gmail.com|123456  | Horace  |
     |abc02@gmail.com|123456  | Horace  |
     |abc03@gmail.com|123456  | Horace  |
     |abc04@gmail.com|123456  | Horace  |
   