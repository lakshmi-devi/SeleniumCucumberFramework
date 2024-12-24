package com.common;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import driverfactory.ManufactonUrlPageFactory;
import pages.LoginPage;

public class Login {

	private static LoginPage loginPage;

	public static void loginManufacton(WebDriver driver) {

		driver.manage().window().maximize();
		String url = getFullURL("loginPage");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

		loginPage = new LoginPage(driver);
		loginPage.enterEmail("dashboard@manufacton.com");
		loginPage.enterPassword("Bru!ns202!");

		loginPage.clickLoginButton();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

		Assert.assertEquals(loginPage.checkLogoutLink(), true);

	}

	public static String getFullURL(String pathKey) {
		String baseURL = ManufactonUrlPageFactory.getInstance().getValue("baseURL");
		System.out.println("baseurl is" + baseURL);
		String relativePath = ManufactonUrlPageFactory.getInstance().getValue(pathKey);
		return baseURL + relativePath;
	}

}
