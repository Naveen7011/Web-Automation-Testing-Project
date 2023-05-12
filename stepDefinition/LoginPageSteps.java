
package copyStepDefinitionFiles;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.WebDriver;

import helperCommon.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageSteps extends Base {
	WebDriver driver;
	LoginPage lp = new LoginPage();

	@When("User Enter Correct username and password")
	public void user_enter_correct_username_and_password() {
		lp.user_enter_correct_username_and_password();

	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		lp.user_click_on_login_button();

	}

	@Then("Validate user navigate to Home Page")
	public void validate_user_navigate_to_home_page() {
		assertTrue(lp.validate_user_navigate_to_home_page());

	}

}
