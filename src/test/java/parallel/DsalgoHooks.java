package parallel;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import POM.SignInPage;
import Utilities.ConfigReader;
import WebdriverManager.driverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
	
public class DsalgoHooks extends driverFactory{
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	private driverFactory driverFactory;
	public WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.initProperties();
	}
	
	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactory = new driverFactory();
		driver = driverFactory.init_driver(browserName);
	}
	
	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}
	
	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
		//take screenshot
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte [] sourcePath =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
		}
	}
}