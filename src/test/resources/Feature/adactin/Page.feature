Feature: User Have to Validate the Login Functionality in Adactin Application
Background:
Given User have to launch adactin application through browser

Scenario: User have to validate the login functionality by passing the valid username and valid password
When user have to pass the Valid username and valid password and click the login button

|SwethaSasi|
|3ZM2X8|
|Hari456|
|Hari@321|

And User have to validate the login
Then User have to close the browser


Scenario: User have to validate the login functionality by passing the Invalid username and valid password
When user have to pass the Invalid username and valid password and click the login button

|Swetha321|Swetha@123|
|Rani456|Rani@654|
|Sasi789|Sasi@987|

And User have to verify login page
Then User have to close the browser


Scenario: User have to validate the login functionality by passing the valid username and Invalid password
When user have to pass the valid username and Invalid password and click the login button

|username|SwethaSasi|
|password|Swetha@123|

And User have to validate the login page
Then User have to close the browser

Scenario: User have to validate the login functionality by passing the Invalid username and Invalid password
When user have to pass the Invalid username and Invalid password and click the login button

|username|password|
|Rani456|Rani@654|
|Sasi789|Sasi@987|

And User have to verify the dashboard
Then User have to close the browser     
     

