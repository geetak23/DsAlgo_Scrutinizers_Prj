package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebdriverManager.Webdrivermanager;

public class LandingPage {
	 private WebDriver driver;

	    // Locator for the "Get Started" button
	    private By getStartedButton = By.xpath("//button[text()='Get Started']");

	    // Constructor to initialize the WebDriver
	    public LandingPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Method to click on the "Get Started" button
	    public void clickGetStarted() {
	        driver.findElement(getStartedButton).click();
	    }

	    // Method to verify the current URL
	    public boolean isAtDashboard(String expectedUrl) {
	        return driver.getCurrentUrl().equals(expectedUrl);
	    }

	    // Method to navigate to the homepage
	    public void goToHomePage() {
	        driver.get("https://dsportalapp.herokuapp.com");
	    }
}
