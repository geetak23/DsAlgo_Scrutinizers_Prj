package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	private WebDriver driver;

	    // Locator for the "Get Started" button		
		
	    private By getStartedButton = By.xpath("//button[text()='Get Started']");

	    // Constructor to initialize the WebDriver
	    public LandingPage(WebDriver driver) {
	    	System.out.println("In landing step def");
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

	    // Method to navigate to the home page
	    public void golandingPage() {
	        driver.get("https://dsportalapp.herokuapp.com");
	    }
	    public String getPageTitle() {
	        return driver.getTitle();
	    }
	  /*  public DashBoardPage doNavigationtoDashBoard()
	    {	    	
	    	driver.findElement(getStartedButton).click();
	    	return new DashBoardPage(driver);
	    }*/
}
