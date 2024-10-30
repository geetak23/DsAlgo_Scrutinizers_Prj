package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebdriverManager.driverFactory;

public class TreePage {
	 
    @FindBy(linkText="Overview of Trees") WebElement OverviewofTreesTopic;
    @FindBy(linkText="Terminologies") WebElement TerminologiesTopic;
    @FindBy(linkText="Types of Trees") WebElement TypesofTreesTopic;
    @FindBy(linkText="Tree Traversals") WebElement TreeTraversalsTopic;
    @FindBy(linkText="Traversals-Illustration") WebElement TraversalsIllustrationTopic;
    @FindBy(linkText="Binary Trees") WebElement BinaryTreesTopic;
    @FindBy(linkText="Types of Binary Trees") WebElement TypesofBinaryTreesTopic;
    @FindBy(linkText="Implementation in Python") WebElement ImplementationinPythonTopic;
    @FindBy(linkText="Binary Tree Traversals") WebElement BinaryTreeTraversalsTopic;
    @FindBy(linkText="Implementation of Binary Trees") WebElement ImplementationofBinaryTreesTopic;
    @FindBy(linkText="Applications of Binary trees") WebElement ApplicationsofBinarytreesTopic;
    @FindBy(linkText="Binary Search Trees") WebElement BinarySearchTreesTopic;
    @FindBy(linkText="Implementation Of BST") WebElement ImplementationOfBSTTopic;
    
    WebDriver driver= driverFactory.getDriver();;
	SignInPage Signin=new SignInPage(driverFactory.getDriver());
	
	/*public TreePage()
	{
	PageFactory.initElements(driver, this);
	}*/
	public  TreePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void openTreePage() throws InterruptedException {
		//Signin.openSignInPage();
		driver.get("https://dsportalapp.herokuapp.com/login");
		Signin.signinpage("Scrutinizers","Numpysdet176");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='tree']")).click();
		
	}
	public void clickTopic(String topic2 ) throws Exception {

		List<WebElement> Topic = driver.findElements(By.className("list-group-item"));
		
		
		//int button_index = Integer.parseInt(getProperty(Topic));
		Topic.get(0).click();
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	
	public void overviewofTreesTopic() {
		OverviewofTreesTopic.click();
		
	}
	public void  terminologiesTopic() {
		TerminologiesTopic.click();
		
	}
	public void typesofTreesTopic() {
		TypesofTreesTopic.click();
		
	}
	public void treeTraversalsTopic() {
		TreeTraversalsTopic.click();
		
	}
	public void traversalsIllustrationTopic() {
		TraversalsIllustrationTopic.click();
		
	}
	public void binaryTreesTopic() {
		BinaryTreesTopic.click();
		
	}
	public void typesofBinaryTreesTopic() {
		TypesofBinaryTreesTopic.click();
		
	}
	public void implementationinPythonTopic() {
		ImplementationinPythonTopic.click();
		
	}
	public void binaryTreeTraversalsTopic() {
		BinaryTreeTraversalsTopic.click();
		
	}
	public void implementationofBinaryTreesTopic() {
		ImplementationofBinaryTreesTopic.click();
		
	}
	public void applicationsofBinarytreesTopic() {
		ApplicationsofBinarytreesTopic.click();
		
	}
	public void binarySearchTreesTopic() {
		BinarySearchTreesTopic.click();
		
	}
	public void implementationOfBSTTopic() {
		ImplementationOfBSTTopic.click();
		
	}
	    
}