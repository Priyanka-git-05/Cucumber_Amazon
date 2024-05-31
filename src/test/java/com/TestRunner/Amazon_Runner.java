package com.TestRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.BaseClass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src\\test\\java\\com\\Feature\\Amazonlogin.feature"},
		glue="com.Amazon",
		dryRun=false,
		plugin= {
				"html:HTMLReport/amazon.html",
				"pretty",
				"json:JSONReport/amazon.json",	
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
	)
public class Amazon_Runner extends BaseClass{
	@BeforeClass
	public static void sessionStart() {
		launchTheBrowser("Chrome");
	
	}
	@AfterClass
	public static void sessionEnd() {
		terminateBrowser(driver);
	
	}
}
