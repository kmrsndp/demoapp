package org.assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage {

    protected WebDriver driver;

    private final Logger log = LoggerFactory.getLogger(BasePage.class);

    public BasePage(){}
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void initElements(){
        PageFactory.initElements(driver, this);
    }


}
