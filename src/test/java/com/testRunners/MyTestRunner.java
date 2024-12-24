package com.testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	

@RunWith(Cucumber.class)
	@CucumberOptions(
			features = { "src/main/java/resources/features/login.feature" },
			        glue = {"com.stepdefinations"},
			plugin = {"pretty"
			}
			
			)
	public class MyTestRunner {

	}

