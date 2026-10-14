package org.run;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@C:\\Users\\acer\\eclipse-workspace\\SwethaCucumber\\Report\\ReRunFolder.adatin.txt",
glue="org.step",
monochrome = true,
dryRun = false,
plugin = {"pretty",
		"html:C:\\Users\\acer\\eclipse-workspace\\SwethaCucumber\\Report\\htmlFolder\\adactin.html",
		"json:C:\\Users\\acer\\eclipse-workspace\\SwethaCucumber\\Report\\Json\\adactin.json",
		"junit:C:\\Users\\acer\\eclipse-workspace\\SwethaCucumber\\Report\\Junit\\adactin.xml",
		"rerun:C:\\Users\\acer\\eclipse-workspace\\SwethaCucumber\\Report\\ReRunFolder.adatin.txt",
		
})

public class ReRunner extends AbstractTestNGCucumberTests {

}
