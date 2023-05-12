package stepDefinition;

import static org.junit.jupiter.api.Assertions.assertTrue;

import helperCommon.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NewLookSearchPage;

public class NewLookSearchSteps extends Base
{
	NewLookSearchPage newlooksearchpage=new NewLookSearchPage();
	@When("User click on search field and type valid keyword and press enter")
	public void user_click_on_search_field_and_type_valid_keyword_and_press_enter() 
	{
	    
	    newlooksearchpage.user_click_on_search_field_and_type_valid_keyword_and_press_enter();
	}

	@And("User hover the product in PLP Page and click on the product")
	public void user_hover_the_product_in_plp_page_and_click_on_the_product() 
	{
	     newlooksearchpage.user_hover_the_product_in_plp_page_and_click_on_the_product();
	    
	}

	@And("Click on color icon and select size and click on Add to Bag button")
	public void click_on_color_icon_and_select_size_and_click_on_add_to_bag_button()
	{
	     
	    newlooksearchpage.click_on_color_icon_and_select_size_and_click_on_add_to_bag_button();
	}

	@Then("Product is added to the bag")
	public void product_is_added_to_the_bag() 
	{
	     
	   assertTrue(newlooksearchpage.product_is_added_to_the_bag()); 
	}


}
