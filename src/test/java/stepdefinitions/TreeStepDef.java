package stepdefinitions;
import static org.testng.AssertJUnit.assertEquals;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.SignInPage;
import POM.TreePage;
import Utilities.Xls_Reader;
import WebdriverManager.driverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class TreeStepDef extends driverFactory{
	WebDriver driver = driverFactory.getDriver();
	private static String pageTitle;
    SignInPage Signin=new SignInPage(driverFactory.getDriver());
    TreePage tree=new TreePage(driverFactory.getDriver());
    Xls_Reader reader = new Xls_Reader();
    List<Map<String, String>> testData;
    
    
    //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);



//@Given("User is logged in DSAlgo Portal")
//public void user_is_logged_in_ds_algo_portal() {
//	Signin.signinpage("Scrutinizers", );
	
//}

@When("click on the dropdown and select Tree")
public void click_on_the_dropdown_and_select_tree() {
   driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']")).click();
   driver.findElement(By.linkText("Tree")).click();
}

@Then("The user should be directed to Tree Page")
public void the_user_should_be_directed_to_tree_page() {
    driver.getPageSource().contains(" A tree is a collection of nodes");
}

@When("click on Get Started button underTree")
public void click_on_get_started_button_under_tree() {
    driver.findElement(By.xpath("//a[@href='tree']")).click();
}

@Given("User is in Tree page")
public void user_is_in_tree_page() throws InterruptedException   {
	tree.openTreePage();
}

@When("User clicks on Overview of trees Topic button")
public void user_clicks_on_overview_of_trees_topic_button() {
  tree.overviewofTreesTopic();
}

@Then("User should be directed to Overview of trees Topic page With {string}")
public void user_should_be_directed_to_overview_of_trees_topic_page_with(String TryHere) {
	driver.getPageSource().contains("Try here");
}

@Given("User is in Overview of trees Topic page With {string}")
public void user_is_in_overview_of_trees_topic_page_with(String TryHere) throws InterruptedException {
	tree.openTreePage();
	tree.overviewofTreesTopic();
}

@When("User clicks on {string} button")
public void user_clicks_on_button(String TryHere) {
	driver.findElement(By.linkText("Try here>>>")).click();
   
}

@Then("User should be directed to {string} page with run")
public void user_should_be_directed_to_page_with_run(String TextEditor) {
	driver.getPageSource().contains("Run");
}

@Given("User is in {string} page with run")
public void user_is_in_page_with_run(String TextEditor) throws InterruptedException  {
	tree.openTreePage();
	tree.overviewofTreesTopic();
	driver.findElement(By.linkText("Try here>>>")).click();
}

@When("User writes valid code in {string} and clicks on run button")
public void user_writes_valid_code_in_and_clicks_on_run_button(String TextEditor) throws Exception {
	//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea"));
	new Actions(driver).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
  WebElement codeBox= driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea"));
  
		  codeBox.sendKeys("print'hello'");
		  driver.findElement(By.xpath("//button[@type='button']")).click();
		  System.out.println("valid code execute aindi");
		 
}

@Then("User should able to see output in the console")
public void user_should_able_to_see_output_in_the_console() {
    WebElement consolemsg =driver.findElement(By.xpath("//div//pre[@id='output']"));
    String Output= consolemsg.getText();
    //System.out.println(Output);  
    assertEquals("hello",Output );
    /*if (Output=="hello") {
    	System.out.println("It is valid code");
    }
    else {
    	System.out.println("scenario failed");
    }*/
}

@When("User writes invalid code in {string} and clicks on run button")
public void user_writes_invalid_code_in_and_clicks_on_run_button(String TextEditor) {
	//public void clear_texteditor() throws InterruptedException {
		driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea"));
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
	

	WebElement codeBox= driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea"));
	  
	  codeBox.sendKeys("printhello");
	  driver.findElement(By.xpath("//button[@type='button']")).click();
}


@Then("User should able to see an error message in alert window")
public void user_should_able_to_see_an_error_message_in_alert_window() {
	WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(60));
	wait.until(ExpectedConditions.alertIsPresent());
    Alert alert =driver.switchTo().alert();
    System.out.println(alert.getText());
  
    
}

