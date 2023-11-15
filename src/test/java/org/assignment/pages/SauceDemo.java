package org.assignment.pages;

import org.openqa.selenium.WebDriver;

public class SauceDemo {


    public WebDriver driver;

    public SauceDemo(WebDriver driver){
        this.driver = driver;
    }
    public void visitLoginPage(){

        driver.get("https://www.saucedemo.com/");

    }

}
