package copyStepDefinitionFiles;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helperCommon.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPageUsingRegexPage;

public class LoginPageUsingRegexSteps extends Base
{
    LoginPageUsingRegexPage regex=new LoginPageUsingRegexPage();
	@When("User Enter Correct {string} and {string}")
	public void user_enter_correct_and(String uname, String pass)
	{
		regex.user_enter_correct_and(uname, pass);
	}
 
	@When("User click on login button")
	public void user_click_on_login_button()
	{
		regex.user_click_on_login_button();

	}

	@Then("Validate user navigate to Home Page")
	public void validate_user_navigate_to_home_page()
	{
		assertTrue(regex.validate_user_navigate_to_home_page());

	}
 
}
