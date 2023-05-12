
package copyPageFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import helperCommon.Base;
import io.cucumber.java.en.When;

public class RegisterationPage extends Base
{

	@When("User hover on Account and select Signin option")
	public void user_hover_on_account_and_select_signin_option() 
	{
		WebElement accepts_all_cookies_button = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		accepts_all_cookies_button.click();
		WebElement age18plus_button = driver.findElement(By.xpath("//*[@id='root']/aside[4]/form/div/div[2]/div/div[2]/div[1]/button[2]"));
		age18plus_button.click();
		WebElement personicon = driver.findElement(By.xpath("//span[@class='icon-account']"));
		mouseHover(personicon);
		WebElement signin = driver.findElement(By.linkText("SIGN IN/REGISTER"));
		signin.click();

	}

	@When("User Click on create account button")
	public void user_click_on_create_account_button()
	{
		WebElement createaccountbtn = driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div/div[4]/div[4]/div[2]/div/div/a/span"));
		createaccountbtn.click();
	}

	@When("User enter valid details")
	public void user_enter_valid_details()
	{
		WebElement firstname = driver.findElement(By.xpath("//input[@id='firstname']"));
		firstname.sendKeys("Rahul");
		WebElement lastname = driver.findElement(By.xpath("//input[@id='lastname']"));
		lastname.sendKeys("Sharma");
		WebElement emailaddress = driver.findElement(By.xpath("//input[@id='email_address']"));
		emailaddress.sendKeys("RahulSharma@xyz.com");
		WebElement dob = driver.findElement(By.xpath("//input[@id='dob']"));
		dob.sendKeys("20/03/1992");
		WebElement gender_dropdown = driver.findElement(By.xpath("//select[@id='gender']"));
		Select s = new Select(gender_dropdown);
		s.selectByValue("1");
		WebElement address = driver.findElement(By.xpath("//input[@id='address-search']"));
		address.sendKeys("India"); // WebElement
		//phone_number = driver.findElement(By.xpath("//input[@id='telephone']"));
		// phone_number.sendKeys("1234567890"); 
		WebElement checkbox=driver.findElement(By.xpath("//span[@class='small-checkbox-text']"));
		checkbox.click();
		WebElement password =driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Sharma@123");
		WebElement confirm_password = driver.findElement(By.xpath("//input[@id='password-confirmation']"));
		confirm_password.sendKeys("Sharma@123");
		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id='form-validate']/fieldset[3]/div[3]/label"));
		checkbox1.click();
		WebElement checkbox2 =driver.findElement(By.xpath("//*[@id='form-validate']/fieldset[3]/div[4]/div/div[1]/label"));
		checkbox2.click();
		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id='form-validate']/fieldset[3]/div[4]/div/div[2]/label"));
		checkbox3.click();

	}

	@When("click on CREATE YOUR ACCOUNT button")
	public void click_on_create_your_account_button() 
	{

		WebElement createbtn = driver.findElement(By.xpath("//button[@class='action submit primary']"));
		createbtn.click();
		WebElement firstname = driver.findElement(By.xpath("//div[@id='firstname-error']"));
		String msg = firstname.getText();
		System.out.println("First Name field is required : " + msg);

		WebElement lastname = driver.findElement(By.xpath("//div[@id='lastname-error']"));
		String msg1 = lastname.getText();
		System.out.println("Last Name field is required : " + msg1);

		WebElement emailaddress = driver.findElement(By.xpath("//div[@id='email_address-error']"));
		String msg2 = emailaddress.getText();
		System.out.println("Email Address field is required : " + msg2);

		WebElement dob = driver.findElement(By.xpath("//div[@id='dob-error']"));
		String msg3 = dob.getText();
		System.out.println("DOB field is required : " + msg3);

		WebElement aaddresssearch = driver.findElement(By.xpath("//div[@id='address-search-error']"));
		String msg5 = aaddresssearch.getText();
		System.out.println("Address field is required : " + msg5);

		WebElement phoneno = driver.findElement(By.xpath("//div[@id='telephone-error']"));
		String msg6 = phoneno.getText();
		System.out.println("Phone no error msg : " + msg6);

		WebElement password = driver.findElement(By.xpath("//div[@id='password-error']"));
		String msg7 = password.getText();
		System.out.println("Password Field is required : " + msg7);

		WebElement confirmpwd = driver.findElement(By.xpath("//div[@id='password-confirmation-error']"));
		String msg8 = confirmpwd.getText();
		System.out.println("Confirm Password Field is required : " + msg8);

		WebElement agreement = driver.findElement(By.xpath("//div[@id='agreement-1-error']"));
		String msg9 = agreement.getText();
		System.out.println("Agreement Field is required : " + msg9);

	}

}
