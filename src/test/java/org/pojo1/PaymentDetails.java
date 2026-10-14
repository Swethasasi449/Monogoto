package org.pojo1;

import org.helping.CucumberBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentDetails extends CucumberBaseClass{
	public PaymentDetails() {
		PageFactory.initElements(getDriver(), this);	
		}
	@FindBy(id="first_name")
	private WebElement first;
	
	@FindBy(id="last_name")
	private WebElement last;
 
	@FindBy(id="address")
	private WebElement addr;
	
	@FindBy(id="cc_num")
	private WebElement num;	
	
	@FindBy(id="cc_type")
	private WebElement type;	

    @FindBy(id="cc_exp_month")
	private WebElement exp;	

    @FindBy(id="cc_exp_year")	
	private WebElement year;	

	@FindBy(id="cc_cvv")
	private WebElement ccv;

	@FindBy(id="book_now")
	private WebElement now;	

	@FindBy(id="order_no")
	private WebElement no;
	
	public WebElement getNo() {
		return no;
	}

	public WebElement getNow() {
		return now;
	}
	public WebElement getFirst() {
		return first;
	}
	public WebElement getLast() {
		return last;
	}
	public WebElement getAddr() {
		return addr;
	}
	public WebElement getNum() {
		return num;
	}
	public WebElement getType() {
		return type;
	}
	public WebElement getExp() {
		return exp;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCcv() {
		return ccv;
	}	
}
