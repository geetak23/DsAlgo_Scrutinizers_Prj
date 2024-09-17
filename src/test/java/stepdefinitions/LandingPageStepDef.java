package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageStepDef {
	
	WebDriver driver;
	
	@Given("user is on dsportal home page")
	public void user_is_on_dsportal_home_page() {
		
		driver = new ChromeDriver();
        
        // Open the dsportal home page
        driver.get("https://dsportalapp.herokuapp.com/");
	}
	

	@Given("user is on prepare for the interviews page")
	public void user_is_on_prepare_for_the_interviews_page() {
	 
	}
	    
    @When("user click on {string} button")
    public void user_clicks_the_get_started_button(String buttonText) {
        // Locate the "Get Started" button by text and click it
        WebElement getStartedButton = driver.findElement(By.xpath("//button[text()='" + buttonText + "']"));
        getStartedButton.click();
    }
      
    @Then("user navigates to dsalgo dashBoard {string} successfully") 
    public void user_navigates_to_dsalgo_dashboard_successfully(String expectedUrl) {
    	// Check if the current URL matches the expected URL
        String currentUrl = driver.getCurrentUrl();
        if(!currentUrl.equals(expectedUrl)) {
            throw new AssertionError("Expected URL: " + expectedUrl + " but got: " + currentUrl);
        }    
    }
}
