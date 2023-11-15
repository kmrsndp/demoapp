package org.assignment.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

import java.util.Objects;

@CucumberOptions(
        features = "src/test/java/org/assignment/features",
        glue = "org.assignment.stepdefinitions",
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", //Extent report adapter- plugin
                "org.assignment.listeners.RunnerLifecycleHandler"}, //Custom listener - cucumber plugin
        tags = "@Smoke"

)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }


}
