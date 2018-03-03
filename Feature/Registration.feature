Feature: user Registration

In order to become a site member
As a Visitor
I want to go registration page,enter firgt name,last name,phone,email address,user name and password to register for the 

Scenario: Positive - User registration

Given user visit homepage
When user click on register link
And user enter username,password,confirm password
And user click on Submit button
Then user recieves confirmation of successful registration
And user closes the browser
