package TestRunner;

import org.testng.annotations.*;
import Utilities.ConfigReader;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
      features = {"src/test/resources/feature"},
    		  tags= "@seq1 or @seq2 or @seq3 or @seq4 or @seq5 or @seq6 or @seq7 or @seq8 or @seq9 or @seq10 or @seq11 ",
    		  glue= {"stepdefinitions","DsalgoHooks"},
      plugin={"pretty","html:target/Reports/report.html"
    		  ,"json:target/Json-reports/cucumberreport.json",
    		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
    		  "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
    		  },      
      publish = true     
)
public class TestNGRunnerChrome extends AbstractTestNGCucumberTests
{	
	@BeforeTest
	@Parameters({"browser"})
	public void defineBrowser(@Optional("chrome") String browser) throws Throwable
	  {
		  System.out.println("definebrowser: "+browser);
		  ConfigReader.setBrowserType(browser);
	  }
	
	@Override	
	@DataProvider(parallel = false)
	public Object[][] scenarios()
	{
		return super.scenarios();
	} 
}
