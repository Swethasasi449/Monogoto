package org.step;

import java.util.List;
import java.util.Map;

import org.helping.CucumberBaseClass;
import org.pojo1.LoginAdactin;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends CucumberBaseClass{	

	@Given("max and handle synchronization")
	public void max_and_handle_synchronization() {
	maximize();
	implicitWait(10);
	}

	@When("Enter the Invalid username and Invalid password and click the login button")
	public void enter_the_invalid_username_and_invalid_password_and_click_the_login_button(io.cucumber.datatable.DataTable d) {
		List<Map<String, String>> maps = d.asMaps();
	      Map<String, String> map = maps.get(1);
		    LoginAdactin lo = new LoginAdactin();
		    lo.getusername(map.get("username"));
		    lo.getPassword(map.get("password"));
			lo.getLogin();	
			Assert.assertEquals("Adactin.com-Search Hotel", "Invalid page Title");
			System.out.println("Page is valid");
	}
	@When("Enter the Invalid username and valid password and click the login button")
	public void enter_the_invalid_username_and_valid_password_and_click_the_login_button(io.cucumber.datatable.DataTable d) {
		List<List<String>> asLists = d.asLists();
		List<String> list =asLists.get(1);
	    LoginAdactin lo = new LoginAdactin();
		   lo.getusername(list.get(0));
		   lo.getPassword(list.get(1));
		   lo.getLogin();	
		   Assert.assertEquals("Adactin.com-Search Hotel", "Invalid page Title");
			System.out.println("Page is valid");
	   
	}
	@When("Enter the valid login credentials and click the login button")
	public void enter_the_valid_login_credentials_and_click_the_login_button(io.cucumber.datatable.DataTable i) {
		 List<String> list = i.asList();
		   LoginAdactin lo = new LoginAdactin();
		   lo.getusername(list.get(0));
		   lo.getPassword(list.get(1));
		   lo.getLogin();
	}
	@When("Enter the valid username and Invalid password and click the login button")
	public void enter_the_valid_username_and_invalid_password_and_click_the_login_button(io.cucumber.datatable.DataTable d) {
		 Map<String, String> map = d.asMap();
		    LoginAdactin lo = new LoginAdactin();
		    lo.getusername(map.get("username"));
		    lo.getPassword(map.get("password"));
			lo.getLogin();
			
			Assert.assertEquals("Adactin.com-Search Hotel", "Invalid page Title");
			System.out.println("Page is valid");
	}
	@Then("User have to close the tab")
	public void user_have_to_close_the_tab() {
	   closeBrowser();
	}


	 	
		

}