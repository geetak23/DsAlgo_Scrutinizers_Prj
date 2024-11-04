package POM;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebdriverManager.driverFactory;
public class QueuePage extends driverFactory {
	@FindBy(linkText="Implementation of Queue in Python") WebElement ImplementationofQueueinPythonTopic;
	@FindBy(linkText="Implementation using collections.deque") WebElement ImplementationusingcollectionsdequeTopic;
	@FindBy(linkText="Implementation using array") WebElement ImplementationusingarrayTopic;
	@FindBy(linkText="Queue Operations") WebElement QueueOperationsTopic;
    @FindBy(linkText="Try here>>>") WebElement TryHereButton;
   
	WebDriver driver= driverFactory.getDriver();;
	SignInPage Signin=new SignInPage(driverFactory.getDriver());

	public QueuePage()
	{
		PageFactory.initElements(driver, this);
	}
	public  QueuePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void openQueuePage() {
		Signin.openSignInPage();
		Signin.signinpage("Scrutinizers","Numpysdet176");
		driver.findElement(By.xpath("//a[@href='queue']")).click();

	}
	public void clickTopic(String topic2 ) throws Exception {

		List<WebElement> Topic = driver.findElements(By.className("list-group-item"));
		
		
		//int button_index = Integer.parseInt(getProperty(Topic));
		Topic.get(0).click();
	}
	public void implementationofQueueinPythonTopic() {
		ImplementationofQueueinPythonTopic.click();
	}

	public void implementationusingcollectionsdequeTopic() {
		ImplementationusingcollectionsdequeTopic.click();
	}

	public void implementationusingarrayTopic() {
		ImplementationusingarrayTopic.click();
	}

	public void queueOperationsTopic() {
		QueueOperationsTopic.click();
	}

public void tryHere() {
	TryHereButton.click();
}

}
