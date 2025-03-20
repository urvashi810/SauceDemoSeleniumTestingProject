#Author: santhoshkumar08dec89@gmail
#Feature: 2 scenarios.

Feature: Placing the items in cart with diferent user

  @tag1
  Scenario Outline: Login as standard user and place the products in the cart
    Given Login as Standard user with "<user_name>" and "<password>" 
    And Place the three items in the cart
    When click on the cart icon
    And verify the items and click on checkout button
    And provide the details and click on Finish to complete
    Then continue to home screen
    And Add the product to the cart and remove the product from the cart
    And Logout from the application as the standard user 
     Examples: 
      | user_name  				 |  password 		| 
      | standard_user_name | password 		| 

 	@tag2
   Scenario Outline: Login as performance user and place the products in the cart
    Given Login as performance user with "<user_name>" and "<password>" 
    And Place the three items in the cart
    When click on the cart icon
    And verify the items and click on checkout button
    And provide the details and click on Finish to complete
    Then continue to home screen
    And Add the product to the cart and remove the product from the cart
    And Logout from the application as the standard user
    Examples: 
      | user_name  				 |  password 		| 
      | performance_user_name | password 		| 
    
