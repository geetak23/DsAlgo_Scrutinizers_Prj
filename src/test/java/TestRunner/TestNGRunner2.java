package TestRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.*;
import Utilities.ConfigReader;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
      features = {"src/test/resources/parallel"},
      glue= {"parallel","DsalgoHooks"},
      plugin={"pretty",
    		  "html:target/Reports/report.html",
    		  "json:target/Reports/report.json",
    		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
    		 // "junit:target/Reports/report.xml"
    		  
    		 },
      publish = true
     
)
public class TestNGRunner2 extends AbstractTestNGCucumberTests
{
 /* @BeforeTest
  @Parameters({"browser"})
	public void defineBrowser(String browser) throws Throwable
  {
	  ConfigReader.setBrowserType(browser);
  }
  @Override	
  @DataProvider(parallel = true)
  public Object[][] scenarios()
  {
	 return super.scenarios();
  }*/
}
