package WebdriverManager;
//package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utilities.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;


public class driverFactory {
	    protected static WebDriver driver;

	    public static WebDriver getDriver() 
	    {
	        if (driver == null) 
	        {
	            String browser = ConfigReader.getBrowser();
	            switch (browser.toLowerCase())
	            {
	            case "chrome":
	            	System.out.println("in webdriver chrome");
	            	driver = new ChromeDriver();
	                break;
	            case "firefox":
	                WebDriverManager.firefoxdriver().setup();
	                driver=new FirefoxDriver();
	                break;
	            case "edge":
	                WebDriverManager.edgedriver().setup();
	                driver=new EdgeDriver();
	                break;
	            default:
	                throw new IllegalArgumentException("Unsupported browser: " + browser);
	            }
                driver.get("https://dsportalapp.herokuapp.com/");
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		            
	        }
	        return driver;
	    }
	  
	    public static void quitDriver() {
	        if (driver != null) {
	            driver.quit();
	            driver = null;
	        }
	    }
}