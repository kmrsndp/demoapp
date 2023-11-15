package org.assignment.utils;

import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtil {

    public WebDriver driver;

    public ScreenshotUtil(WebDriver driver) {
        this.driver = driver;
    }

    public void attachScreenshotToScenario(Scenario scenario){

        byte[] fileContent;

        try {
            File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            fileContent = FileUtils.readFileToByteArray(source);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        scenario.attach(fileContent, "image/png", "Failure screenshot");
    }


}
