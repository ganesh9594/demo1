package Step;

import java.util.List;

import org.junit.Assert;

import BaseLayer.BaseClass;
import PageLayer.Login;
import PageLayer.PimPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination extends BaseClass {
	

	PimPage pim =new PimPage();
	String eid;
	
	
	
	@Given("user enter the {string} browser and open login url")
	public void user_enter_the_browser_and_open_login_url(String string) {
		
		BaseClass.intialization(string);
	
	}

	@When("User Enter The Valid Credential and Login The URL")
	public void user_enter_the_valid_credential_and_login_the_url() {
		
		Login loginpage=new Login();
		loginpage.loginfunctionality("Admin", "admin123");
	  
	}

	@Then("User Validate Title")
	public void user_validate_title() {
		String Title=driver.getTitle();
		Assert.assertEquals(Title,"OrangeHRM");
	
	}

	@Then("User Validate the URL")
	public void user_validate_the_url() {
		
		String url=driver.getCurrentUrl();
		boolean b=url.contains("index");
		Assert.assertEquals(b,true);
	 
	}

	@When("USer Click On PIM Link")
	public void u_ser_click_on_pim_link() {
		
		pim.clickpim();
		
	
	}

	@When("User validate url by using url")
	public void user_validate_url_by_using_url(io.cucumber.datatable.DataTable dataTable) {
		
		List<List<String>> list = dataTable.asLists();
		String val=list.get(0).get(0);
		String url=driver.getCurrentUrl();
		boolean b=url.contains(val);
		Assert.assertEquals(b, true);
		

	}

	@When("User click on addemployee link and enter {string},{string} and click on save buttton")
	public void user_click_on_addemployee_link_and_enter_and_click_on_save_buttton(String string, String string2) {

	}

	@When("Capture the Employee ID and Click on Search button")
	public void capture_the_employee_id_and_click_on_search_button() {
	 
	}

	@When("Select the search search employee and click on delete")
	public void select_the_search_search_employee_and_click_on_delete() {

	}

	@When("Validate user is Deleted or not")
	public void validate_user_is_deleted_or_not() {
	    
	}


}
