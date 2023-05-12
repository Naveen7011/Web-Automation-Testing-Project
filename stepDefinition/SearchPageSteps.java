
package copyStepDefinitionFiles;



import helperCommon.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class SearchPageSteps extends Base 
{
	SearchPage search = new SearchPage();

	@Given("User launch Url")
	

	@When("User click on search field and type and press enter")
	public void user_click_on_search_field_and_type_and_press_enter()
	{
		search.user_click_on_search_field_and_type_and_press_enter();
	}

	@When("User hover the product in PLP Page")
	public void user_hover_the_product_in_plp_page()
	{
		search.user_hover_the_product_in_plp_page();
	}

	@Then("User click on Add to Basket button")
	public void user_click_on_add_to_basket_button()
	{
		search.user_click_on_add_to_basket_button();
	}

}
