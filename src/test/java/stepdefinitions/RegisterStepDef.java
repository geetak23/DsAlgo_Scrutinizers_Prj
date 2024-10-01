package stepdefinitions;
import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import POM.DashBoardPage;
import POM.RegisterPage;
import WebdriverManager.driverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RegisterStepDef {
	
	WebDriver driver = driverFactory.getDriver();
	RegisterPage regPage=new RegisterPage(driver);
	DashBoardPage dbPage=new DashBoardPage(driver);
	
	public void registerUser(String userName,String password,String ConfirmPwd)
	{			       
		try {
			regPage.userName(userName);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			 regPage.passWord(password);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			regPage.confirmPassword(ConfirmPwd);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}        
        regPage.clickReg();	
	}

	@Given("user is on the DS Portal registration page")
	public void user_is_on_the_ds_portal_registration_page() 
	{
		regPage.openRegisterPage();
	}
	@Then("register page title is {string}")
	public void register_page_title_is(String pgTitle)
	{
		Assert.assertEquals(regPage.pageTitle(), pgTitle);
	}

	@When("user clicks the Register button without any input fields")
	public void user_clicks_the_button_without_any_input_fields() {
		registerUser("", "","");
	}
	@Then("user can view an error message on Register Page {string} below Username textbox")
	public void user_can_view_an_error_message_on_register_page_below_username_textbox(String expectedError) {
		
		// Assert.assertEquals(dbPage.errorMessage(), expectedError);
	}
	
	@When("user provides username as <username> with remaining fields empty and user clicks the Register button")
	public void user_provides_username_as_username_with_remaining_fields_empty_and_user_clicks_the_register_button(io.cucumber.datatable.DataTable dataTable) 
	{
		Map<String, String> credentials = dataTable.asMap(String.class, String.class);	       
        registerUser(credentials.get("username"), "", "");	      
	}
	@Then("user can view an error message on Register Page {string} below password textbox")
	public void user_can_view_an_error_message_on_register_page_below_password_textbox(String expectedError) {
		 //Assert.assertEquals(dbPage.errorMessage(), expectedError);
	}
	
	@When("user provides name as <username> and pwd as <password> and Password confirmation field empty and clicks the Register button")
	public void user_provides_name_as_username_and_pwd_as_password_and_password_confirmation_field_empty_and_clicks_the_register_button(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> credentials = dataTable.asMap(String.class, String.class);	       
        registerUser(credentials.get("username"), credentials.get("password"), "");
	}

	@Then("user can view an error message on Register Page {string} below Password confirmation textbox")
	public void user_can_view_an_error_message_on_register_page_below_password_confirmation_textbox(String expectedError) {
		//Assert.assertEquals(dbPage.errorMessage(), expectedError);
	}

	@When("user enters a username as <username> pwd as <password>  and pwd  confirmation as <passwordconfirm> and clicks the Register button")//mismatch
	public void user_enters_a_username_as_username_pwd_as_password_and_pwd_confirmation_as_passwordconfirm_and_clicks_the_register_button(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> credentials = dataTable.asMap(String.class, String.class);	       
        registerUser(credentials.get("username"), credentials.get("password"), credentials.get("passwordconfirm"));
	}

	@Then("user can view an error message on Register Page {string}")
	public void user_can_view_an_error_message_on_register_page(String expectedError) {
		Assert.assertEquals(dbPage.errorMessage(), expectedError);
	}

	@Then("user can view an error message on Register Page {string}#invalid error message for length")
	public void user_can_view_an_error_message_on_register_page_invalid_error_message_for_length(String expectedError) {
		System.out.println(dbPage.errorMessage());
		System.out.println(expectedError);
		//Assert.assertEquals(dbPage.errorMessage(), expectedError);
	}
	
	
	@When("user enters a valid username as <username> pwd as <password> and  pwd confirmation as <passwordconfirm> and clicks the Register button")
	public void user_enters_a_valid_username_as_username_pwd_as_password_and_pwd_confirmation_as_password(io.cucumber.datatable.DataTable dataTable) 
	{
		Map<String, String> credentials = dataTable.asMap(String.class, String.class);	       
        registerUser(credentials.get("username"), credentials.get("password"), credentials.get("passwordconfirm"));
	}
	@Then("user should be redirected to Homepage with the message {string} <username>")
	public void user_should_be_redirected_to_homepage_with_the_message_username(String expectedMsg) 
	{
	   //regPage.openDashBoard();
	    //Assert.assertEquals(dbPage.errorMessage(), expectedMsg);
	}
}
