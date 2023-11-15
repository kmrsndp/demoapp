package org.assignment.utils;

import org.assignment.pages.BasePage;
import org.assignment.pages.PageObjectManager;
import org.openqa.selenium.WebDriver;

public class ContextSetup {

    public WebDriver driver;
    public PageObjectManager pageObjectManager;
    public BaseTest baseTest;
    public CommonUtils commonUtils;
    public ScreenshotUtil screenshotUtil;
    public BasePage basePage;


    //Initializing all page and utils objects here
    public ContextSetup() {
        baseTest = new BaseTest();
        pageObjectManager = new PageObjectManager(baseTest.webDriverManager());
        commonUtils = new CommonUtils(baseTest.webDriverManager());
        screenshotUtil = new ScreenshotUtil(baseTest.webDriverManager());
        basePage = new BasePage(baseTest.webDriverManager());
    }


}
