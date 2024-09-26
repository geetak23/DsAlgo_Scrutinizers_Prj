package stepdefinitions;

import org.openqa.selenium.WebDriver;

import POM.SignInPage;
import WebdriverManager.driverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
	
public class DsalgoHooks extends driverFactory{

 private static WebDriver driver;
  SignInPage Signin=new SignInPage();
  
  
  @BeforeAll
    public static void setUp() {
        // Fetch the browser name from configuration or system properties
        //String browser = System.getProperty("browser", "chrome");
    	//Webdrivermanager gets broswer properties from configuration class(config file)
        driver = driverFactory.getDriver();
        
    }
@Before("@DataStructures")
public void loginin() {
	System.out.println("Line Number 26 Hooks Class");
	
	Signin.signinpage("Scrutinizers","Numpysdet176");
	
}
//    @After
//    public void tearDown() {
//    	Webdrivermanager.quitDriver();
//    }
}
