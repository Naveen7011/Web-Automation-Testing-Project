
  package copyPageFiles;
  
	import org.openqa.selenium.By;
	//import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	import helperCommon.Base;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

  public class LoginPage extends Base 
  {
  
		@When("User Enter Correct username and password")
		public void user_enter_correct_username_and_password() 
		{
			WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
			username.sendKeys(prop.getProperty("username"));
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			password.sendKeys(prop.getProperty("password"));
 
	/*
	 * //DropDown Element call // WebElement
	 * dropdown=driver.findElement(By.xpath("//select[@id='course']")) ; //
	 * selectByVisibleText(dropdown,"Java"); // selectByIndex(dropdown,4);
	 * //selectByValue(dropdown,"java");
	 * 
	 * //Mouse Action Call // WebElement
	 * accepts_all_cookies_button=driver.findElement(By.xpath(
	 * "//button[@id='onetrust-accept-btn-handler']")) ; //
	 * accepts_all_cookies_button.click(); //WebElement
	 * age18plus_button=driver.findElement(By.xpath(
	 * "//button[@id='btn-entry-age-allow']")) ; //age18plus_button.click(); //
	 * WebElement searchfield=driver.findElement(By.xpath("//input[@id='search']"));
	 * // WebElement
	 * personicon=driver.findElement(By.xpath("//span[@class='icon-account']"));
	 * //mouseHover(personicon); //mouseRightClick(searchfield); //
	 * type(searchfield,"hello"+Keys.ENTER);
	 * 
	 */
  }
  
	@And("User click on login button")
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
 