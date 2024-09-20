package TestRunner;

//import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.junit.Cucumber;
	
//@RunWith(Cucumber.class) //Junit execution

	@CucumberOptions(
	    features = "src/test/resources/feature",            // Path to your Gherkin feature files
	    tags = "@LandingPage,@DashBoardPage", 					//tags from feature file
	    glue = {"stepdefinitions"},           // Path to the step definition files
	    plugin = { 
	        "pretty",                                       // Pretty output in the console
	        "html:target/cucumber-reports/cucumber.html",   // HTML report
	        //"json:target/cucumber-reports/cucumber.json"    // JSON report for additional reporting (like cucumber-reporting plugin)
	    },
	    monochrome = false                                  //console output color/ Cleaner output in the console
	)
public class TestRunner extends AbstractTestNGCucumberTests{
		
		@Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
					
			return super.scenarios();
	    }
}

