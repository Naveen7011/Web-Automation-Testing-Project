Feature: Login Functionality
@Test
Scenario: Verify login functionality with valid credentials
When User Enter Correct username and password
And User click on login button
Then Validate user navigate to Home Page
          