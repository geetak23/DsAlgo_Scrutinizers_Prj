package WebdriverManager;
//package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;

import Utilities.ConfigReader;


public class Webdrivermanager {
	/* private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	 public static WebDriver getDriver() {
	        String browser = ConfigReader.getBrowser();  // Use browser property from ConfigReader
	        System.out.println(browser);
	        switch (browser.toLowerCase()) {
	            case "chrome":
	            	System.out.println("in webdriver chrome");
	            	//String projectPath=System.getProperty("user.dir");
	            	System.out.println("projectpath is : "+projectPath);
	            	//System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver");
	            	//WebDriverManager.chromedriver().browserVersion("128.0.6613.138").setup();
	            	 // this.driver=new ChromeDriver();
	                //WebDriverManager.chromedriver().setup();
	                driver.set(new ChromeDriver());
	                break;
	            case "firefox":
	                WebDriverManager.firefoxdriver().setup();
	                driver.set(new FirefoxDriver());
	                break;
	            case "edge":
	                WebDriverManager.edgedriver().setup();
	                driver.set(new EdgeDriver());
	                break;
	            default:
	                throw new IllegalArgumentException("Unsupported browser: " + browser);
	        }
	        return driver.get();
	    }
	    
	      public static void quitDriver() {
	        if (driver.get() != null) {
	            driver.get().quit();
	            driver.remove();
	        }
	    }
	    */
	 private static WebDriver driver;

	    public static WebDriver getDriver() {
	        if (driver == null) 
	        {
	            String browser = ConfigReader.getBrowser();
	            switch (browser.toLowerCase())
	            {
	            case "chrome":
	            	System.out.println("in webdriver chrome");
	            	//String projectPath=System.getProperty("user.dir");
	            	//System.out.println("projectpath is : "+projectPath);
	            	//System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver");
	            	//WebDriverManager.chromedriver().browserVersion("128.0.6613.138").setup();
	            	 // this.driver=new ChromeDriver();
	                //WebDriverManager.chromedriver().setup();
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
