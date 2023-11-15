package org.assignment.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assignment.pages.PageObjectManager;
import org.assignment.pages.SauceDemo;
import org.assignment.utils.ContextSetup;
import org.testng.Assert;

public class AppTestSteps {

    public ContextSetup context;
    public SauceDemo sauceDemo;

    public AppTestSteps(ContextSetup contextSetup){
        this.context = contextSetup;
        this.sauceDemo = context.pageObjectManager.getSauceDemo();
    }

    @Given("user is on the application login page")
    public void userIsOnTheApplicationLoginPage() {

        sauceDemo.visitLoginPage();
//        Assert.fail();
    }

    @When("user enters {string} and {string}")
    public void userEntersAnd(String userName, String password) {
    }

    @And("clicks on submit")
    public void clicksOnSubmit() {
    }

    @Then("user should be able to log in")
    public void userShouldBeAbleToLogIn() {
    }

    @And("user should be redirected to homepage")
    public void userShouldBeRedirectedToHomepage() {
    }



}
