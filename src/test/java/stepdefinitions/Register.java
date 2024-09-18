package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	@Given("user is on the DS Portal registration page")
	public void user_is_on_the_ds_portal_registration_page() {
	   
	}

	@When("user clicks the {string} button")
	public void user_clicks_the_button(String string) {
	    
	}

	@Then("user can view an error message {string} below Username textbox")
	public void user_can_view_an_error_message_below_username_textbox(String string) {
	  
	}

	@When("user provides username as <username> with remaining fields empty")
	public void user_provides_username_as_username_with_remaining_fields_empty(io.cucumber.datatable.DataTable dataTable) {
	
	}


	@When("user provides username as <username> and password as <password> with Password confirmation field empty")
	public void user_provides_username_as_username_and_password_as_password_with_password_confirmation_field_empty(io.cucumber.datatable.DataTable dataTable) {
	    
	}

	@Then("user can view an error message {string} below Password confirmation textbox")
	public void user_can_view_an_error_message_below_password_confirmation_textbox(String string) {
	   
	}

	@When("user enters a valid username as <username>")
	public void user_enters_a_valid_username_as_username() {
	    
	}

	@When("user enters a valid password as <password>")
	public void user_enters_a_valid_password_as_password() {
	   
	}

	@When("user password  confirmation as <passwordconfirm> # Non-matching password")
	public void user_password_confirmation_as_passwordconfirm_non_matching_password(io.cucumber.datatable.DataTable dataTable) {
	   
	}

	@Then("user should see an error message {string}")
	public void user_should_see_an_error_message(String string) {
	   
	}

	@When("user password  confirmation as <passwordconfirm>")
	public void user_password_confirmation_as_passwordconfirm(io.cucumber.datatable.DataTable dataTable) {
	   
	}

	@Then("user should see an error message {string}#invalid error message for length")
	public void user_should_see_an_error_message_invalid_error_message_for_length(String string) {
	  
	}

	@Then("user should be redirected to Homepage with the message {string} <username>")
	public void user_should_be_redirected_to_homepage_with_the_message_username(String string) {
	   
	}



}
