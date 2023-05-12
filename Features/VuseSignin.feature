Feature: Signin Functionality

@Test1
Scenario: Verify Signin functionality with invalid credentials
When User hover on Account and select SIGNIN REGISTER option
And  Enter invalid EmailId and password
And User click on SIGNIN button
Then Validate user not go to Home Page




