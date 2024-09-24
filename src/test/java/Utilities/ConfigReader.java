package Utilities;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	 private static Properties properties;
	    private static String overriddenBrowser;

	    public static Properties initProperties() {
	        properties = new Properties();
	        try {
	            FileInputStream input = new FileInputStream("src/test/resources/Config/config.properties");
	            System.out.println(input);
	            properties.load(input);
	        } catch (IOException e) {
	            e.printStackTrace();
	            throw new RuntimeException("Failed to load config.properties file.");
	        }
	        return properties;
	        
	    }

	    // Method to get browser from either system property or config file
	    public static String getBrowser() {	    	
	        if (overriddenBrowser != null) {
	            return overriddenBrowser; // Return browser passed from TestNG or system property
	        } else {
	        	initProperties();
	            String browser = properties.getProperty("Browser");
	            if (browser != null) {
	                return browser;
	            } else {
	                throw new RuntimeException("Browser not specified in config.properties file.");
	            }
	        }
	    }

	    // Setter method to override browser value
	    public static void setBrowser(String browser) {
	        overriddenBrowser = browser;
	    }

	    // Additional configuration methods, e.g., getBaseUrl(), etc.
	    public static String getBaseUrl() {
	        String baseUrl = properties.getProperty("baseUrl");
	        if (baseUrl != null) return baseUrl;
	        else throw new RuntimeException("Base URL not specified in config.properties file.");
	    }

	    public static int getTimeout() {
	        String timeout = properties.getProperty("timeout");
	        if (timeout != null) return Integer.parseInt(timeout);
	        else throw new RuntimeException("Timeout not specified in config.properties file.");
	    }
}
