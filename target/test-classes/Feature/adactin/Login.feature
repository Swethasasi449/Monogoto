Feature: User Have to Validate the Login Functionality in Adactin Application
Background:
Given User have to launch the Adactin application through the chrome

Scenario: User Have to validate the login functionality with valid user and valid password 
When User have to pass the valid username and valid password and click the login button
Then user have to close the browser

Scenario: User Have to validate the login functionality with valid user and valid password 
When User have to pass the valid username and Invalid password and click the login button
Then user have to close the browser

Scenario: User Have to validate the login functionality with valid user and valid password 
When User have to pass the Invalid username and valid password and click the login button
Then user have to close the browser

Scenario: User Have to validate the login functionality with valid user and valid password 
When User have to pass the Invalid username and Invalid password and click the login button
Then user have to close the browser

