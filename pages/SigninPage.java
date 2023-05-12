package copyPageFiles;
/*
 * package pages;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebElement;
 * 
 * import helperCommon.Base; //import io.cucumber.java.en.Given; import
 * io.cucumber.java.en.Then; import io.cucumber.java.en.When;
 * 
 * public class SigninPage extends Base {
 * 
 * @When("User hover on Account and select SIGNIN REGISTER option") public void
 * user_hover_on_account_and_select_signin_register_option() { WebElement
 * accepts_all_cookies_button =
 * driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
 * // jsClickExecutor(accepts_all_cookies_button);
 * accepts_all_cookies_button.click();
 * 
 * WebElement age18plus_button=driver.findElement(By.xpath(
 * "//*[@id='root']/aside[3]/form/div/div[2]/div/div[2]/div[1]/button[2]")) ;
 * jsClickExecutor(age18plus_button); // age18plus_button.click(); WebElement
 * personicon=driver.findElement(By.xpath("//span[@class='icon-account']"));
 * mouseHover(personicon); WebElement
 * signin=driver.findElement(By.linkText("SIGN IN/REGISTER")); signin.click();
 * 
 * }
 * 
 * @When("Enter invalid EmailId and password") public void
 * enter_invalid_email_id_and_password() { WebElement
 * emailid=driver.findElement(By.xpath("//input[@id='email']"));
 * emailid.sendKeys(prop.getProperty("Emailid")); WebElement
 * password=driver.findElement(By.xpath("//input[@id='pass'][1]"));
 * password.sendKeys(prop.getProperty("password"));
 * 
 * }
 * 
 * @When("User click on SIGNIN button") public void
 * user_click_on_signin_button() { WebElement
 * signinbutton=driver.findElement(By.xpath("//button[@name='send'][1]"));
 * signinbutton.click(); }
 * 
 * @Then("Validate user not go to Home Page") public void
 * validate_user_not_go_to_home_page() { WebElement
 * errormsg=driver.findElement(By.xpath(
 * "//*[@id='maincontent']/div[2]/div/div[4]/div[1]/div[2]/div/div/div"));
 * String msg=errormsg.getText(); System.err.println("Error: "+msg); }
 * 
 * 
 * 
 * }
 */