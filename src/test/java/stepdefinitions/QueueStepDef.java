package stepdefinitions;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import POM.ArrayPage;
import POM.QueuePage;
import POM.SignInPage;
import POM.StackPage;
import POM.TreePage;
import Utilities.Xls_Reader;
import WebdriverManager.driverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class QueueStepDef extends driverFactory{
	WebDriver driver= driverFactory.getDriver();
	SignInPage Signin=new SignInPage(driver);
	QueuePage queue=new QueuePage(driver);
	 ArrayPage Arraypage= new ArrayPage(driver);
	 Xls_Reader reader = new Xls_Reader();
	    List<Map<String, String>> testData;
	    private  String arrayCodeFile = "src\\test\\resources\\TestData\\Excel_Login_Pythoncode.xlsx";
	//TreePage tree=new TreePage(driverFactory.getDriver());
	
	@When("click on the dropdown and select Queue")
	public void click_on_the_dropdown_and_select_queue() {
		WebElement dropDownbtn = driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']")); ////tag_name[text()= ’Text of the element’]
	    dropDownbtn.click();
	   
	    driver.findElement(By.linkText("Queue")).click();
	}

	@Then("The user should be directed to Queue Page")
	public void the_user_should_be_directed_to_queue_page() {
		driver.getPageSource().contains(" Queue is very similar to stacks");
	}

	@When("click on Get Started button under Queue")
	public void click_on_get_started_button_under_queue() {
		driver.findElement(By.xpath("//a[@href='queue']")).click();
	}

	@Given("User is in Queue page")
	public void user_is_in_queue_page()  {
	    queue.openQueuePage();
	}

	@When("User clicks on Implementation of Queue in Python Topic button")
	public void user_clicks_on_implementation_of_queue_in_python_topic_button() {
		
	    queue.implementationofQueueinPythonTopic();
	}

	@Then("User should be directed to Implementation of Queue in Python Topic page With {string}")
	public void user_should_be_directed_to_implementation_of_queue_in_python_topic_page_with(String TryHere) {
		driver.getPageSource().contains(" Try here>>>");
	}

	@Given("User is in Implementation of Queue in Python Topic page With {string}")
	public void user_is_in_implementation_of_queue_in_python_topic_page_with(String TryHere)  {
	   queue.openQueuePage();
	   queue.implementationofQueueinPythonTopic();
	}

	@Given("User is in {string} page with run through Implementation of Queue in Python page")
	public void user_is_in_page_with_run_through_implementation_of_queue_in_python_page(String TextEditor) {
		   queue.openQueuePage();
		   queue.implementationofQueueinPythonTopic();
		   driver.findElement(By.linkText("Try here>>>")).click();
	}

	@When("User clicks on Implementation using collections deque Topic button")
	public void user_clicks_on_implementation_using_collections_deque_topic_button() {
	   queue.implementationusingcollectionsdequeTopic();
	}

	@Then("User should be directed to Implementation using collections deque Topic page With {string}")
	public void user_should_be_directed_to_implementation_using_collections_deque_topic_page_with(String TryHere) {
		driver.getPageSource().contains(" Try here>>>");
	}

	@Given("User is in Implementation using collections deque Topic page With {string}")
	public void user_is_in_implementation_using_collections_deque_topic_page_with(String TryHere)  {
	    queue.openQueuePage();
	    queue.implementationusingcollectionsdequeTopic();
	}

	@Given("User is in {string} page with run through Implementation using collections deque page")
	public void user_is_in_page_with_run_through_implementation_using_collections_deque_page(String TextEditor)   {
		queue.openQueuePage();
	    queue.implementationusingcollectionsdequeTopic();
	    driver.findElement(By.linkText("Try here>>>")).click();
	}

	@When("User clicks on Implementation using array Topic button")
	public void user_clicks_on_implementation_using_array_topic_button() {
	    queue.implementationusingarrayTopic();
	}

	@Then("User should be directed to Implementation using array Topic page With {string}")
	public void user_should_be_directed_to_implementation_using_array_topic_page_with(String TryHere) {
		driver.getPageSource().contains(" Try here>>>");
	}

	@Given("User is in Implementation using array Topic page With {string}")
	public void user_is_in_implementation_using_array_topic_page_with(String TryHere)   {
	   queue.openQueuePage();
	   queue.implementationusingarrayTopic();
	}

	@Given("User is in {string} page with run through Implementation using array page")
	public void user_is_in_page_with_run_through_implementation_using_array_page(String TextEditor)   {
		   queue.openQueuePage();
		   queue.implementationusingarrayTopic();
		   driver.findElement(By.linkText("Try here>>>")).click();
	}

	@When("User clicks on Queue Operations Topic button")
	public void user_clicks_on_queue_operations_topic_button() {
	   queue.queueOperationsTopic();
	}

	@Then("User should be directed to Queue Operations Topic page With {string}")
	public void user_should_be_directed_to_queue_operations_topic_page_with(String TryHere) {
		driver.getPageSource().contains(" Try here>>>");
	}

	@Given("User is in Queue Operations Topic page With {string}")
	public void user_is_in_queue_operations_topic_page_with(String TryHere)   {
	   queue.openQueuePage();
	   queue.queueOperationsTopic();
	}

	@Given("User is in {string} page with run through Queue Operations page")
	public void user_is_in_page_with_run_through_queue_operations_page(String TextEditor)   {
	    queue.openQueuePage();
	    queue.queueOperationsTopic();
	    driver.findElement(By.linkText("Try here>>>")).click();
	}
	@When("User clicks on Queue topic {string} button.")
	public void user_clicks_on_queue_topic_button(String QueueTopic) throws Exception {
		queue.clickTopic(QueueTopic);
	}
	@Given("User is in  Queue Text Editor page with run through {string}")
	public void user_is_in_queue_text_editor_page_with_run_through(String QueueTopic) throws Exception {
		
		queue.openQueuePage();
	 queue.clickTopic(QueueTopic);
		driver.findElement(By.linkText("Try here>>>")).click();
	}
	@When("User clicks on run button without entering code")
	public void user_clicks_on_run_button_without_entering_code() {
		Arraypage.runbtn();
	}
	@Given("User is in  Queue Text Editor page with run through Queue Operations")
	public void user_is_in_queue_text_editor_page_with_run_through_queue_operations() {
	    queue.openQueuePage();
	    queue.queueOperationsTopic();
	    queue.tryHere();
	    
	}
	@Given("User is in  Queue Text Editor page with run through Implementation using array")
	public void user_is_in_queue_text_editor_page_with_run_through_implementation_using_array() {
		queue.openQueuePage();
	    queue.implementationusingarrayTopic();
	    queue.tryHere();
	    //driver.findElement(By.linkText("Try here>>>")).click();
	}
	@Given("User is in  Queue Text Editor page with run through Implementation of Queue in Python")
	public void user_is_in_queue_text_editor_page_with_run_through_implementation_of_queue_in_python() {
	   queue.openQueuePage();
	   queue.implementationofQueueinPythonTopic();
	   queue.tryHere();
	}
	@Given("User is in  Queue Text Editor page with run through Implementation using collections deque")
	public void user_is_in_queue_text_editor_page_with_run_through_implementation_using_collections_deque() {
	    queue.openQueuePage();
	    queue.implementationusingcollectionsdequeTopic();
	    queue.tryHere();
	}
	@When("User writes code in Text Editor from sheetname {string} and rownumber {int} and clicks on run button in Queue")
	public void user_writes_code_in_text_editor_from_sheetname_and_rownumber_and_clicks_on_run_button_in_queue(String SheetName, Integer RNum) throws InvalidFormatException, IOException, InterruptedException {
		Xls_Reader reader = new Xls_Reader();
		List<Map<String,String>> testData = reader.getData(arrayCodeFile, SheetName);
		Thread.sleep(2000);
		String testcode = testData.get(RNum).get("pythonCode");	
		System.out.println(testcode);
		System.out.println(RNum);
		Thread.sleep(2000);
		new Actions(driver).sendKeys(Keys.BACK_SPACE).perform();
		
		Arraypage.texteditorData(testcode);
		Arraypage.runbtn();
	}
	@When("User clicks on Queue topic Implementation using collections deque button.")
	public void user_clicks_on_queue_topic_implementation_using_collections_deque_button() {
	   queue.implementationusingcollectionsdequeTopic();
	}
	@Then("User should be directed to Implementation using collections deque With Try Here")
	public void user_should_be_directed_to_implementation_using_collections_deque_with_try_here() {
	   driver.getPageSource().contains("Implementation using collections");
	   driver.getPageSource().contains("Try here>>>");
	}
	@When("User clicks on Queue topic Implementation of Queue in Python button.")
	public void user_clicks_on_queue_topic_implementation_of_queue_in_python_button() {
	   queue.implementationofQueueinPythonTopic();
	}
	@Then("User should be directed to Implementation of Queue in Python With Try Here")
	public void user_should_be_directed_to_implementation_of_queue_in_python_with_try_here() {
	    driver.getPageSource().contains("Implementation of Queue in Python");
	    driver.getPageSource().contains("Try here>>>");
	}
	@When("User clicks on Queue topic Implementation using array button.")
	public void user_clicks_on_queue_topic_implementation_using_array_button() {
	   queue.implementationusingarrayTopic();
	}
	@Then("User should be directed to Implementation using array With Try Here")
	public void user_should_be_directed_to_implementation_using_array_with_try_here() {
		driver.getPageSource().contains("Implementation using array");
	    driver.getPageSource().contains("Try here>>>");
	}
	@When("User clicks on Queue topic Queue Operations button.")
	public void user_clicks_on_queue_topic_queue_operations_button() {
	    queue.queueOperationsTopic();
	}
	@Then("User should be directed to Queue Operations With Try Here")
	public void user_should_be_directed_to_queue_operations_with_try_here() {
		driver.getPageSource().contains("Implementation using array");
	    driver.getPageSource().contains("Try here>>>");
	}
	@Then("The user should be on Queue Page")
	public void the_user_should_be_on_queue_page() {
		driver.getPageSource().contains(" Queue is very similar to stacks");
	}
}
