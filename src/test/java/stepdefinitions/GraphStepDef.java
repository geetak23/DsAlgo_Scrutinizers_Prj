package stepdefinitions;
import org.openqa.selenium.WebDriver;
import POM.GraphPage;
import POM.SignInPage;
import WebdriverManager.driverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GraphStepDef extends driverFactory
{
	WebDriver driver= driverFactory.getDriver();
	
	GraphPage graph = new GraphPage(driver);
	@When("click on the dropdown and select Graph")
	public void click_on_the_dropdown_and_select_graph() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("The user should be directed to Graph Page")
	public void the_user_should_be_directed_to_graph_page() {
		driver.getPageSource().contains(" Graph is a non-linear data structure");
	}
	@When("click on Get Started button under Graph")
	public void click_on_get_started_button_under_graph() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("User is in Graph page")
	public void user_is_in_graph_page() {
		graph.openGraphPage();
	   
	}
	@When("User clicks on Graph Topic button")
	public void user_clicks_on_graph_topic_button() {
	   graph.graphTopic();
	}
	@Then("User should be directed to Graph Topic page With {string}")
	public void user_should_be_directed_to_graph_topic_page_with(String TryHere) {
		driver.getPageSource().contains("Try here");
	}
	@Given("User is in Graph Topic page With {string}")
	public void user_is_in_graph_topic_page_with(String TryHere) {
		graph.openGraphPage();
		graph.graphTopic();
	}
	@When("User clicks on Graph Representations Topic button")
	public void user_clicks_on_graph_representations_topic_button() {
	    graph.graphRepresentation();
	}
	@Then("User should be directed to Graph Representations Topic page With {string}")
	public void user_should_be_directed_to_graph_representations_topic_page_with(String TryHere) {
		driver.getPageSource().contains("Try here");
	}
	@Given("User is in Graph Representations Topic page With {string}")
	public void user_is_in_graph_representations_topic_page_with(String TryHere) {
	   graph.openGraphPage();
	   graph.graphRepresentation();
	}
}