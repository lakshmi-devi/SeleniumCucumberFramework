package com.stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {

	driverfactory.DriverFactory driverFactory;
	private WebDriver driver;

	@Before
	public void launchBrowser() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		String browserName = "chrome";
		driverFactory = new driverfactory.DriverFactory();
		driver = driverFactory.init_driver(browserName);
	}

//	@SuppressWarnings("static-access")
//	@After(order = 0)
//	public void quitBrowser() {
//		driverFactory.getDriver().quit();
//	}

//	@After(order = 1)
//	public void tearDown(Scenario scenario) {
//		if (scenario.isFailed()) {
//			// take screenshot:
//			String screenshotName = scenario.getName().replaceAll(" ", "_");
//			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(sourcePath, "image/png", screenshotName);
//
//		}
//	}
}
