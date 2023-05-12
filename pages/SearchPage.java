
package copyPageFiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import helperCommon.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPage extends Base
{

	@When("User click on search field and type and press enter")
	public void user_click_on_search_field_and_type_and_press_enter() 
	{
		/*
		 * WebElement accepts_all_cookies_button =
		 * driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		 * //waitforExpectedElement(accepts_all_cookies_button, 10);
		 * //waitElementClickable(accepts_all_cookies_button,10);
		 * //jsClickExecutor(accepts_all_cookies_button);
		 * accepts_all_cookies_button.click(); WebElement age18plus_button =
		 * driver.findElement(By.xpath(
		 * "//*[@id='root']/aside[3]/form/div/div[2]/div/div[2]/div[1]/button[2]"));
		 * //waitforExpectedElement(age18plus_button, 10);
		 * //waitElementClickable(age18plus_button,10);
		 * //jsClickExecutor(age18plus_button); age18plus_button.click();
		 */
		WebElement searchfield = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		type(searchfield, "Mobile Samsung" + Keys.ENTER);
	}

	@When("User hover the product in PLP Page")
	public void user_hover_the_product_in_plp_page() 
	{ 
		 String parentid=driver.getWindowHandle();
		 System.out.println(parentid);
		WebElement product = driver.findElement(By.linkText("Samsung Galaxy M33 5G (Deep Ocean Blue, 8GB, 128GB Storage) | 6000mAh Battery | Upto 16GB RAM with RAM Plus | Without Charger"));
		//mouseHover(product);
		product.click();
		 Set <String> childid=driver.getWindowHandles();
		 for(String s:childid)
		 {
			 if(!parentid.equals(s))
			 {
				 driver.switchTo().window(s);
			 }
				 
		 }
		
	}

	@Then("User click on Add to Basket button")
	public void user_click_on_add_to_basket_button()
	{
		
		
		WebElement addtobasketbtn = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addtobasketbtn.click();
		 WebElement logotxt=driver.findElement(By.xpath("//*[@id='attachDisplayAddBaseAlert']/span']")) ;
		  String logotest=logotxt.getText();
		assertEquals("Added to Cart",logotest,"Product not added Mismatch in the text");
		 
	}

}


