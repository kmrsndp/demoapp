package org.assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SauceDemo extends BasePage{
    public WebDriver driver;
    private final Logger log = LoggerFactory.getLogger(SauceDemo.class);

    public SauceDemo(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(id = "user-name")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "login-button")
    private WebElement loginBtn;

    @FindBy(className = "login_logo")
    private WebElement loginLogo;

    public void loginWithCredentials(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
        log.info("clicked on login button");
    }

    public String getLoginPageHeading() {
        return loginLogo.getText();
    }

}
