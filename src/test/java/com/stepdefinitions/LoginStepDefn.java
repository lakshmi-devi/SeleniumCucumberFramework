package com.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import driverfactory.DriverFactory;
import driverfactory.ManufactonUrlPageFactory;
import pages.LoginPage;

public class LoginStepDefn {

    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setup(){
        driver = DriverFactory.getDriver();
    }

    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }

	@SuppressWarnings("deprecation")
	@Given("I am on the Manufacton login page")
    public void i_am_on_the_Manufacton_login_page() throws InterruptedException {	 
//        driver.get(ManufactonUrlPageFactory.getInstance().getValue("loginPage"));
		driver.get("https://stage.manufacton.com/#/login");
       Thread.sleep(2000);
        loginPage = new LoginPage(driver);
    }

    @Given("I have entered a valid username and password")
    public void i_have_entered_a_valid_username_and_password() {
        loginPage.enterEmail("dashboard@manufacton.com");
        loginPage.enterPassword("Bru!ns202!");
    }

    @Given("I have entered invalid {string} and {string}")
    public void i_have_entered_invalid_and(String username, String password) {
        loginPage.enterEmail(username);
        loginPage.enterPassword(password);
    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() throws InterruptedException {
        loginPage.clickLoginButton();
      Thread.sleep(2000);
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
//       Assert.assertEquals(loginPage.checkLogoutLink(), true);
    }

    @Then("I should see an error message indicating {string}")
    public void i_should_see_an_error_message_indicating(String errorMessage) {
        // Assert that an error message is displayed on the page matching the expected error message
        Assert.assertEquals( loginPage.checkTostMessage(errorMessage) , true);
    }
}

