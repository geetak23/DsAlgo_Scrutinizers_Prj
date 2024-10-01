package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import WebdriverManager.driverFactory;

public class RegisterPage extends driverFactory
{	
	//ByLocators
		By usernameTxtBox=By.xpath("//input[@id='id_username']");
		By pwdTxtBox=By.xpath("//input[@id='id_password1']");
		By pwdTxtBox2=By.xpath("//input[@id='id_password2']");
		By registerBox=By.xpath("//input[@value='Register']");
		By pwdErrMsg=By.xpath("//div[contains(text(),' password_mismatch:The two password fields didn’t match')]");
		By registeredName=By.xpath("//div[contains(text(),'New Account Created.')]");
		
	public RegisterPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	// Open home page
    public void openRegisterPage() 
    {
        driver.get("https://dsportalapp.herokuapp.com/register");
    }
    public String pageTitle()
    {
    	return driver.getTitle();
    }
    public void userName(String UN) 
    {
 	   driver.findElement(usernameTxtBox).sendKeys(UN);
    }
    public void passWord(String PWD) 
    {
 	   driver.findElement(pwdTxtBox).sendKeys(PWD);
    }
    public void confirmPassword(String CPWD)
    {
 	   driver.findElement(pwdTxtBox2).sendKeys(CPWD);
    }
    public String validationMsg()
    {
 	   WebElement activeElement = driver.switchTo().activeElement();
 	   String messageStr = activeElement.getAttribute("validationMessage");
 	   return messageStr;
    }
    public String pwdErrMsg()
    {
    	String message = "";
    	try {
    		
			Thread.sleep(3000);
			message = driver.findElement(pwdErrMsg).getText();
		 	
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 	  
    	return message;
    }
    
    public void clickReg()
    { 
 	   driver.findElement(registerBox).click();
    }
    public void openDashBoard()
    {
    	driver.get("https://dsportalapp.herokuapp.com/home");
    }
}
