package org.help;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	@Test
	public static void generateJvmReport(String jsonpath) {
		
File f= new File("C:\\Users\\JAGADESH D\\eclipse-workspace\\CucumberProject\\Allreports\\jvmreport");

Configuration c= new Configuration(f,"FACEBOOK");
 c.addClassifications("os", "windows");
 c.addClassifications("application", "facebook");
 c.addClassifications("tool","eclipse");
 c.addClassifications("jdk","1.8");

 List<String> l=new ArrayList<String>();
 
 l.add(jsonpath);
 
 ReportBuilder r=new ReportBuilder(l,c);
 r.generateReports();
 
	}
	
}
