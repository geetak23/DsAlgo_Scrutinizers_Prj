package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashBoard {
	@Then("the page title should be {string}")
	public void the_page_title_should_be(String string) {

	}

	@Then("user should be navigated to {string}")
	public void user_should_be_navigated_to(String string) {

	}

	@When("user clicks on {string} link")
	public void user_clicks_on_link(String string) {
	
	}

	@Given("user is Non-signed in on dsportal home page")
	public void user_is_non_signed_in_on_dsportal_home_page() {
	 
	}

	@When("user selects {string} from the Data Structure dropdown")
	public void user_selects_from_the_data_structure_dropdown(String string) {
	 
	}

	@Then("user receives {string}  message")
	public void user_receives_message(String string) {
	
	}

	@When("user clicks on {string} button for {string}")
	public void user_clicks_on_button_for(String string, String string2) {
	   
	}

	@Given("user is signed in on dsportal home page")
	public void user_is_signed_in_on_dsportal_home_page() {

	}
}
