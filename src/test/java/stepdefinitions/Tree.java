package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import POM.SignInPage;
import WebdriverManager.Webdrivermanager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tree {
	WebDriver driver = Webdrivermanager.getDriver();
    SignInPage Signin=new SignInPage();
	



@Given("User is logged in DSAlgo Portal")
public void user_is_logged_in_ds_algo_portal() {
	System.out.print("Landed on Main page");
	
}

@When("click on the dropdown and select Tree")
public void click_on_the_dropdown_and_select_tree() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user should be directed to Tree Page")
public void the_user_should_be_directed_to_tree_page() {
    driver.getPageSource().contains(" A tree is a collection of nodes");
}

@When("click on Get Started button underTree")
public void click_on_get_started_button_under_tree() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("User is in Tree page")
public void user_is_in_tree_page() {
	driver.getPageSource().contains(" A tree is a collection of nodes");
}

@When("User clicks on Overview of trees Topic button")
public void user_clicks_on_overview_of_trees_topic_button() {
   driver.findElement(By.linkText("Overview of Trees")).click();
}

@Then("User should be directed to Overview of trees Topic page With {string}")
public void user_should_be_directed_to_overview_of_trees_topic_page_with(String TryHere) {
	driver.getPageSource().contains("Try here");
}

@Given("User is in Overview of trees Topic page With {string}")
public void user_is_in_overview_of_trees_topic_page_with(String TryHere) {
	driver.getPageSource().contains("Try here");
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
public void user_is_in_page_with_run(String TextEditor) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User writes valid code in {string} and clicks on run button")
public void user_writes_valid_code_in_and_clicks_on_run_button(String TextEditor) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should able to see output in the console")
public void user_should_able_to_see_output_in_the_console() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User writes invalid code in {string} and clicks on run button")
public void user_writes_invalid_code_in_and_clicks_on_run_button(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should able to see an error message in alert window")
public void user_should_able_to_see_an_error_message_in_alert_window() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("User in a page with alert Window")
public void user_in_a_page_with_alert_window() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User clicks on Ok button")
public void user_clicks_on_ok_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User clicks on Terminologies Topic button")
public void user_clicks_on_terminologies_topic_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should be directed to Terminologies Topic page With {string}")
public void user_should_be_directed_to_terminologies_topic_page_with(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("User is in Terminologies Topic page With {string}")
public void user_is_in_terminologies_topic_page_with(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should be on Same page")
public void user_should_be_on_same_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User clicks on Types of Trees Topic button")
public void user_clicks_on_types_of_trees_topic_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should be directed to Types of Trees Topic page With {string}")
public void user_should_be_directed_to_types_of_trees_topic_page_with(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("User is in Types of Trees Topic page With {string}")
public void user_is_in_types_of_trees_topic_page_with(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User clicks on Tree Traversals Topic button")
public void user_clicks_on_tree_traversals_topic_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should be directed to Tree Traversals Topic page With {string}")
public void user_should_be_directed_to_tree_traversals_topic_page_with(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("User is in Tree Traversals Topic page With {string}")
public void user_is_in_tree_traversals_topic_page_with(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User clicks on Traversals-Illustration Topic button")
public void user_clicks_on_traversals_illustration_topic_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should be directed to Traversals-Illustration Topic page With {string}")
public void user_should_be_directed_to_traversals_illustration_topic_page_with(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("User is in Traversals-Illustration Topic page With {string}")
public void user_is_in_traversals_illustration_topic_page_with(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User clicks on Binary Trees Topic button")
public void user_clicks_on_binary_trees_topic_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should be directed to Binary Trees Topic page With {string}")
public void user_should_be_directed_to_binary_trees_topic_page_with(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("User is in Binary Trees Topic page With {string}")
public void user_is_in_binary_trees_topic_page_with(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User clicks on Types of Binary Trees Topic button")
public void user_clicks_on_types_of_binary_trees_topic_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should be directed to Types of Binary Trees Topic page With {string}")
public void user_should_be_directed_to_types_of_binary_trees_topic_page_with(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("User is in Types of Binary Trees Topic page With {string}")
public void user_is_in_types_of_binary_trees_topic_page_with(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User clicks on Implementation in Python Topic button")
public void user_clicks_on_implementation_in_python_topic_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should be directed to Implementation in Python Topic page With {string}")
public void user_should_be_directed_to_implementation_in_python_topic_page_with(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("User is in Implementation in Python Topic page With {string}")
public void user_is_in_implementation_in_python_topic_page_with(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User clicks on Binary Tree Traversals Topic button")
public void user_clicks_on_binary_tree_traversals_topic_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should be directed to Binary Tree Traversals Topic page With Try Here")
public void user_should_be_directed_to_binary_tree_traversals_topic_page_with_try_here() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("User is in Binary Tree Traversals Topic page With {string}")
public void user_is_in_binary_tree_traversals_topic_page_with(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User clicks on Implementation of Binary Trees Topic button")
public void user_clicks_on_implementation_of_binary_trees_topic_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should be directed to Implementation of Binary Trees Topic page With {string}")
public void user_should_be_directed_to_implementation_of_binary_trees_topic_page_with(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("User is in Implementation of Binary Trees Topic page With {string}")
public void user_is_in_implementation_of_binary_trees_topic_page_with(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User clicks on Applications of Binary trees Topic button")
public void user_clicks_on_applications_of_binary_trees_topic_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should be directed to Applications of Binary trees Topic page With {string}")
public void user_should_be_directed_to_applications_of_binary_trees_topic_page_with(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("User is in Applications of Binary trees Topic page With {string}")
public void user_is_in_applications_of_binary_trees_topic_page_with(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User clicks on Binary Search Trees Topic button")
public void user_clicks_on_binary_search_trees_topic_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should be directed to Binary Search Trees Topic page With {string}")
public void user_should_be_directed_to_binary_search_trees_topic_page_with(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("User is in Binary Search Trees Topic page With {string}")
public void user_is_in_binary_search_trees_topic_page_with(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User clicks on Implementation Of BST Topic button")
public void user_clicks_on_implementation_of_bst_topic_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should be directed to Implementation Of BST Topic page With {string}")
public void user_should_be_directed_to_implementation_of_bst_topic_page_with(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("User is in Implementation Of BST Topic page With {string}")
public void user_is_in_implementation_of_bst_topic_page_with(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}






}
























//package stepdefinitions;
//
//import org.openqa.selenium.WebDriver;
//
//import WebdriverManager.Webdrivermanager;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//private WebDriver driver = Webdrivermanager.getDriver();
//public class Tree {
//	@Given("User has already Logged in DSAlgo portal")
//	public void user_has_already_logged_in_ds_algo_portal() {
//	  
//	}
//
//	@Given("User is logged in DSAlgo Portal")
//	public void user_is_logged_in_ds_algo_portal() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("click on the dropdown and select Tree")
//	public void click_on_the_dropdown_and_select_tree() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The user should be directed to {string} Page")
//	public void the_user_should_be_directed_to_page(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("click on Get Started button underTree")
//	public void click_on_get_started_button_under_tree() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("User is in {string} page")
//	public void user_is_in_page(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User clicks on Overview of trees {string} button")
//	public void user_clicks_on_overview_of_trees_button(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should be directed to Overview of trees {string} page With {string}")
//	public void user_should_be_directed_to_overview_of_trees_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("User is in Overview of trees {string} page With {string}")
//	public void user_is_in_overview_of_trees_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User clicks on {string} button")
//	public void user_clicks_on_button(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should be directed to {string} page with run")
//	public void user_should_be_directed_to_page_with_run(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("User is in {string} page with run")
//	public void user_is_in_page_with_run(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User writes valid code in {string} and clicks on run button")
//	public void user_writes_valid_code_in_and_clicks_on_run_button(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should able to see output in the console")
//	public void user_should_able_to_see_output_in_the_console() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User writes invalid code in {string} and clicks on run button")
//	public void user_writes_invalid_code_in_and_clicks_on_run_button(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should able to see an error message in alert window")
//	public void user_should_able_to_see_an_error_message_in_alert_window() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("User in a page with alert Window")
//	public void user_in_a_page_with_alert_window() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User clicks on Ok button")
//	public void user_clicks_on_ok_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User clicks on Terminologies {string} button")
//	public void user_clicks_on_terminologies_button(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should be directed to Terminologies {string} page With {string}")
//	public void user_should_be_directed_to_terminologies_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("User is in Terminologies {string} page With {string}")
//	public void user_is_in_terminologies_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should be on Same page")
//	public void user_should_be_on_same_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User clicks on Types of Trees {string} button")
//	public void user_clicks_on_types_of_trees_button(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should be directed to Types of Trees {string} page With {string}")
//	public void user_should_be_directed_to_types_of_trees_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("User is in Types of Trees {string} page With {string}")
//	public void user_is_in_types_of_trees_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User clicks on Tree Traversals {string} button")
//	public void user_clicks_on_tree_traversals_button(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should be directed to Tree Traversals {string} page With {string}")
//	public void user_should_be_directed_to_tree_traversals_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("User is in Tree Traversals {string} page With {string}")
//	public void user_is_in_tree_traversals_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User clicks on Traversals-Illustration {string} button")
//	public void user_clicks_on_traversals_illustration_button(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should be directed to Traversals-Illustration {string} page With {string}")
//	public void user_should_be_directed_to_traversals_illustration_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("User is in Traversals-Illustration {string} page With {string}")
//	public void user_is_in_traversals_illustration_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User clicks on Binary Trees {string} button")
//	public void user_clicks_on_binary_trees_button(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should be directed to Binary Trees {string} page With {string}")
//	public void user_should_be_directed_to_binary_trees_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("User is in Binary Trees {string} page With {string}")
//	public void user_is_in_binary_trees_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User clicks on Types of Binary Trees {string} button")
//	public void user_clicks_on_types_of_binary_trees_button(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should be directed to Types of Binary Trees {string} page With {string}")
//	public void user_should_be_directed_to_types_of_binary_trees_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("User is in Types of Binary Trees {string} page With {string}")
//	public void user_is_in_types_of_binary_trees_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User clicks on Implementation in Python {string} button")
//	public void user_clicks_on_implementation_in_python_button(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should be directed to Implementation in Python {string} page With {string}")
//	public void user_should_be_directed_to_implementation_in_python_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("User is in Implementation in Python {string} page With {string}")
//	public void user_is_in_implementation_in_python_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User clicks on Binary Tree Traversals {string} button")
//	public void user_clicks_on_binary_tree_traversals_button(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should be directed to Binary Tree Traversals {string} page With {string}")
//	public void user_should_be_directed_to_binary_tree_traversals_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("User is in Binary Tree Traversals {string} page With {string}")
//	public void user_is_in_binary_tree_traversals_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User clicks on Implementation of Binary Trees {string} button")
//	public void user_clicks_on_implementation_of_binary_trees_button(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should be directed to Implementation of Binary Trees {string} page With {string}")
//	public void user_should_be_directed_to_implementation_of_binary_trees_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("User is in Implementation of Binary Trees {string} page With {string}")
//	public void user_is_in_implementation_of_binary_trees_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User clicks on Applications of Binary trees {string} button")
//	public void user_clicks_on_applications_of_binary_trees_button(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should be directed to Applications of Binary trees {string} page With {string}")
//	public void user_should_be_directed_to_applications_of_binary_trees_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("User is in Applications of Binary trees {string} page With {string}")
//	public void user_is_in_applications_of_binary_trees_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User clicks on Binary Search Trees {string} button")
//	public void user_clicks_on_binary_search_trees_button(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should be directed to Binary Search Trees {string} page With {string}")
//	public void user_should_be_directed_to_binary_search_trees_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("User is in Binary Search Trees {string} page With {string}")
//	public void user_is_in_binary_search_trees_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User clicks on Implementation Of BST {string} button")
//	public void user_clicks_on_implementation_of_bst_button(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should be directed to Implementation Of BST {string} page With {string}")
//	public void user_should_be_directed_to_implementation_of_bst_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("User is in Implementation Of BST {string} page With {string}")
//	public void user_is_in_implementation_of_bst_page_with(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	    }
//}
