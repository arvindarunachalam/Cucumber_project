Feature: Adactin Hotel Booking

Background: 
Scenario Outline: Login Functional
Given User gives Credentials
When User gives Username in "<Username>" field
And User gives Password in "<Password>" field
Then user click Login Button 

Examples:
				  |Username|Password|
					|admin|admin123|
					|arvind19|12345678|



Scenario: Search Hotel
When User search location
And User Search Hotel
And USer Find Room
And User Select Room Number
And Customer Proceed Check in Date
And Customer Proceed Check out Date
And User gives countof Adults
And User gives countof children
Then user click Submit

Scenario: User Confirm Hotel
When Select the Hotel
Then Click the continue for Credentials

Scenario: Give User Identities
When user gives His/Her FirstName
And user gives His/Her LastName
And User gives address
And User gives own Credit Card Number
And User gives Credit Card Type
And user gives Expiry month of credit card
And user gives Expiry Year of credit card
And user enters the CVV number from credit card
Then Book the hotel

Scenario: Logout after Booking
Then Click Logout button after Hotel Booking






