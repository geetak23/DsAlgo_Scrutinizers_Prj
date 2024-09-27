package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import POM.SignInPage;
import WebdriverManager.driverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInStepDef extends driverFactory {
	private static String pageTitle;
	WebDriver driver = driverFactory.getDriver();
	private SignInPage signInPage = new SignInPage(driver);
	
	@Given("user is on the DS Portal login page")	
	public void user_is_on_the_ds_portal_login_page() {
		signInPage.openSignInPage();
	}
	
	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		pageTitle = signInPage.getSignInPageTitle();		
	}
	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(pageTitle.contains(expectedTitleName));
	}
		
	
	@When("user enters an invalid username as <username> and Invalid password as <password> and clicks Login")
	public void user_enters_an_invalid_username_and_Invalid_password_and_clicks_Login(io.cucumber.datatable.DataTable dataTable)
	{
		// Convert DataTable to a Map
        Map<String, String> credentials = dataTable.asMap(String.class, String.class);

        // Retrieve the username and password from the Map
        String  username = credentials.get("username");
        String password = credentials.get("password");
        System.out.println(username+" : "+password);
       
        signInPage.enteruserName(username);
        signInPage.enterpwd(password);	
        signInPage.clickonSignIn();		   
	}
	@Then("user should see an error message {string}")
	public void user_should_see_an_error_message(String errorMsg) {
		Assert.assertEquals(signInPage.LoginBtnError(), errorMsg);
	}
	
	@When("user enters a valid username as <username> and valid password<password> and clicks Login")
	public void user_enters_a_valid_username_and_valid_password_and_clicks_login(io.cucumber.datatable.DataTable dataTable)
	{
		// Convert DataTable to a Map
        Map<String, String> credentials = dataTable.asMap(String.class, String.class);

        // Retrieve the username and password from the Map
        String  username = credentials.get("username");
        String password = credentials.get("password");
        System.out.println(username+" : "+password);
       
        signInPage.enteruserName(username);
        signInPage.enterpwd(password);	
        signInPage.clickonSignIn();		   
	}
	@Then("user should be navigated to the DS Algo Dashboard at {string}")
	public void user_should_be_navigated_to_the_ds_algo_dashboard_at(String string) {
	  signInPage.navigateToDashBoard();
	}
	
	
	
}
