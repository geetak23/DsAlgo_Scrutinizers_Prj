package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebdriverManager.driverFactory;
public class GraphPage {

	@FindBy(linkText="Graph") WebElement GraphTopic;
	@FindBy(linkText="Graph Representations") WebElement GraphRepresentationTopic;
	WebDriver driver= driverFactory.getDriver();
	SignInPage Signin=new SignInPage(driverFactory.getDriver());
	/*public GraphPage()
	{
		PageFactory.initElements(driver, this);
	}*/
	public GraphPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void openGraphPage() {
		Signin.openSignInPage();
		Signin.signinpage("Scrutinizers","Numpysdet176");
		driver.findElement(By.xpath("//a[@href='graph']")).click();


	}
	public void graphTopic() {

		GraphTopic.click();
	}
	public void graphRepresentation() {
		GraphRepresentationTopic.click();
	}

}
