

	package stepdefinitions;
	import org.openqa.selenium.By;
	import POM.SignInPage;
	import WebdriverManager.driverFactory;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	
	public class SignOutStepDef extends driverFactory  {
		SignInPage Signin = new SignInPage(driver);
		
		@Given("User is logged in DSAlgo Portal")
		public void user_is_logged_in_ds_algo_portal()
		{	
			Signin.openSignInPage();
			Signin.signinpage("Scrutinizers","Numpysdet176" );					
		}				
				
		@When("User clicks on signout button")
		public void user_clicks_on_signout_button()
		{		
	        System.out.println("Failed");
			driver.findElement(By.linkText("Sign out")).click();
		}
		@Then("The User shoud see the Logged out successfully message in the home page  with Register and Sign in Options")
		public void the_user_shoud_see_the_logged_out_successfully_message_in_the_home_page_with_register_and_sign_in_options()
		{			
			System.out.println("navigating to dashboard");
			driver.navigate().to("https://dsportalapp.herokuapp.com/home");
		}
	
	}
