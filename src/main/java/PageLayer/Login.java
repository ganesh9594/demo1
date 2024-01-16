package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import ConfigLayer.Wait;

public class Login extends BaseClass{
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement loginButton;
	
	public Login()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginfunctionality(String Username, String Password)
	{
		Wait.sendkeys(username, Username);
		Wait.sendkeys(password, Password);
		Wait.click(loginButton);
	}


}
