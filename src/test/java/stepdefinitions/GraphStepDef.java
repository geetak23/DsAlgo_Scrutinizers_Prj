package stepdefinitions;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import POM.ArrayPage;
import POM.GraphPage;
import POM.SignInPage;
import POM.TreePage;
import Utilities.LoggerLoad;
import Utilities.Xls_Reader;
import WebdriverManager.driverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphStepDef extends driverFactory {
	WebDriver driver= driverFactory.getDriver();
	SignInPage Signin=new SignInPage(driverFactory.getDriver());
	TreePage tree=new TreePage(driver);
	Xls_Reader reader = new Xls_Reader();
    List<Map<String, String>> testData;
    
    ArrayPage Arraypage= new ArrayPage(driver);
    private  String arrayCodeFile = "src\\test\\resources\\TestData\\Excel_Login_Pythoncode.xlsx";
	private static Logger logger= LogManager .getLogger(GraphStepDef.class);
	/*GraphPage graph=new GraphPage(driver);*/
	
	
	@When("click on the dropdown and select Graph")
	public void click_on_the_dropdown_and_select_graph() {
		
	    //driver.get("https://dsportalapp.herokuapp.com/home");
	    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    WebElement dropDownbtn = driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']")); ////tag_name[text()= ’Text of the element’]
	    dropDownbtn.click();
	    driver.findElement(By.linkText("Graph")).click();
	    /*Select selectDropdown = new Select(dropDownbtn);
	    selectDropdown.selectByIndex(5);*/
	    
	}
	
	
	@Then("The user should be directed to Graph Page")
	public void the_user_should_be_directed_to_graph_page() {
		driver.getPageSource().contains(" Graph is a non-linear data structure");
	}

	@When("click on Get Started button under Graph")
	public void click_on_get_started_button_under_graph() {
	    driver.findElement(By.xpath("//a[@href='graph']")).click(); //xpath("/html/body/div[3]/div[7]/div/div/a")
	    
	}
	//WebDriver driver= driverFactory.getDriver();
	GraphPage graph=new GraphPage(driver);

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
	public void user_is_in_graph_topic_page_with(String TryHere)  {
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
	@Given("User is in {string} page with run through Graph page")
	public void user_is_in_page_with_run_through_graph_page(String TextEditor)  {
	    graph.openGraphPage();
	    graph.graphTopic();
	    driver.findElement(By.linkText("Try here>>>")).click();
	    
	}

	@Given("User is in {string} page with run through Graph Representation page")
	public void user_is_in_page_with_run_through_graph_representation_page(String TextEditor)  {
	   graph.openGraphPage();
	   graph.graphRepresentation();
	   driver.findElement(By.linkText("Try here>>>")).click();   
	}

	
	@When("User writes valid code in Text Editor from {string} and rownumber {int} and clicks on run button")
	public void user_writes_valid_code_in_text_editor_from_and_rownumber_and_clicks_on_run_button(String SheetName, Integer RNum) throws InvalidFormatException, IOException, InterruptedException {
	    
	    Xls_Reader reader = new Xls_Reader();
		List<Map<String,String>> testData = reader.getData(arrayCodeFile, SheetName);
		Thread.sleep(2000);
		String testcode = testData.get(RNum).get("pythonCode");	
		System.out.println(testcode);
		Arraypage.texteditorData(testcode);
	}
	
	@When("User writes invalid code in Text Editor from {string} and rownumber {int} and clicks on run button")
	public void user_writes_invalid_code_in_text_editor_from_and_rownumber_and_clicks_on_run_button(String SheetName, Integer RNum) throws InterruptedException, InvalidFormatException, IOException {
		Xls_Reader reader = new Xls_Reader();
		List<Map<String,String>> testData = reader.getData(arrayCodeFile, SheetName);
		Thread.sleep(2000);
		String testcode = testData.get(RNum).get("pythonCode");	
		System.out.println(testcode);
		Arraypage.texteditorData(testcode);
	}

	
			  
	@When("User writes code in Text Editor from sheetname {string} and rownumber {int} and clicks on run button")
	public void user_writes_code_in_text_editor_from_sheetname_and_rownumber_and_clicks_on_run_button(String SheetName, Integer RNum) throws InvalidFormatException, IOException, InterruptedException {
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
		//logger.trace("passed");
		LoggerLoad.info("Valid and Invalid code are validated");
	}
	@Then("The user should be on Graph Page")
	public void the_user_should_be_on_graph_page() {
		driver.getPageSource().contains(" Graph is a non-linear data structure"); 
	}


}
