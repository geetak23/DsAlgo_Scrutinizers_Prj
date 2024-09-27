package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebdriverManager.driverFactory;

public class SignInPage extends driverFactory
{
	 
	@FindBy(xpath = "//button[@class='btn']") WebElement start;
	@FindBy(linkText="Sign in") WebElement SignInButton;
    @FindBy(id="id_username") WebElement UserNameText;
    @FindBy(id="id_password") WebElement PassWord;
    @FindBy(xpath="//input[@value='Login']") WebElement LoginButton;
    
    @FindBy(xpath="//div[contains(text(),'Invalid Username and Password')]") WebElement ErrorMsg;	    
	    
	    
	 public SignInPage() 
	 {
		PageFactory.initElements(driver, this);	  
	 }
	  
	 public SignInPage(WebDriver driver) 
	 {
	    PageFactory.initElements(driver, this);	  
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
		UserNameText.sendKeys(userName);
	 }

	 public void enterpwd(String pwd) {
		System.out.println("Password : " + pwd);
		PassWord.sendKeys(pwd);
	 }

	 public void clickonSignIn() {
		LoginButton.click();
	 }
	// Error message "Invalid user and Password"
	public String LoginBtnError() 
	{
		String errormsg = ErrorMsg.getText();
		System.out.println("Expected message " + errormsg);
		return errormsg;
	}
	 
	 public void signinpage(String UserName,String Password)
	 {
	    UserNameText.sendKeys(UserName);
	    PassWord.sendKeys(Password);
	    LoginButton.click();
	    System.out.print("Landed on Main page");		
	 }   
	 
	 public void navigateToDashBoard()
	 {
		 driver.get("https://dsportalapp.herokuapp.com/home");
	 }
}