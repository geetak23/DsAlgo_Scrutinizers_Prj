package stepdefinitions;

import org.openqa.selenium.WebDriver;

import POM.SignInPage;
import WebdriverManager.driverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
	
public class DsalgoHooks extends driverFactory{

  SignInPage Signin=new SignInPage();
    
  @BeforeAll
    public static void setUp() {       
        driver = driverFactory.getDriver();        
    }
  
    @After
    public void tearDown() {
    	//driver.quit();
    }
}