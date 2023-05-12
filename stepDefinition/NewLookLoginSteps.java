package copyStepDefinitionFiles;



import static org.junit.jupiter.api.Assertions.assertTrue;

import helperCommon.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NewLookLoginPage;

public class NewLookLoginSteps extends Base
{
	NewLookLoginPage newlookpage=new NewLookLoginPage();
	@When("User hover on Account and select Sign in option")
	public void user_hover_on_account_and_select_sign_in_option()
	{
	    newlookpage.user_hover_on_account_and_select_sign_in_option();
	
	}

	@And("Enter invalid EmailId and password")
	public void enter_invalid_email_id_and_password() 
	{
	     
	   newlookpage.enter_invalid_email_id_and_password();
	}

	@And("User click on Sign in button")
	public void user_click_on_sign_in_button() 
	{
	newlookpage.user_click_on_sign_in_button();
	}

	@Then("Validate user not go to Home Page")
	public void validate_user_not_go_to_home_page()
	{
	  newlookpage.validate_user_not_go_to_home_page();
	}

}
