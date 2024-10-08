package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebdriverManager.driverFactory;

public class SignInPage extends driverFactory
{
	 
	//@FindBy(xpath = "//button[@class='btn']") WebElement start;
	//@FindBy(linkText="Sign in") WebElement SignInButton;
    //@FindBy(id="id_username") WebElement UserNameText;
    //@FindBy(id="id_password") WebElement PassWord;
    //@FindBy(xpath="//input[@value='Login']") WebElement LoginButton;
    
    //@FindBy(xpath="//div[contains(text(),'Invalid Username and Password')]") WebElement ErrorMsg;	    
	    
	 By start = By.xpath("//button[@class='btn']");
	 By SignInButton = By.linkText("Sign in");
	 By UserNameText= By.id("id_username");
	 By PassWord= By.id("id_password");
	 By LoginButton = By.xpath("//input[@value='Login']");
	 By ErrorMsg = By.xpath("//div[contains(text(),'Invalid Username and Password')]");
	 
	 public SignInPage() 
	 {
		PageFactory.initElements(driver, this);	  
	 }
	  
	 public SignInPage(WebDriver driver) 
	 {
	    //PageFactory.initElements(driver, this);
		 this.driver=driver;
	 }
	 public void openSignInPage()
	 {
		 driver.get("https://dsportalapp.herokuapp.com/login");
	 }
	
	 public String getSignInPageTitle()
	 {
		 return driver.getTitle();
	 }
	 public void enteruserName(String userName) {
		System.out.println("User : " + userName);
		driver.findElement(UserNameText).sendKeys(userName);
	 }

	 public void enterpwd(String pwd) {
		System.out.println("Password : " + pwd);
		driver.findElement(PassWord).sendKeys(pwd);
	 }

	 public void clickonSignIn() {
		 driver.findElement(LoginButton).click();
	 }
	// Error message "Invalid user and Password"
	public String LoginBtnError() 
	{
		String errormsg = driver.findElement(ErrorMsg).getText();
		System.out.println("Expected message " + errormsg);
		return errormsg;
	}
	 
	 public WebDriver signinpage(String UserName,String Password)
	 {
		 driver.findElement(UserNameText).sendKeys(UserName);
		 driver.findElement(PassWord).sendKeys(Password);
		 driver.findElement(LoginButton).click();
	    System.out.print("Landed on Main page");	
	    return getDriver();
	 }   

	 public void navigateToDashBoard()
	 {
		 driver.get("https://dsportalapp.herokuapp.com/home");
	 }
}