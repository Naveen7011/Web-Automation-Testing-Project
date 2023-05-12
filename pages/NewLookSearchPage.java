package pages;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import helperCommon.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewLookSearchPage extends Base
{
	@When("User click on search field and type valid keyword and press enter")
	public void user_click_on_search_field_and_type_valid_keyword_and_press_enter() 
	{
		WebElement searchfield = driver.findElement(By.xpath("//input[@name='text'][1]"));
		//searchfield.click();
		type(searchfield, "Jeans" + Keys.ENTER);
	    
	}

	@And("User hover the product in PLP Page and click on the product")
	public void user_hover_the_product_in_plp_page_and_click_on_the_product() 
	{
		WebElement product = driver.findElement(By.linkText("Girls Black Cargo Skinny Jeans"));
		mouseHover(product);
		//jsClickExecutor(product);
		product.click();
	}

	@And("Click on color icon and select size and click on Add to Bag button")
	public void click_on_color_icon_and_select_size_and_click_on_add_to_bag_button()
	{
		    WebElement product_size = driver.findElement(By.xpath("//select[@data-ng-model='productInfo.selectedSize']"));
		  //  selectByVisibleText(product_size,"9 years");
		    selectByIndex(product_size, 3);
		    /*
			 * WebElement product_color =
			 * driver.findElement(By.xpath("//a[@class='swatch__link ng-scope']"));
			 * jsClickExecutor(product_color); product_color.click();
			 */
		    WebElement addtobag = driver.findElement(By.xpath("//button[@data-translate='product.addToBag']"));
			addtobag.click();

   }
	@Then("Product is added to the bag")
	public boolean product_is_added_to_the_bag() 
	{   
		
	int size=driver.findElements(By.tagName("iframe")).size();
	System.out.println("Size if iframe is"+size);
	//driver.switchTo().frame();
	WebElement bag = driver.findElement(By.xpath("//div[@class='product-details__added-to-bag ng-scope']"));
		Boolean b=bag.isDisplayed();
		return b;
		  
		
		/*
		 * WebElement addtobagmsg = driver.findElement(By.xpath(
		 * "(//span[@data-translate='product.addedToBag.added'])[1]")); String
		 * msg=addtobagmsg.getText();
		 * assertEquals(" Added to your bag",msg,"Product is not added to the cart");
		 * System.out.println(msg);
		 */	 
		
	}


	
}
