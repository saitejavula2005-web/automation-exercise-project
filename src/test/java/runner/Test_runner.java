package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"src/test/resources/feature/automationexercise.feature" }, 
glue = "stepDefinition", dryRun = !true, plugin = {
				"html:target/cucumber-report.html", "json:target/cucumber-report.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
tags = "@sanity",
publish = true)

public class Test_runner {

}
