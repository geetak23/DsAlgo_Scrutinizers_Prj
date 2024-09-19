package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignIn {
	@Given("user is on the DS Portal login page")
	public void user_is_on_the_ds_portal_login_page() {
	   
	}

	@When("user enters a valid username as <username> and valid password<password>")
	public void user_enters_a_valid_username_as_username_and_valid_password_password(io.cucumber.datatable.DataTable dataTable) {
	    
	}

	@Then("user should be navigated to the DS Algo Dashboard at {string}")
	public void user_should_be_navigated_to_the_ds_algo_dashboard_at(String string) {
	   
	}

	@When("user enters an invalid username as <username> and user enters a valid password as <password>")
	public void user_enters_an_invalid_username_as_username_and_user_enters_a_valid_password_as_password(io.cucumber.datatable.DataTable dataTable) {
	   
	}

	@Then("user should see an error message {string} #Please fill out this field")
	public void user_should_see_an_error_message_please_fill_out_this_field(String string) {
	    
	}

	@When("user enters an valid username as <username> and invalid password as <password>")
	public void user_enters_an_valid_username_as_username_and_invalid_password_as_password(io.cucumber.datatable.DataTable dataTable) {
	    
	}

	@When("user enters an invalid username as <username> and invalid password as <password>")
	public void user_enters_an_invalid_username_as_username_and_invalid_password_as_password(io.cucumber.datatable.DataTable dataTable) {
	  
	}

}
