package org.run;

import org.step.JvmReport;
import org.testng.annotations.AfterClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = "C:\\Users\\acer\\eclipse-workspace\\SwethaCucumber\\src\\test\\resources\\Feature\\table.feature",
glue="org.step",
monochrome = true,
dryRun = false,
tags = "@login1 and @regression or @smoke",
plugin = {"pretty",
		"html:C:\\Users\\acer\\eclipse-workspace\\SwethaCucumber\\Report\\htmlFolder\\adactin.html",
		"json:C:\\Users\\acer\\eclipse-workspace\\SwethaCucumber\\Report\\Json\\adactin.json",
		"junit:C:\\Users\\acer\\eclipse-workspace\\SwethaCucumber\\Report\\Junit\\adactin.xml",
        "rerun:C:\\Users\\acer\\eclipse-workspace\\SwethaCucumber\\Report\\ReRunFolder.adatin.txt"				
})
public class RunnerClass extends AbstractTestNGCucumberTests {
//@AfterClass
//public void afterclass() {
//JvmReport.generateJvmReport("C:\\Users\\acer\\eclipse-workspace\\SwethaCucumber\\Report\\Json\\adactin.json");
//}
	
	
}
