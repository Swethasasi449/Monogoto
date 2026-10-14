package org.step;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void generateJvmReport(String json) {

//1.Mention the target folder location-File
		File f = new File("C:\\Users\\acer\\eclipse-workspace\\SwethaCucumber\\Report\\JvmReport");
	
//Add details to the report using configuration class
	Configuration c = new Configuration(f, "Adactin Application");
	c.addClassifications("Student Name", "Swetha");
	 c.addClassifications("StudentnId", "177878");
	c.addClassifications("HDB", "NonBank");
	
//3.Add json file paths into List<String>
	List<String> l = new ArrayList<String>();
	l.add(json);
	
//4.Create object for ReportBuilder class and using the created object call genarateReports() method
	ReportBuilder r= new ReportBuilder(l, c);
	r.generateReports();
		
	}
	public static void main(String[] args) {
		generateJvmReport("C:\\Users\\acer\\eclipse-workspace\\SwethaCucumber\\Report\\Json\\adactin.json");
	}
	
	
	
}
