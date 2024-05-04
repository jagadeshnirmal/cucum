package org.runner;

import org.help.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\JAGADESH D\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\Featurefile"
,glue="org.stepdefinition",dryRun=false,strict=false,tags="@sanity",
plugin={"html:C:\\Users\\JAGADESH D\\eclipse-workspace\\CucumberProject\\Allreports\\html report",
		"junit:C:\\Users\\JAGADESH D\\eclipse-workspace\\CucumberProject\\Allreports\\junit report\\fb.xml",
		"json:C:\\Users\\JAGADESH D\\eclipse-workspace\\CucumberProject\\Allreports\\json report\\facebook.json"})
public class TestRunner {

	@AfterClass
	public static void tc() {
		
		
		JvmReport.generateJvmReport("C:\\Users\\JAGADESH D\\eclipse-workspace\\CucumberProject\\Allreports\\json report\\facebook.json");
		
		
	}
	
	
}
