package com.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "//Feature/TestCase.feature",
		glue="stepDefinitions",
		dryRun=false,
		plugin = {"pretty", "html:test-output"}
		)

public class TestRunner {
	

}
