package stepdefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import POM.QueuePage;
import POM.SignInPage;
import POM.StackPage;
import POM.TreePage;
import WebdriverManager.driverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class QueueStepDef extends driverFactory{
	WebDriver driver= driverFactory.getDriver();
	SignInPage Signin=new SignInPage(driver);
	QueuePage queue=new QueuePage(driver);
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

}
