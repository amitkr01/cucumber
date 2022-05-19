Feature: TestCase

Background: 
Given User Launch Chrome browser
When User open URL "https://www.urbanladder.com/"

Scenario: Successful check login credentials
And go to the login button
And click on login button 
And user enter email as "amit124@gmail" and password as "amit133"
And Click on Login
And close the browser


Scenario: check cart
And Click on the cart button
Then print the cart page message
And close the browser

Scenario: check wishlist
And Click on wishlist button
Then print the wishlist page message 
And close the browser


Scenario: Successful vrify the about page 
And verify the page 
Then Page contain About us heading 
And close the browser

Scenario: search chair
And Enter element as "chair " 
And click on search button
Then close the browser

