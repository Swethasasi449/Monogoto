package org.pojo1;

import org.helping.CucumberBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAdactin extends CucumberBaseClass {

	public LoginAdactin() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(id = "username")
    private WebElement username;

    public WebElement getusername(String value) {
    	passTheValues(username,value);
        return username;
    }

    @FindBy(id = "password")
    private WebElement password;

    public WebElement getPassword(String value) {
    	passTheValues(password,value);
        return password;
    }

    @FindBy(id = "login")
    private WebElement login;

    public WebElement getLogin() {
    	pressTheButton(login);
        return login;
    }
   
    	
    	
    }
	
	
	
	
	
	
	
	
	
	

