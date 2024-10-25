package Utilities;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties prop;
	protected static String browserType;

	public Properties initProperties() {

		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("./src/test/resources/Config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;
	}

	public static String getBrowser(String Browser) {
		if (browserType != null)
			return Browser;
		else
			throw new RuntimeException("Incorrect browser");
	}

	public static void setBrowserType(String Browser) {
		browserType = Browser;		
	}

	public String getBrowserType()
	{
		if (browserType != null)
			return browserType;
		else
			return "";
	}
}
