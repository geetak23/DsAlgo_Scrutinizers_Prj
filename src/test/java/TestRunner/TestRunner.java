
	package TestRunner;

	 
	//import org.junit.runner.RunWith;
 

	import Utilities.*;
	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;
	//import io.cucumber.junit.Cucumber;
		
	//@RunWith(Cucumber.class) //Junit execution

		@CucumberOptions(
		    features = "src/test/resources/feature",            // Path to your Gherkin feature files
		    tags = "@TreePage", 					//tags from feature file
		    glue = {"stepdefinitions","src/test/java/Hooks/DsalgoHooks"},           // Path to the step definition files and Hooks
		    		//glue = {"stepdefinitions"},           // Path to the step definition files and Hooks
		    plugin = { 
		        "pretty",                                       // Pretty output in the console
		        "html:target/dsalgoproject.html",   // HTML report
		        //"json:target/cucumber-reports/cucumber.json"    // JSON report for additional reporting (like cucumber-reporting plugin)
		    },
		    monochrome = true                                  //console output color/ Cleaner output in the console
		)
	public class TestRunner extends AbstractTestNGCucumberTests{
//			  // Method to capture browser parameter from testng.xml
//		    @BeforeTest
//		    @Parameters("browser")
//		    public void setup(@Optional("chrome") String browser) {
//		      // Load configuration
//		      ConfigReader.initProperties();
//
//		      // Override browser in ConfigReader if passed from testng.xml or command line
//		       ConfigReader.setBrowser(browser);
//		    }
//			
//			@Override
//		    @DataProvider(parallel = true)
//		    public Object[][] scenarios() {
//						
//				return super.scenarios();
//		    }
	}
