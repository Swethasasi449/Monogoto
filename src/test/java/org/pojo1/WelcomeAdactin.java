package org.pojo1;

import org.helping.CucumberBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class WelcomeAdactin  extends CucumberBaseClass {
	
	public WelcomeAdactin() {
	PageFactory.initElements(getDriver(), this);	
	}
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBys({
			@FindBy(xpath="//select[@name='hotels']"),
			@FindBy(xpath="//select[@name='hotels']")			
	})		
	private WebElement hotels;
	
	@FindAll({
		
		@FindBy(xpath="//select[@name='room_type']"),
		@FindBy(xpath="//select[@name='room_type']")	
	})
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement numofRooms;
	
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement CheckIn;
	
	@FindBy(xpath="//input[@id='datepick_out']")
	private WebElement Checkout;

	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adultPerRoom;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement ChildRoom;
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement Submit;
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id="continue")
	private WebElement con;
	public WebElement getCon() {
		return con;
	}
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getNumofRooms() {
		return numofRooms;
	}
	public WebElement getCheckIn() {
		return CheckIn;
	}
	public WebElement getCheckout() {
		return Checkout;
	}
	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}

	public WebElement getChildRoom() {
		return ChildRoom;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	

	
	
	
}