/*@Given("User in a page with alert Window")
public void user_in_a_page_with_alert_window() throws InterruptedException {
	Thread.sleep(1000);
	tree.openTreePage();
	tree.binaryTreesTopic();
	driver.findElement(By.linkText("Try here>>>")).click();
	//driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea"));
	//new Actions(driver).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
	new Actions(driver).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
	WebElement codeBox= driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea"));
	  
	  codeBox.sendKeys("printhello");
	  driver.findElement(By.xpath("//button[@type='button']")).click();
	
	
}*/

@When("User clicks on Ok button")
public void user_clicks_on_ok_button() throws InterruptedException {
	//Thread.sleep(1000);
	
	WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(60));
	wait.until(ExpectedConditions.alertIsPresent());
	Alert alert =driver.switchTo().alert();
	alert.accept();
   
}


@Then("User should be directed to Terminologies Topic page With {string}")
public void user_should_be_directed_to_terminologies_topic_page_with(String TryHere) {
	driver.getPageSource().contains("Try here");
}

@Given("User is in Terminologies Topic page With {string}")
public void user_is_in_terminologies_topic_page_with(String TryHere) throws InterruptedException  {
	tree.openTreePage();
	tree.terminologiesTopic();
}

@Then("User should be on Same page")
public void user_should_be_on_same_page() {
	driver.getTitle().contains("https://dsportalapp.herokuapp.com/tryEditor");
	//driver.getPageSource().contains("printhello");
	    
}



@Then("User should be directed to Types of Trees Topic page With {string}")
public void user_should_be_directed_to_types_of_trees_topic_page_with(String TryHere) {
	driver.getPageSource().contains("Try here");
}

@Given("User is in Types of Trees Topic page With {string}")
public void user_is_in_types_of_trees_topic_page_with(String TryHere) throws InterruptedException   {
    tree.openTreePage();
    tree.typesofTreesTopic();
}


@Then("User should be directed to Tree Traversals Topic page With {string}")
public void user_should_be_directed_to_tree_traversals_topic_page_with(String TryHere) {
	driver.getPageSource().contains("Try here");
}

@Given("User is in Tree Traversals Topic page With {string}")
public void user_is_in_tree_traversals_topic_page_with(String TryHere) throws InterruptedException   {
    tree.openTreePage();
    tree.treeTraversalsTopic();
}



@Then("User should be directed to Traversals-Illustration Topic page With {string}")
public void user_should_be_directed_to_traversals_illustration_topic_page_with(String TryHere) {
	driver.getPageSource().contains("Try here");
}

@Given("User is in Traversals-Illustration Topic page With {string}")
public void user_is_in_traversals_illustration_topic_page_with(String TryHere) throws InterruptedException   {
    tree.openTreePage();
    tree.traversalsIllustrationTopic();
}



@Then("User should be directed to Binary Trees Topic page With {string}")
public void user_should_be_directed_to_binary_trees_topic_page_with(String TryHere) {
	driver.getPageSource().contains("Try here");
}

@Given("User is in Binary Trees Topic page With {string}")
public void user_is_in_binary_trees_topic_page_with(String TryHere) throws InterruptedException   {
    tree.openTreePage();
    tree.binaryTreesTopic();
}



@Then("User should be directed to Types of Binary Trees Topic page With {string}")
public void user_should_be_directed_to_types_of_binary_trees_topic_page_with(String TryHere) {
	driver.getPageSource().contains("Try here");
}

@Given("User is in Types of Binary Trees Topic page With {string}")
public void user_is_in_types_of_binary_trees_topic_page_with(String TryHere) throws InterruptedException   {
   tree.openTreePage();
   tree.binaryTreesTopic();
}



@Then("User should be directed to Implementation in Python Topic page With {string}")
public void user_should_be_directed_to_implementation_in_python_topic_page_with(String TryHere) {
	driver.getPageSource().contains("Try here");
}

@Given("User is in Implementation in Python Topic page With {string}")
public void user_is_in_implementation_in_python_topic_page_with(String string) throws InterruptedException   {
    tree.openTreePage();
    tree.implementationinPythonTopic();
}


@Then("User should be directed to Binary Tree Traversals Topic page With Try Here")
public void user_should_be_directed_to_binary_tree_traversals_topic_page_with_try_here() {
	driver.getPageSource().contains("Try here");
}

@Given("User is in Binary Tree Traversals Topic page With {string}") 
public void user_is_in_binary_tree_traversals_topic_page_with(String TryHere) throws InterruptedException   {
    tree.openTreePage();
    tree.binaryTreeTraversalsTopic();
}



