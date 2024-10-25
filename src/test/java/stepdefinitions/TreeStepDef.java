package stepdefinitions;




	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	import POM.SignInPage;
	import POM.TreePage;
	import WebdriverManager.driverFactory;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	
	public class TreeStepDef {
		WebDriver driver = driverFactory.getDriver();
	    SignInPage Signin=new SignInPage(driver);
	    TreePage tree=new TreePage(driver);
	    
	    //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);



	@Given("User has been logged in DSAlgo Portal")
	public void user_is_logged_in_ds_algo_portal() {
		Signin.signinpage("Scrutinizers","Numpysdet176");		
	}

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
	public void user_is_in_tree_page() throws InterruptedException {
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
	public void user_is_in_page_with_run(String TextEditor) throws InterruptedException {
		tree.openTreePage();
		tree.overviewofTreesTopic();
		driver.findElement(By.linkText("Try here>>>")).click();
	}

	@When("User writes valid code in {string} and clicks on run button")
	public void user_writes_valid_code_in_and_clicks_on_run_button(String TextEditor) {
	  WebElement codeBox= driver.findElement(By.xpath("//pre[@class=' CodeMirror-line ']"));
	  
			  codeBox.sendKeys("print");
			  driver.findElement(By.xpath("//button[@type='button']")).click();
	}

	@Then("User should able to see output in the console")
	public void user_should_able_to_see_output_in_the_console() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User writes invalid code in {string} and clicks on run button")
	public void user_writes_invalid_code_in_and_clicks_on_run_button(String string) {
		/*driver.findElement(By.xpath("//pre[@class='CodeMirror-line']")).sendKeys("print(abc)");
		driver.findElement(By.xpath("//button[@type='button']")).click();*/
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
	    tree.terminologiesTopic();
	}

	@Then("User should be directed to Terminologies Topic page With {string}")
	public void user_should_be_directed_to_terminologies_topic_page_with(String TryHere) {
		driver.getPageSource().contains("Try here");
	}

	@Given("User is in Terminologies Topic page With {string}")
	public void user_is_in_terminologies_topic_page_with(String TryHere) throws InterruptedException {
		tree.openTreePage();
		tree.terminologiesTopic();
	}

	@Then("User should be on Same page")
	public void user_should_be_on_same_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Types of Trees Topic button")
	public void user_clicks_on_types_of_trees_topic_button() {
	    tree.typesofTreesTopic();
	}

	@Then("User should be directed to Types of Trees Topic page With {string}")
	public void user_should_be_directed_to_types_of_trees_topic_page_with(String TryHere) {
		driver.getPageSource().contains("Try here");
	}

	@Given("User is in Types of Trees Topic page With {string}")
	public void user_is_in_types_of_trees_topic_page_with(String TryHere) throws InterruptedException {
	    tree.openTreePage();
	    tree.typesofTreesTopic();
	}

	@When("User clicks on Tree Traversals Topic button")
	public void user_clicks_on_tree_traversals_topic_button() {
	    tree.treeTraversalsTopic();
	}

	@Then("User should be directed to Tree Traversals Topic page With {string}")
	public void user_should_be_directed_to_tree_traversals_topic_page_with(String TryHere) {
		driver.getPageSource().contains("Try here");
	}

	@Given("User is in Tree Traversals Topic page With {string}")
	public void user_is_in_tree_traversals_topic_page_with(String TryHere) throws InterruptedException {
	    tree.openTreePage();
	    tree.treeTraversalsTopic();
	}

	@When("User clicks on Traversals-Illustration Topic button")
	public void user_clicks_on_traversals_illustration_topic_button() {
	    tree.traversalsIllustrationTopic();
	}

	@Then("User should be directed to Traversals-Illustration Topic page With {string}")
	public void user_should_be_directed_to_traversals_illustration_topic_page_with(String TryHere) {
		driver.getPageSource().contains("Try here");
	}

	@Given("User is in Traversals-Illustration Topic page With {string}")
	public void user_is_in_traversals_illustration_topic_page_with(String TryHere) throws InterruptedException {
	    tree.openTreePage();
	    tree.traversalsIllustrationTopic();
	}

	@When("User clicks on Binary Trees Topic button")
	public void user_clicks_on_binary_trees_topic_button() {
	    tree.binaryTreesTopic();
	}

	@Then("User should be directed to Binary Trees Topic page With {string}")
	public void user_should_be_directed_to_binary_trees_topic_page_with(String TryHere) {
		driver.getPageSource().contains("Try here");
	}

	@Given("User is in Binary Trees Topic page With {string}")
	public void user_is_in_binary_trees_topic_page_with(String TryHere) throws InterruptedException {
	    tree.openTreePage();
	    tree.binaryTreesTopic();
	}

	@When("User clicks on Types of Binary Trees Topic button")
	public void user_clicks_on_types_of_binary_trees_topic_button() {
	    tree.typesofBinaryTreesTopic();
	}

	@Then("User should be directed to Types of Binary Trees Topic page With {string}")
	public void user_should_be_directed_to_types_of_binary_trees_topic_page_with(String TryHere) {
		driver.getPageSource().contains("Try here");
	}

	@Given("User is in Types of Binary Trees Topic page With {string}")
	public void user_is_in_types_of_binary_trees_topic_page_with(String TryHere) throws InterruptedException {
	   tree.openTreePage();
	   tree.binaryTreesTopic();
	}

	@When("User clicks on Implementation in Python Topic button")
	public void user_clicks_on_implementation_in_python_topic_button() {
	   tree.implementationinPythonTopic();
	}

	@Then("User should be directed to Implementation in Python Topic page With {string}")
	public void user_should_be_directed_to_implementation_in_python_topic_page_with(String TryHere) {
		driver.getPageSource().contains("Try here");
	}

	@Given("User is in Implementation in Python Topic page With {string}")
	public void user_is_in_implementation_in_python_topic_page_with(String string) throws InterruptedException {
	    tree.openTreePage();
	    tree.implementationinPythonTopic();
	}

	@When("User clicks on Binary Tree Traversals Topic button")
	public void user_clicks_on_binary_tree_traversals_topic_button() {
	    tree.binaryTreeTraversalsTopic();
	}

	@Then("User should be directed to Binary Tree Traversals Topic page With Try Here")
	public void user_should_be_directed_to_binary_tree_traversals_topic_page_with_try_here() {
		driver.getPageSource().contains("Try here");
	}

	@Given("User is in Binary Tree Traversals Topic page With {string}") 
	public void user_is_in_binary_tree_traversals_topic_page_with(String TryHere) throws InterruptedException {
	    tree.openTreePage();
	    tree.binaryTreeTraversalsTopic();
	}

	@When("User clicks on Implementation of Binary Trees Topic button")
	public void user_clicks_on_implementation_of_binary_trees_topic_button() {
	   tree.implementationofBinaryTreesTopic();
	}

	@Then("User should be directed to Implementation of Binary Trees Topic page With {string}")
	public void user_should_be_directed_to_implementation_of_binary_trees_topic_page_with(String TryHere) {
		driver.getPageSource().contains("Try here");
	}

	@Given("User is in Implementation of Binary Trees Topic page With {string}")
	public void user_is_in_implementation_of_binary_trees_topic_page_with(String TryHere) throws InterruptedException {
	   tree.openTreePage();
	   tree.implementationofBinaryTreesTopic();
	}

	@When("User clicks on Applications of Binary trees Topic button")
	public void user_clicks_on_applications_of_binary_trees_topic_button() {
	    tree.applicationsofBinarytreesTopic();
	}

	@Then("User should be directed to Applications of Binary trees Topic page With {string}")
	public void user_should_be_directed_to_applications_of_binary_trees_topic_page_with(String TryHere) {
		driver.getPageSource().contains("Try here");
	}

	@Given("User is in Applications of Binary trees Topic page With {string}")
	public void user_is_in_applications_of_binary_trees_topic_page_with(String TryHere) throws InterruptedException {
	    tree.openTreePage();
	    tree.applicationsofBinarytreesTopic();
	}

	@When("User clicks on Binary Search Trees Topic button")
	public void user_clicks_on_binary_search_trees_topic_button() {
	    tree.binarySearchTreesTopic();
	}

	@Then("User should be directed to Binary Search Trees Topic page With {string}")
	public void user_should_be_directed_to_binary_search_trees_topic_page_with(String TryHere) {
		driver.getPageSource().contains("Try here");
	}

	@Given("User is in Binary Search Trees Topic page With {string}")
	public void user_is_in_binary_search_trees_topic_page_with(String TryHere) throws InterruptedException {
	    tree.openTreePage();
	    tree.binarySearchTreesTopic();
	}

	@When("User clicks on Implementation Of BST Topic button")
	public void user_clicks_on_implementation_of_bst_topic_button() {
	   tree.implementationOfBSTTopic();
	}

	@Then("User should be directed to Implementation Of BST Topic page With {string}")
	public void user_should_be_directed_to_implementation_of_bst_topic_page_with(String TryHere) {
		driver.getPageSource().contains("Try here");
	}

	@Given("User is in Implementation Of BST Topic page With {string}")
	public void user_is_in_implementation_of_bst_topic_page_with(String TryHere) throws InterruptedException {
	   tree.openTreePage();
	   tree.implementationOfBSTTopic();
	}

}
