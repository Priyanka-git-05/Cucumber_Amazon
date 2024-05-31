package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src\\test\\java\\com\\Feature\\NopCommerce.feature"},
		glue= {"com.Commerce"},
		dryRun=false,
		
		plugin= {"html:HTMLReport/commerce.html",
				"pretty",
				"json:JSONReport/commerce.json"
				}
		
		)
public class Commerce_Runner {

}
