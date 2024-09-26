package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebdriverManager.driverFactory;

public class SignInPage extends driverFactory{
	 
	@FindBy(xpath = "//button[@class='btn']") WebElement start;
	@FindBy(linkText="Sign in") WebElement SignInButton;
	    @FindBy(id="id_username") WebElement UserNameText;
	    @FindBy(id="id_password") WebElement PassWord;
	    @FindBy(xpath="//input[@value='Login']") WebElement LoginButton;
	  
 public SignInPage() {
	 PageFactory.initElements(driver, this);
	  
 }
	 
 public void signinpage(String UserName,String Password) {
	 start.click();
	 SignInButton.click();
	 UserNameText.sendKeys(UserName);
		PassWord.sendKeys(Password);
		LoginButton.click();
		System.out.print("Landed on Main page");
		
	}
		    
}
