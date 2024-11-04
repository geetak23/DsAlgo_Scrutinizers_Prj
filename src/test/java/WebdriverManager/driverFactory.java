package WebdriverManager;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import Utilities.LoggerLoad;
import io.github.bonigarcia.wdm.WebDriverManager;


public class driverFactory {
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	public WebDriver driver;
	
	
	@Parameters("browser")
	@BeforeTest
	public WebDriver init_driver(@Optional("chrome") String browser) {
			
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();			
			System.out.println("In chrome driver");
			tlDriver.set(new ChromeDriver());			
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		}
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			tlDriver.set(new EdgeDriver());
		}
		else {
			System.out.println("Please pass the correct browser value: " + browser);
		}
		
		LoggerLoad.info("In : "+ browser +" browser");
		
		getDriver().manage().deleteAllCookies();	
		getDriver().manage().window().maximize();
		
		return getDriver();		
	}
	
	public static synchronized WebDriver getDriver() {
		
		return tlDriver.get();		
	}    
}