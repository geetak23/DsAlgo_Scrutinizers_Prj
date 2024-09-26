package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import POM.SignInPage;
import WebdriverManager.*;

public class DsalgoHooks {
	private WebDriver driver;
SignInPage Signin=new SignInPage();
   @BeforeAll
    public void setUp() {
        // Fetch the browser name from configuration or system properties
        //String browser = System.getProperty("browser", "chrome");
    	//Webdrivermanager gets broswer properties from configuration class(config file)
        driver = Webdrivermanager.getDriver();
        
    }
@Before("@TreePage")
public void SignIn() {
	System.out.println("Line Number 26 Hooks Class");
	driver.findElement(By.className("btn")).click();
	Signin.signinpage("Scrutinizers","Numpysdet176");
	
}
    @After
    public void tearDown() {
    	Webdrivermanager.quitDriver();
    }
}
