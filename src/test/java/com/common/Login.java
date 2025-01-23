package com.common;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import driverfactory.ManufactonUrlPageFactory;
import pages.LoginPage;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Login {

	private static LoginPage loginPage;
	private static Logger log;

	public static void loginManufacton(WebDriver driver) {
		
			log = LogManager.getLogger("/practice/src/test/java/com/common/Login.java");
		
		driver.manage().window().maximize();
		String url = getFullURL("loginPage");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

		loginPage = new LoginPage(driver);
		loginPage.enterEmail("dashboard@manufacton.com");
		loginPage.enterPassword("Bru!ns202!");

		loginPage.clickLoginButton();
		log.info("login successful");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

		Assert.assertEquals(loginPage.checkLogoutLink(), true);
		log.info("assertion passed");

	}

	public static String getFullURL(String pathKey) {
		String baseURL = ManufactonUrlPageFactory.getInstance().getValue("baseURL");
		System.out.println("baseurl is" + baseURL);
		String relativePath = ManufactonUrlPageFactory.getInstance().getValue(pathKey);
		return baseURL + relativePath;
	}

}
