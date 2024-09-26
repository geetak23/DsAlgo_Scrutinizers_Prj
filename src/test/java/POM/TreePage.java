package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TreePage {
	 
	   @FindBy(linkText="Sign in") WebElement SignInButton;
	    @FindBy(id="id_username") WebElement UserName;
	    @FindBy(id="id_password") WebElement PassWord;
	   
	   
	  
}