@Then("User should be directed to Implementation of Binary Trees Topic page With {string}")
public void user_should_be_directed_to_implementation_of_binary_trees_topic_page_with(String TryHere) {
	driver.getPageSource().contains("Try here");
}

@Given("User is in Implementation of Binary Trees Topic page With {string}")
public void user_is_in_implementation_of_binary_trees_topic_page_with(String TryHere) throws InterruptedException   {
   tree.openTreePage();
   tree.implementationofBinaryTreesTopic();
}


@Then("User should be directed to Applications of Binary trees Topic page With {string}")
public void user_should_be_directed_to_applications_of_binary_trees_topic_page_with(String TryHere) {
	driver.getPageSource().contains("Try here");
}

@Given("User is in Applications of Binary trees Topic page With {string}")
public void user_is_in_applications_of_binary_trees_topic_page_with(String TryHere) throws InterruptedException   {
    tree.openTreePage();
    tree.applicationsofBinarytreesTopic();
}



@Then("User should be directed to Binary Search Trees Topic page With {string}")
public void user_should_be_directed_to_binary_search_trees_topic_page_with(String TryHere) {
	driver.getPageSource().contains("Try here");
}

@Given("User is in Binary Search Trees Topic page With {string}")
public void user_is_in_binary_search_trees_topic_page_with(String TryHere) throws InterruptedException   {
    tree.openTreePage();
    tree.binarySearchTreesTopic();
}



@Then("User should be directed to Implementation Of BST Topic page With {string}")
public void user_should_be_directed_to_implementation_of_bst_topic_page_with(String TryHere) {
	driver.getPageSource().contains("Try here");
}

@Given("User is in Implementation Of BST Topic page With {string}")
public void user_is_in_implementation_of_bst_topic_page_with(String TryHere) throws InterruptedException   {
   tree.openTreePage();
   tree.implementationOfBSTTopic();
}



@When("User clicks on trees topic {string} button.")
public void user_clicks_on_trees_topic_button(String TreeTopic) throws Exception {
	 tree.clickTopic(TreeTopic);
}

@Then("User should be directed to {string} With Try Here")
public void user_should_be_directed_to_with_try_here(String Title) {
	//driver.getPageSource().contains(Title);
	tree.getPageTitle().contains(Title);
}

@When("User clicks on Try Here button")
public void user_clicks_on_try_here_button() {
	driver.findElement(By.linkText("Try here>>>")).click();
}

@Then("User should be directed to Text Editor page with run")
public void user_should_be_directed_to_text_editor_page_with_run() {
	driver.getPageSource().contains("Run");
}

@Given("User is in Text Editor page with run through {string}")
public void user_is_in_text_editor_page_with_run_through(String TreeTopic) throws Exception {
	tree.openTreePage();
	tree.clickTopic(TreeTopic);
	driver.findElement(By.linkText("Try here>>>")).click();
}
@When("User clicks on trees topic Binary Trees button.")
public void user_clicks_on_trees_topic_binary_trees_button() {
    tree.binaryTreesTopic();
}
@When("User clicks on trees topic Binary Tree Traversals button.")
public void user_clicks_on_trees_topic_binary_tree_traversals_button() {
   tree.binaryTreeTraversalsTopic();
}
@When("User clicks on trees topic Overview of Trees button.")
public void user_clicks_on_trees_topic_overview_of_trees_button() {
   tree.overviewofTreesTopic();
}
@When("User clicks on trees topic Tree Traversals button.")
public void user_clicks_on_trees_topic_tree_traversals_button() {
    tree.treeTraversalsTopic();
}
@When("User clicks on trees topic Types of Binary Trees button.")
public void user_clicks_on_trees_topic_types_of_binary_trees_button() {
   tree.typesofBinaryTreesTopic();
}
@When("User clicks on trees topic Terminologies button.")
public void user_clicks_on_trees_topic_terminologies_button() {
    tree.terminologiesTopic();
}
@When("User clicks on trees topic Applications of Binary trees button.")
public void user_clicks_on_trees_topic_applications_of_binary_trees_button() {
    tree.applicationsofBinarytreesTopic();
}
@When("User clicks on trees topic Traversals-Illustration button.")
public void user_clicks_on_trees_topic_traversals_illustration_button() {
    tree.traversalsIllustrationTopic();
}
@When("User clicks on trees topic Implementation of Binary Trees button.")
public void user_clicks_on_trees_topic_implementation_of_binary_trees_button() {
    tree.implementationofBinaryTreesTopic();
}
@When("User clicks on trees topic Types of Trees button.")
public void user_clicks_on_trees_topic_types_of_trees_button() {
    tree.typesofTreesTopic();
}
@When("User clicks on trees topic Binary Search Trees button.")
public void user_clicks_on_trees_topic_binary_search_trees_button() {
    tree.binarySearchTreesTopic();
}
@When("User clicks on trees topic Implementation in Python button.")
public void user_clicks_on_trees_topic_implementation_in_python_button() {
   tree.implementationinPythonTopic();
}
@When("User clicks on trees topic Implementation Of BST button.")
public void user_clicks_on_trees_topic_implementation_of_bst_button() {
	tree.implementationOfBSTTopic();
    }
