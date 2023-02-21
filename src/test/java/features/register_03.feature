@register
Feature: Register new account into NopEcommerce System

  @fea3
  Scenario Outline: Register Successfully with valid infomation
    Given Click Register link
    When Input into FirstName textbox with value "<FirstName>"
    And Input into Lastname textbox with value "<Lastname>"
    And Input into Email textbox with value "<Email>"
    And Input into Password textbox with value "<Password>"
    And Input into Confirm Password textbox with value "<Confirm Password>"
    And Click Register button
    Then Verify Register Sucessful Message displays

   Examples: 
   | FirstName | Lastname | Email           | Password | Confirm Password | 
   | Paul      | Liven    | c@gmail.com     | abc123   | abc123           | 
      
