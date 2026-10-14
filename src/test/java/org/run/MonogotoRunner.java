package org.run;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\acer\\eclipse-workspace\\SwethaCucumber\\src\\test\\resources\\Feature\\Mongoto",
glue="org.monstep",
monochrome = true,
dryRun = false,
plugin = {"pretty",
		"html:C:\\Users\\acer\\eclipse-workspace\\SwethaCucumber\\Report\\htmlFolder\\monogoto.html",
						
})

public class MonogotoRunner extends AbstractTestNGCucumberTests {
	
	
	

}
