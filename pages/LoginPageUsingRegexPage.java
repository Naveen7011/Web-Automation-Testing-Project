package copyPageFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helperCommon.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageUsingRegexPage extends Base
{

	@When("User Enter Correct {string} and {string}")
	public void user_enter_correct_and(String uname, String pass)
	{
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys(uname);
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(pass);
	}

	@When("User click on login button")
	public void user_click_on_login_button() 
	{
		WebElement loginbtn = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbtn.click(); // System.out.println("test 3");

	}

	@Then("Validate user navigate to Home Page")
	public boolean validate_user_navigate_to_home_page() 
	{
		return (driver.findElement(By.xpath("//span[@class='title']")).isDisplayed()); 
																				
 
  }

}
