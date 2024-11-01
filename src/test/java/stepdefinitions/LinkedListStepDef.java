package stepdefinitions;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import POM.ArrayPage;
import POM.GraphPage;
import POM.LinkedListPage;
import POM.SignInPage;
import POM.TreePage;
import Utilities.Xls_Reader;
import WebdriverManager.driverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LinkedListStepDef extends driverFactory {
	WebDriver driver = driverFactory.getDriver();
    SignInPage Signin=new SignInPage(driver);
    LinkedListPage linkedlist=new LinkedListPage(driver);
    Xls_Reader reader = new Xls_Reader();
    List<Map<String, String>> credentials;
    ArrayPage Arraypage= new ArrayPage(driver);
    GraphPage graphPage=new GraphPage(driver);
    private  String arrayCodeFile = "src\\test\\resources\\TestData\\Excel_Login_Pythoncode.xlsx";
    
    @Given("User has already Logged into portal")
    public void user_has_already_logged_into_portal() throws InvalidFormatException, IOException {
    	List<Map<String,String>> credentials = reader.getData(arrayCodeFile, "Valid LogIn");
		
		String username = credentials.get(0).get("username");
		String password = credentials.get(0).get("password");
		
		graphPage.signIn(username, password);
		
		
		//System.out.println("/n read method "+username +" and "+password);
		
		//driverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		
		
		//Arraypage = new ArrayPage(driver);	
        
    }
	@When("click on the dropdown and select Linked List")
	public void click_on_the_dropdown_and_select_linked_list() {
		driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']")).click();
		   driver.findElement(By.linkText("Linked List")).click();
	}

	@Then("The user should be directed to Linked List Page")
	public void the_user_should_be_directed_to_linked_list_page() {
		 driver.getPageSource().contains("A linked list is a linear collection of data elements ");
	}

	@When("click on Get Started button under Linked List")
	public void click_on_get_started_button_under_linked_list() {
		driver.findElement(By.xpath("//a[@href='linked-list']")).click();
	}

	@Given("User is in Linked List page")
	public void user_is_in_linked_list_page()  {
	    linkedlist.openLinkedListPage();
	}

	@When("User clicks on Introduction Topic button")
	public void user_clicks_on_introduction_topic_button() {
	   linkedlist.introductionTopic();
	}

	@Then("User should be directed to Introduction Topic page With {string}")
	public void user_should_be_directed_to_introduction_topic_page_with(String TryHere) {
		driver.getPageSource().contains("Try here");
	}

	@Given("User is in Introduction Topic page With {string}")
	public void user_is_in_introduction_topic_page_with(String TryHere)  {
	    linkedlist.openLinkedListPage();
	    linkedlist.introductionTopic();
	}

	@Given("User is in {string} page with run through Introduction page")
	public void user_is_in_page_with_run_through_introduction_page(String TextEditor)  {
		 linkedlist.openLinkedListPage();
		    linkedlist.introductionTopic();
		    driver.findElement(By.linkText("Try here>>>")).click();
	}

	@Then("User should be directed to Creating Linked LIst Topic page With {string}")
	public void user_should_be_directed_to_creating_linked_l_ist_topic_page_with(String TryHere) {
		driver.getPageSource().contains("Try here");
	}

	@Given("User is in Creating Linked LIst Topic page With {string}")
	public void user_is_in_creating_linked_l_ist_topic_page_with(String TryHere) {
	   linkedlist.openLinkedListPage();
	   linkedlist.creatingLinkedLIstTopic();
	}

	@Given("User is in {string} page with run through Creating Linked LIst page")
	public void user_is_in_page_with_run_through_creating_linked_l_ist_page(String TextEditor) {
		linkedlist.openLinkedListPage();
		   linkedlist.creatingLinkedLIstTopic();
		   driver.findElement(By.linkText("Try here>>>")).click();
	}

	@When("User clicks on Types of Linked List Topic button")
	public void user_clicks_on_types_of_linked_list_topic_button() {
	    linkedlist.typesofLinkedListTopic();
	}

	@Then("User should be directed to Types of Linked List Topic page With {string}")
	public void user_should_be_directed_to_types_of_linked_list_topic_page_with(String TryHere) {
		driver.getPageSource().contains("Try here");
	}

	@Given("User is in Types of Linked List Topic page With {string}")
	public void user_is_in_types_of_linked_list_topic_page_with(String TryHere) {
	   linkedlist.openLinkedListPage();
	   linkedlist.typesofLinkedListTopic();
	}

	@Given("User is in {string} page with run through Types of Linked List page")
	public void user_is_in_page_with_run_through_types_of_linked_list_page(String string) {
		linkedlist.openLinkedListPage();
		   linkedlist.typesofLinkedListTopic();
		   driver.findElement(By.linkText("Try here>>>")).click();
	}

	@When("User clicks on Implement Linked List in Python Topic button")
	public void user_clicks_on_implement_linked_list_in_python_topic_button() {
	    linkedlist.implementLinkedListinPythonTopic();
	}

	@Then("User should be directed to Implement Linked List in Python Topic page With {string}")
	public void user_should_be_directed_to_implement_linked_list_in_python_topic_page_with(String TryHere) {
		driver.getPageSource().contains("Try here");
	}

	@Given("User is in Implement Linked List in Python Topic page With {string}")
	public void user_is_in_implement_linked_list_in_python_topic_page_with(String TryHere) {
	    linkedlist.openLinkedListPage();
	    linkedlist.implementLinkedListinPythonTopic();
	}

	@Given("User is in {string} page with run through Implement Linked List in Python page")
	public void user_is_in_page_with_run_through_implement_linked_list_in_python_page(String TextEditor) {
		linkedlist.openLinkedListPage();
	    linkedlist.implementLinkedListinPythonTopic();
	    driver.findElement(By.linkText("Try here>>>")).click();
	}

	@When("User clicks on Traversal Topic button")
	public void user_clicks_on_traversal_topic_button() {
	    linkedlist.traversalTopic();
	}

	@Then("User should be directed to Traversal Topic page With {string}")
	public void user_should_be_directed_to_traversal_topic_page_with(String TryHere) {
		driver.getPageSource().contains("Try here");
	}

	@Given("User is in Traversal Topic page With {string}")
	public void user_is_in_traversal_topic_page_with(String TryHere) {
	    linkedlist.openLinkedListPage();
	    linkedlist.traversalTopic();
	}

	@Given("User is in {string} page with run through Traversal page")
	public void user_is_in_page_with_run_through_traversal_page(String TextEditor) {
		linkedlist.openLinkedListPage();
	    linkedlist.traversalTopic();
	    driver.findElement(By.linkText("Try here>>>")).click();
	    
	}

	@When("User clicks on Insertion Topic button")
	public void user_clicks_on_insertion_topic_button() {
	    linkedlist.insertionTopic();
	}

	@Then("User should be directed to Insertion Topic page With {string}")
	public void user_should_be_directed_to_insertion_topic_page_with(String TryHere) {
	    driver.getPageSource().contains("Try here");
	}

	@Given("User is in Insertion Topic page With {string}")
	public void user_is_in_insertion_topic_page_with(String TryHere) {
	    linkedlist.openLinkedListPage();
	    linkedlist.insertionTopic();
	}

	@Given("User is in {string} page with run through Insertion page")
	public void user_is_in_page_with_run_through_insertion_page(String TextEditor) {
		linkedlist.openLinkedListPage();
	    linkedlist.insertionTopic();
	    driver.findElement(By.linkText("Try here>>>")).click();
	}

	@When("User clicks on Deletion Topic button")
	public void user_clicks_on_deletion_topic_button() {
	    linkedlist.deletionTopic();
	}

	@Then("User should be directed to Deletion Topic page With {string}")
	public void user_should_be_directed_to_deletion_topic_page_with(String TryHere) {
		driver.getPageSource().contains("Try here");
	}

	@Given("User is in Deletion Topic page With {string}")
	public void user_is_in_deletion_topic_page_with(String TryHere) {
	   linkedlist.openLinkedListPage();
	   linkedlist.deletionTopic();
	}

	@Given("User is in {string} page with run through Deletion page")
	public void user_is_in_page_with_run_through_deletion_page(String string) {
		linkedlist.openLinkedListPage();
		   linkedlist.deletionTopic();
		driver.findElement(By.linkText("Try here>>>")).click();
	}
	@When("User clicks on Creating Linked LIst Topic button")
	public void user_clicks_on_creating_linked_l_ist_topic_button() {
	   linkedlist.creatingLinkedLIstTopic();
	}


}
