package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import ConfigLayer.Wait;

public class PimPage extends BaseClass{
	
	
	@FindBy(xpath="(//a[@class='oxd-main-menu-item'])[2]")
	WebElement pim;
	
	@FindBy(xpath="//button[text()=' Add ']")
	WebElement AddEmp;
	
	@FindBy(name="firstName")
	WebElement firstname;
	
	@FindBy(name="lastName")
	WebElement lastname;
	
	@FindBy (xpath="//button[text()=' Save ']")
	WebElement savebutton;
	
	
	@FindBy (xpath="//a[text()='Employee List']")
	WebElement employeelist;
	
	@FindBy (xpath=("//input[@class='oxd-input oxd-input--active']"))
	WebElement employeeID;
	
	@FindBy (xpath=("//button[text()=' Search ']"))
	WebElement searchButton;
	
	public PimPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void clickpim()
	{
		Wait.click(pim);
	}
	
	
	public void adddata(String fname, String lname)
	{
		Wait.click(AddEmp);
		Wait.sendkeys(firstname, fname);
		Wait.sendkeys(lastname, lname);
		Wait.click(savebutton);
	}

}
