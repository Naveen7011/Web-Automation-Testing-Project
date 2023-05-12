package copyPageFiles;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helperCommon.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewLookLoginPage extends Base
{
	@When("User hover on Account and select Sign in option")
	public void user_hover_on_account_and_select_sign_in_option()
	{
	    
		 WebElement personicon=driver.findElement(By.xpath("//i[@class='masthead__icon masthead__icon-user']"));
		 mouseHover(personicon);
		 WebElement signin=driver.findElement(By.xpath("//a[@href='/row/login'][1]"));
		 signin.click();
	}

	@And("Enter invalid EmailId and password")
	public void enter_invalid_email_id_and_password() 
	{
		WebElement username = driver.findElement(By.xpath("//input[@id='j_username']"));
		username.sendKeys(prop.getProperty("Emailid"));
		WebElement password = driver.findElement(By.xpath("//input[@id='j_password']"));
		password.sendKeys(prop.getProperty("password"));
	   
	}

	@And("User click on Sign in button")
	public void user_click_on_sign_in_button() 
	{
		WebElement loginbtn = driver.findElement(By.xpath("//button[@class='checkout__form-button button button--primary button-green']"));
		loginbtn.click();
	}

	@Then("Validate user not go to Home Page")
	public void validate_user_not_go_to_home_page()
	{
		 WebElement logotxt=driver.findElement(By.xpath("//li[@class='alert__item alert__item--rendered']")) ;
		  String logotest=logotxt.getText();
		assertEquals("Your email or password was incorrect",logotest,"Mismatch in the logo text");
		System.out.println(logotest);
		//return (driver.findElement(By.xpath("//li[@class='alert__item alert__item--rendered']")).isDisplayed());
		
	}

}
