package org.pojo2;

import java.util.List;

import org.helping.CucumberBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Monogoto extends CucumberBaseClass {

	public Monogoto() {
        PageFactory.initElements(getDriver(), this);
    }	
	
	@FindBy(xpath="(//span[text()='Connect Your Devices'])[1]")
	private WebElement connectSystem;
	
	public WebElement getConnectSystem() {
		return connectSystem;
	}
	
	@FindBy(xpath="//h3[text()='Trusted by Industry Leaders']")
	private WebElement getPageText;
	
	public WebElement getGetPageText() {
		return getPageText;
	}	
	
	public String  getListXpath(String tabName) {
		String listXpath = "(//a[normalize-space()='" + tabName + "'])[1]/following-sibling::ul//a";
		return listXpath;
	}
	public String getXpathTab(String tabName) {
		String xpathTab = "//a[text()=" + "'" + tabName + "']";
		return xpathTab;	
		
	}
	@FindBy(xpath="//span[text()='Log in / Sign up ']")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement user;

	public WebElement getUser() {
		return user;
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement pass;

	public WebElement getPass() {
		return pass;
	}
	
	@FindBy(xpath = "//a[text()='Decline']")
	private WebElement cookie;

	public WebElement getCookie() {
		return cookie;
	}
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitButton;

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	@FindBy(xpath="//span[text()='Email or password is incorrect.']")
	private WebElement message;

	public WebElement getMessage() {
		return message;
	}
	
	
	
	
}
