Feature: Login Functionality
@Regex
Scenario: Verify login functionality with valid credentials
When User Enter Correct "SauceDemo" and "Secret"
And User click on login button
Then Validate user navigate to Home Page
         
@Regex1
Scenario Outline: Verify login functionality with valid credentials
When User Enter Correct "<username>" and "<password>"
And User click on login button
Then Validate user navigate to Home Page
Examples:
|username|password|
|user    |pass|
|user1    |pass1|
|user2   |pass2|
|user3    |pass3|         