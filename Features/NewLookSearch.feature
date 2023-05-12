Feature: Search Functionality

@Search
Scenario: Verify Search functionality with valid searching keyword

When User click on search field and type valid keyword and press enter
And  User hover the product in PLP Page and click on the product
And  Click on color icon and select size and click on Add to Bag button
Then Product is added to the bag