package com.testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	

@RunWith(Cucumber.class)
	@CucumberOptions(
			features = { "C:\\Users\\ACCESS\\git\\seleniumPracticeProject\\practice\\src\\test\\java\\features\\login.feature" },
			        glue = {"com.stepdefinations"},
			plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber.json"
			}
			)
	public class MyTestRunner {

	}

