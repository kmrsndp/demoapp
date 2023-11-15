package org.assignment.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.messages.types.Hook;
import org.apache.commons.io.FileUtils;
import org.assignment.utils.ContextSetup;
import org.assignment.utils.ScreenshotUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import java.io.File;
import java.io.IOException;

public class Hooks {

    ContextSetup contextSetup;
    WebDriver driver;
    ScreenshotUtil screenshotUtil;

    public Hooks(ContextSetup contextSetup) {
        this.contextSetup = contextSetup;
        this.driver = contextSetup.baseTest.webDriverManager();
        this.screenshotUtil = contextSetup.screenshotUtil;
    }


    @AfterStep
    public void addScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            screenshotUtil.attachScreenshotToScenario(scenario);
        }
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
