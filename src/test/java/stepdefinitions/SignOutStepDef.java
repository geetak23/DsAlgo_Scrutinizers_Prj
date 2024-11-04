package stepdefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import POM.SignInPage;
import WebdriverManager.driverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignOutStepDef extends driverFactory {
	WebDriver driver = driverFactory.getDriver();
	SignInPage Signin=new SignInPage(driver);
	@Given("User is logged in DSAlgo Portal")
	public void user_is_logged_in_ds_algo_portal() {
		Signin.openSignInPage();
		Signin.signinpage("Scrutinizers","Numpysdet176");

	}


	@When("User clicks on signout button")
	public void user_clicks_on_signout_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Success");
		driver.findElement(By.linkText("Sign out")).click();


		// throw new io.cucumber.java.PendingException();
	}

	@Then("The User shoud see the Logged out successfully message in the home page  with Register and Sign in Options")
	public void the_user_shoud_see_the_logged_out_successfully_message_in_the_home_page_with_register_and_sign_in_options() {
		// Write code here that turns the phrase above into concrete actions
		driver.navigate().to("https://dsportalapp.herokuapp.com/home");
		driver.getPageSource().contains("Logged out successfully");


	}
	@Given("User is in Array page")
	public void user_is_in_array_page() {
	   
	}


}

