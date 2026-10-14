package org.step;

import org.helping.CucumberBaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends CucumberBaseClass{
   
	@Before(order=2)
	
	public void Open() {
    openChrome();
    launchUrl("https://adactinhotelapp.com/");
	}
	
	@Before(order=3)
	public void url() {
    maximize();
	}
	@After
	public void aft(Scenario s) {
if (s.isFailed()) {
	
TakesScreenshot tk = (TakesScreenshot)getDriver();
byte[] sc = tk.getScreenshotAs(OutputType.BYTES);
s.attach(sc,"image/png",s.getName());
System.out.println("attached screenshot");
}
	}
	
	public void close() {
   closeBrowser();
	}
	
	
}
