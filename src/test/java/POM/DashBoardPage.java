package POM;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebdriverManager.driverFactory;

public class DashBoardPage extends driverFactory{
	 // Locators for home page elements

	@FindBy(xpath = "//a[text()='Data Structures']") WebElement dsDropDown;	
	@FindBy(xpath="//div[@class='alert alert-primary']") WebElement errorMsg;
	@FindBy(xpath="//a[contains(text(),' Register ')]") WebElement registerLink;
	@FindBy(xpath="//a[contains(text(),'Sign in')]") WebElement loginLink;
	By menuList=By.xpath(("//div[@class='dropdown-menu show']//a[@class='dropdown-item']"));
	By dsGetStartBtn=By.xpath("//a[contains(text(),'Get Started')]");

	public DashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// Open home page
    public void openDashBoardPage() {
        driver.get("https://dsportalapp.herokuapp.com/home");
    }

    // Get page title
    public String getPageTitle() {
        return driver.getTitle();
    }

    // Get current URL
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
   // Click on a link based on text
    public void clickOnLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
    // Method to verify the current URL
    public boolean isSignInPage(String expectedUrl) {
        return driver.getCurrentUrl().equals(expectedUrl);
    }
    public void clickDropDown() {
    	dsDropDown.click();
    }
     
    public void GetStartBtnList(int index){
 		List<WebElement> getbtnListIP= driver.findElements(dsGetStartBtn);;
 		getbtnListIP.get(index).click();	
 	}
    
    public  List<String>  dropDownOptions() {
    	List<String> items=new ArrayList<>();
    	List<WebElement> list = driver.findElements(menuList);;
    	for(WebElement e:list) {
    		String text=e.getText();
    		items.add(text);
    	}
    	return items;
    }
 	  
    public void clickDropdownitem(int index){
    	List<WebElement> list = driver.findElements(menuList);;
 		list.get(index).click();
     }

    public String errorMessage()
    {
    	return errorMsg.getText();
    }
     
    public void clickRegisterLink(){
    	registerLink.click();
    }
    
    public void registerPage(){
    	 System.out.println("User is on Register Page with Login at the bottom of the page");
    }
    
    public void clickSignInPage(){
    	 loginLink.click();
    }

    public void loginLinkPage(){
    	 System.out.println("User is on SignIn Page with Register link at the bottom of the page");
    }
}
