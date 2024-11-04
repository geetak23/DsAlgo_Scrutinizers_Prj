package stepdefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import POM.SignInPage;
import POM.StackPage;
import WebdriverManager.driverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StackStepDef extends driverFactory  {
	WebDriver driver= driverFactory.getDriver();
	SignInPage Signin=new SignInPage(driver);
	StackPage stack=new StackPage(driver);
	@When("click on the dropdown and select Stack")
	public void click_on_the_dropdown_and_select_stack() {
		WebElement dropDownbtn = driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']")); ////tag_name[text()= ’Text of the element’]
		dropDownbtn.click();

		driver.findElement(By.linkText("Stack")).click();
	}

	@Then("The user should be directed to Stack Page")
	public void the_user_should_be_directed_to_stack_page() {
		driver.getPageSource().contains(" A stack is an Abstract Data Type");
	}

	@When("click on Get Started button under Stack")
	public void click_on_get_started_button_under_stack() {
		driver.findElement(By.xpath("//a[@href='stack']")).click();
	}

	@Given("User is in Stack page")
	public void user_is_in_stack_page() {
		stack.openStackPage();

	}


	@Given("User is in Operations in Stack Topic page With {string}")
	public void user_is_in_operations_in_stack_topic_page_with(String TryHere) {
		stack.openStackPage();
		stack.operationsinStackTopic();
	}

	
	
	@Given("User is in Implementation Topic page With {string}")
	public void user_is_in_implementation_topic_page_with(String TryHere)  {
		stack.openStackPage();
		stack.implementationTopic();

	}


	
	

	

	@Given("User is in Applications Topic page With {string}")
	public void user_is_in_applications_topic_page_with(String TryHere) {
		stack.openStackPage();
		stack.applicationsTopic();
	}

	
	@When("User clicks on Stack topic {string} button.")
	public void user_clicks_on_stack_topic_button(String StackTopic) throws Exception {
		stack.clickTopic(StackTopic);

	}

	@Given("User is in Stack Text Editor page with run through {string}")
	public void user_is_in_stack_text_editor_page_with_run_through(String StackTopic) throws Exception {
		stack.openStackPage();
		stack.clickTopic(StackTopic);
		driver.findElement(By.linkText("Try here>>>")).click();
	}

	@When("User clicks on Stack topic Applications button.")
	public void user_clicks_on_stack_topic_applications_button() {
	   stack.applicationsTopic();
	}
	
	
	    @When("User clicks on Stack topic Implementation button.")
	    public void user_clicks_on_stack_topic_implementation_button() {
	       stack.implementationTopic();
	    }
	
	    @When("User clicks on Stack topic Operations in Stack button.")
	    public void user_clicks_on_stack_topic_operations_in_stack_button() {
	        stack.operationsinStackTopic();
	    }
	    @Given("User is in Stack Text Editor page with run through Implementation")
	    public void user_is_in_stack_text_editor_page_with_run_through_implementation() {
	    	stack.openStackPage();
			stack.implementationTopic();
			driver.findElement(By.linkText("Try here>>>")).click();
	    }
	    @Given("User is in Stack Text Editor page with run through Applications")
	    public void user_is_in_stack_text_editor_page_with_run_through_applications() {
	    	stack.openStackPage();
			stack.applicationsTopic();
			driver.findElement(By.linkText("Try here>>>")).click();
	    }
	    @Given("User is in Stack Text Editor page with run through Operations in Stack")
	    public void user_is_in_stack_text_editor_page_with_run_through_operations_in_stack() {
	    	stack.openStackPage();
			stack.operationsinStackTopic();
			driver.findElement(By.linkText("Try here>>>")).click();
	    }
	    @Then("The user should be  on Stack Page")
	    public void the_user_should_be_on_stack_page() {
	    	driver.getPageSource().contains(" A stack is an Abstract Data Type");
	    }
}
