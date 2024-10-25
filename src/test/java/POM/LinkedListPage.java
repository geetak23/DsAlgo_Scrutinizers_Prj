package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebdriverManager.driverFactory;

public class LinkedListPage extends driverFactory {
	@FindBy(linkText="Introduction") WebElement IntroductionTopic;
	@FindBy(linkText="Creating Linked LIst") WebElement CreatingLinkedLIstTopic;
	@FindBy(linkText="Types of Linked List") WebElement TypesofLinkedListTopic;
	@FindBy(linkText="Implement Linked List in Python") WebElement ImplementLinkedListinPythonTopic;
	@FindBy(linkText="Traversal") WebElement TraversalTopic;
	@FindBy(linkText="Insertion") WebElement InsertionTopic;
	@FindBy(linkText="Deletion") WebElement DeletionTopic;
	
	WebDriver driver= driverFactory.getDriver();
	private SignInPage Signin=new SignInPage(driverFactory.getDriver());
	
	public LinkedListPage() 
	{
		PageFactory.initElements(driver, this);
	}
	public LinkedListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void openLinkedListPage() {
	
		Signin.openSignInPage();
		Signin.signinpage("Scrutinizers","Numpysdet176");
	
		driver.findElement(By.xpath("//a[@href='linked-list']")).click();

	}
	public void introductionTopic() {
		IntroductionTopic.click();	
	}
	public void creatingLinkedLIstTopic() {
		CreatingLinkedLIstTopic.click();	
	}
	public void typesofLinkedListTopic() {
		TypesofLinkedListTopic.click();
	}
	public void implementLinkedListinPythonTopic() {
		ImplementLinkedListinPythonTopic.click();
	}
	public void traversalTopic() {
		TraversalTopic.click();
	}
	public void insertionTopic() {
		InsertionTopic.click();
	}
	public void deletionTopic() {
		DeletionTopic.click();
	}

}
