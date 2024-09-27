package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import POM.LandingPage;
import WebdriverManager.driverFactory;

public class LandingPageStepDef {
	
	WebDriver driver = driverFactory.getDriver();
	private LandingPage landingPage = new LandingPage(driver);
		
	@Given("user is on dsportal landingPage")
	public void user_is_on_dsportal_landingPage() {
		landingPage.golandingPage();
	}

	@When("user click on {string} button")
	public void user_click_on_button(String string) {
		landingPage.clickGetStarted();		 
	}

	@Then("user navigates to dsalgo dashBoard {string} successfully")
	public void user_navigates_to_dsalgo_dash_board_successfully(String expectedUrl) {
		boolean isAtDashboard = landingPage.isAtDashboard(expectedUrl);
		Assert.assertTrue(isAtDashboard, "User is not on the expected DS Algo dashboard");
	}
}
