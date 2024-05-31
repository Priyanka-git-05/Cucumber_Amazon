package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features ="src\\test\\java\\com\\Feature\\Facebook3.feature",
		glue = "com.StepDef",
		plugin= {
				"html:HTMLReport/facebook3.html",      //Singlereport
				
				"pretty",                             //multireport   
				
				"json:JSONReport/facebook3.json"       //json report
				}
		)
public class RunnerClass3 {

}
