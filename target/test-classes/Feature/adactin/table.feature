@login1
Feature: User Have to Validate the Login Functionality in Adactin Application
Background:
Given max and handle synchronization

@regression
Scenario: Valid username and valid password and click the login button
When Enter the valid login credentials and click the login button

|SwethaSasi|
|3ZM2X8|
|Hari456|
|Hari@321|

Then User have to close the tab

@smoke
Scenario: Invalid username and valid password and click the login button
When Enter the Invalid username and valid password and click the login button

|Swetha321|Swetha@123|
|Rani456|Rani@654|
|Sasi789|Sasi@987|

Then User have to close the tab

@sanity
Scenario: valid username and Invalid password and click the login button
When Enter the valid username and Invalid password and click the login button

|username|SwethaSasi|
|password|Swetha@123|
Then User have to close the tab

@smoke
Scenario: Invalid username and Invalid password and click the login button
When Enter the Invalid username and Invalid password and click the login button

|username|password|
|Rani456|Rani@654|
|Sasi789|Sasi@987|

Then User have to close the tab
     

