package POM;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebdriverManager.driverFactory;
public class StackPage extends driverFactory{
	@FindBy(linkText="Operations in Stack") WebElement OperationsinStackTopic;
	@FindBy(linkText="Implementation") WebElement ImplementationTopic;
	@FindBy(linkText="Applications") WebElement ApplicationsTopic;

	WebDriver driver= driverFactory.getDriver();;
	SignInPage Signin=new SignInPage(driverFactory.getDriver());

	public StackPage()
	{
		PageFactory.initElements(driver, this);
	}
	public StackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void openStackPage() {
		Signin.openSignInPage();
		Signin.signinpage("Scrutinizers","Numpysdet176");
		driver.findElement(By.xpath("//a[@href='stack']")).click();

	}
	public void clickTopic(String topic2 ) throws Exception {

		List<WebElement> Topic = driver.findElements(By.className("list-group-item"));
		
		
		
		Topic.get(0).click();
	}
	public void operationsinStackTopic(){
		OperationsinStackTopic.click();
	}
	public void implementationTopic(){
		ImplementationTopic.click();
	}
	public void applicationsTopic(){
		ApplicationsTopic.click();
	}

}
