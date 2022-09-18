Feature: Order Food



@TC_101
Scenario: A user should be able to order food successfully on Swiggy

 Given 	Go to Swiggy.com
 When  	Enter Bangalore, Karnatka, India in the search box 
 And   	Click Go
 And   	Click on the first restaurant on the next page
 And   	Click Add on the first item of the restaurant page
 And   	Click Checkout button
 Then  	Verify you are on Checkout page by verifying the text SECURE CHECKOUT