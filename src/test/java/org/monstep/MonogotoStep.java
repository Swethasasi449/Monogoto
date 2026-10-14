package org.monstep;

import java.util.List;
import java.util.Set;

import org.helping.CucumberBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo2.Monogoto;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MonogotoStep extends CucumberBaseClass {

	String parentWindow;

	@Given("User launch the monogoto page")
	public void user_launch_the_monogoto_page() {
		openChrome();
		launchUrl("https://monogoto.io/");
		maximize();
		parentWindow = getDriver().getWindowHandle();

	}

	@When("User click connect system button")
	public void user_click_connect_system_button() {
		Monogoto mo = new Monogoto();
		System.out.println("Parent Window Handle: " + parentWindow);
		waitForVisibility(mo.getConnectSystem(), 20);
		pressTheButton(mo.getConnectSystem());

	}

	@Then("User should be in connect system page")
	public void user_should_be_in_connect_system_page() {
		Monogoto mo = new Monogoto();

		Set<String> allWindowHandles = getDriver().getWindowHandles();
		System.out.println("All Window Handles: " + allWindowHandles);

		for (String windowHandle : allWindowHandles) {
			if (!windowHandle.equals(parentWindow)) {
				getDriver().switchTo().window(windowHandle);
				System.out.println("Switched to Make Connectivity Window");

				String actualText = mo.getGetPageText().getAttribute("textContent");
				Assert.assertEquals(actualText, "Trusted by Industry Leaders");

				break;
			}
		}
		getDriver().switchTo().window(parentWindow);
		System.out.println("Switched back to Parent Window");

	}

	@Then("User close the browser")
	public void user_close_the_browser() {
		closeBrowser();

	}

	@Then("User verify the option {string} and {string}")
	public void user_verify_the_option_and(String tabName, String expectedCount) {
		Monogoto mo = new Monogoto();
		pressTheButton(getDriver().findElement(By.xpath(mo.getXpathTab(tabName))));

		List<WebElement> solutions = getDriver().findElements(By.xpath(mo.getListXpath(tabName)));

		System.out.println(tabName + " Options count:" + solutions.size());
		Assert.assertEquals(solutions.size(), Integer.parseInt(expectedCount));
		for (WebElement s : solutions) {
			System.out.println(s.getText().trim());
		}
	}

	@Given("User click the login button")
	public void user_click_the_login_button() throws InterruptedException {
		Monogoto mo = new Monogoto();
		pressTheButton(mo.getLoginButton());
		Thread.sleep(1000);
	}

	@When("User enters the email ID {string}")
	public void user_enters_the_email_id(String user) {
		Monogoto mo = new Monogoto();
		Set<String> allWindowHandles = getDriver().getWindowHandles();
		System.out.println("All Window Handles: " + allWindowHandles);

		for (String windowHandle : allWindowHandles) {
			if (!windowHandle.equals(parentWindow)) {
				getDriver().switchTo().window(windowHandle);
				System.out.println("Switched to Make Connectivity Window");
				passTheValues(mo.getUser(), user);

			}
		}
	}

	@When("User enters the password {string}")
	public void user_enters_the_password(String pass) {
		Monogoto mo = new Monogoto();
		passTheValues(mo.getPass(), pass);

	}

	@When("User declines the cookies")
	public void user_declines_the_cookies() {
		Monogoto mo = new Monogoto();
		pressTheButton(mo.getCookie());
	}

	@When("User submit the login details")
	public void user_submit_the_login_details() {
		Monogoto mo = new Monogoto();
		pressTheButton(mo.getSubmitButton());
	}

	@When("User should get the error message")
	public void user_should_get_the_error_message() {
		Monogoto mo = new Monogoto();
		waitForVisibility(mo.getMessage(), 10);
		String actual = mo.getMessage().getText();
		String expected = "Email or password is incorrect.";
		System.out.println("Error message: " + actual);

		Assert.assertEquals(actual, expected);

	}

}
