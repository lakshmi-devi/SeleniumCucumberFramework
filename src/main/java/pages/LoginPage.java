package pages;


import java.time.Duration;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;

    // Locators
    private By emailInputLocator = By.xpath("//input[@type='email']");
    private By passwordInputLocator = By.xpath("//input[@type='password']");
    private By loginButtonLocator = By.xpath("//button[@class=\"button is-dark is-capitalized has-text-weight-bold\"]");
    private By logoutLinkLocator = By.xpath("//i[@class=\"icon-loginlogout is-size-1\"]");
//    private By invalidLoginTostMessage = By.xpath("//div[text()=\"Cannot log in with this user name and password\"]");


    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void enterEmail(String email) {
        WebElement emailInput = driver.findElement(emailInputLocator);
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordInput = driver.findElement(passwordInputLocator);
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
    }


    public boolean checkLogoutLink(){
        return driver.findElement(logoutLinkLocator).isDisplayed();
    }
    
    public boolean checkTostMessage(String errorMessage){
    	By errorPath = By.xpath("//div[text()=\"" + errorMessage +"\"]");
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        if(wait.until(ExpectedConditions.visibilityOfElementLocated(errorPath)) != null) return true;
        return false;
    }

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }

    public String getForgotPwdPageUrl(){
        String forgotPwdPageUrl = driver.getCurrentUrl();
        return forgotPwdPageUrl;
    }


}
