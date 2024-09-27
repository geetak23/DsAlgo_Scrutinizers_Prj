package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import POM.DashBoardPage;
import WebdriverManager.driverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashBoardStepDef extends driverFactory{
	
	WebDriver driver = driverFactory.getDriver();
	private DashBoardPage dsDBPage = new DashBoardPage(driver); 
			
	@Given("user is on DS Portal DashBoard without sign in")
	public void user_is_on_dsportal_dash_board_without_sign_in() {
		dsDBPage.openDashBoardPage();
	}
	@Then("the page title should be {string}")
	public void the_page_title_should_be(String stringExpected) {
	  Assert.assertEquals(dsDBPage.getPageTitle(), stringExpected); ;
	}
	
	@When("user clicks on {string} link")
	public void user_clicks_on_link(String linkText) {
		dsDBPage.clickOnLink(linkText);
	}
	@Then("user should be navigated to {string}")
	public void user_should_be_navigated_to(String expectedUrl) {
		boolean isAtDashboard = dsDBPage.isSignInPage(expectedUrl);
		Assert.assertTrue(isAtDashboard, "user is not on the expected SignIn Page");
	}
	@When("user clicks the data structure dropdown arrow")
	public void user_clicks_the_data_structure_dropdown_arrow() {
		System.out.println("datastructure");
		dsDBPage.clickDropDown();
	}

	@Then("user should see the list of six options in the DS dropdown arrow")
	public void user_should_see_the_list_of_six_options_in_the_ds_dropdown_arrow() {
		System.out.println("datastructure");
		dsDBPage.dropDownOptions();
	}

	@When("user selects any DS item from dropdown without sign in")
	public void user_selects_any_ds_item_from_dropdown_without_sign_in() {
		System.out.println("datastructure");
		dsDBPage.clickDropdownitem(3);
	}

	@Then("user should see the error message {string}")
	public void user_should_see_the_error_message(String message) {
		System.out.println("datastructure"); 
		dsDBPage.errorMessage();
		System.out.println("Message you get on clicking any item in Dropdown is :"+message);
	}

	@When("user clicks on GET Started button of  any DataStructures items without sign in")
	public void user_clicks_on_get_started_button_of_any_data_structures_items_without_sign_in() {
		System.out.println("user clicks any of the GetStarted buttons");
		dsDBPage.GetStartBtnList(2);
	}

	@When("user clicks the Register link on DS Portal DashBoard")
	public void user_clicks_the_register_link_on_ds_algo_intoduction_home_page() {
		dsDBPage.clickRegisterLink();
	}
	@Then("user should be redirected to Register page and see the Login link at the bottom of the page")
	public void user_should_be_redirected_to_register_page_and_see_the_login_link_at_the_bottom_of_the_page() {
		dsDBPage.registerPage();
	}

	@When("user clicks the SignIn link on DS Portal DashBoard")
	public void user_clicks_the_sign_in_link_on_ds_algo_intoduction_home_page() {
		dsDBPage.clickSignInPage(); 	
	}
	@Then("user should be redirected to SignIn page and User should see the Register link at the bottom of the page")
	public void user_should_be_redirected_to_sign_in_page_and_user_should_see_the_register_link_at_the_bottom_of_the_page() {
		System.out.println("datastructure"); 
		dsDBPage.loginLinkPage();
	}
	
}
