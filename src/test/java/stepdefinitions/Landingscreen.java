package stepdefinitions;

import POM.LandingPage;
import WebdriverManager.driverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Landingscreen  extends driverFactory{
	
 
    private LandingPage landingPage = new LandingPage(driver);
	
	@Given("user is on dsportal home page")
	public void user_is_on_dsportal_home_page() {
		 landingPage.goToHomePage();
	}

	@When("user click on {string} button")
	public void user_click_on_button(String string) {
		landingPage.clickGetStarted();
	 
	}

	@Then("user navigates to dsalgo dashBoard {string} successfully")
	public void user_navigates_to_dsalgo_dash_board_successfully(String expectedUrl) {
		 boolean isAtDashboard = landingPage.isAtDashboard(expectedUrl);
		// Assert.assertTrue(isAtDashboard, "User is not on the expected DS Algo dashboard");
	}

}