@Given("User is in Text Editor page with run through Implementation of Binary Trees")
public void user_is_in_text_editor_page_with_run_through_implementation_of_binary_trees() throws InterruptedException {
    tree.openTreePage();
    tree.implementationofBinaryTreesTopic();
    tree.tryHere();
}
@Given("User is in Text Editor page with run through Overview of Trees")
public void user_is_in_text_editor_page_with_run_through_overview_of_trees() throws InterruptedException {
    tree.openTreePage();
    tree.overviewofTreesTopic();
    tree.tryHere();
}
@Given("User is in Text Editor page with run through Traversals-Illustration")
public void user_is_in_text_editor_page_with_run_through_traversals_illustration() throws InterruptedException {
    tree.openTreePage();
    tree.traversalsIllustrationTopic();
    tree.tryHere();
}
@Given("User is in Text Editor page with run through Types of Trees")
public void user_is_in_text_editor_page_with_run_through_types_of_trees() throws InterruptedException {
    tree.openTreePage();
    tree.typesofTreesTopic();
    tree.tryHere();
}
@Given("User is in Text Editor page with run through Implementation in Python")
public void user_is_in_text_editor_page_with_run_through_implementation_in_python() throws InterruptedException {
    tree.openTreePage();
    tree.implementationinPythonTopic();
    tree.tryHere();
}
@Given("User is in Text Editor page with run through Binary Trees")
public void user_is_in_text_editor_page_with_run_through_binary_trees() throws InterruptedException {
    tree.openTreePage();
    tree.binaryTreesTopic();
    tree.tryHere();
}
@Given("User is in Text Editor page with run through Types of Binary Trees")
public void user_is_in_text_editor_page_with_run_through_types_of_binary_trees() throws InterruptedException {
   tree.openTreePage();
   tree.typesofBinaryTreesTopic();
   tree.tryHere();
}
@Given("User is in Text Editor page with run through Binary Tree Traversals")
public void user_is_in_text_editor_page_with_run_through_binary_tree_traversals() throws InterruptedException {
   tree.openTreePage();
   tree.binaryTreeTraversalsTopic();
   tree.tryHere();
}
@Given("User is in Text Editor page with run through Binary Search Trees")
public void user_is_in_text_editor_page_with_run_through_binary_search_trees() throws InterruptedException {
    tree.openTreePage();
    tree.binarySearchTreesTopic();
    tree.tryHere();
}
@Given("User is in Text Editor page with run through Implementation Of BST")
public void user_is_in_text_editor_page_with_run_through_implementation_of_bst() throws InterruptedException {
    tree.openTreePage();
    tree.implementationOfBSTTopic();
    tree.tryHere();
}
@Given("User is in Text Editor page with run through Tree Traversals")
public void user_is_in_text_editor_page_with_run_through_tree_traversals() throws InterruptedException {
    tree.openTreePage();
    tree.treeTraversalsTopic();
    tree.tryHere();
}
@Given("User is in Text Editor page with run through Applications of Binary trees")
public void user_is_in_text_editor_page_with_run_through_applications_of_binary_trees() throws InterruptedException {
    tree.openTreePage();
    tree.applicationsofBinarytreesTopic();
    tree.tryHere();
}
@Given("User is in Text Editor page with run through Terminologies")
public void user_is_in_text_editor_page_with_run_through_terminologies() throws InterruptedException {
    tree.openTreePage();
    tree.terminologiesTopic();
    tree.tryHere();
}
}

