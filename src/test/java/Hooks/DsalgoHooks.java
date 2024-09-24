package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import WebdriverManager.*;

public class DsalgoHooks {
	private WebDriver driver;

    @Before
    public void setUp() {
        // Fetch the browser name from configuration or system properties
        //String browser = System.getProperty("browser", "chrome");
    	//Webdrivermanager gets broswer properties from configuration class(config file)
        driver = Webdrivermanager.getDriver();
    }

    @After
    public void tearDown() {
    	//Webdrivermanager.quitDriver();
    }
}
