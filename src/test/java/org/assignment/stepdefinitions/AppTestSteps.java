package org.assignment.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assignment.pages.PageObjectManager;
import org.assignment.pages.ProductPage;
import org.assignment.pages.SauceDemo;
import org.assignment.utils.ContextSetup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class AppTestSteps {

    public ContextSetup context;
    public SauceDemo sauceDemo;
    public ProductPage productPage;

    private final Logger log = LoggerFactory.getLogger(AppTestSteps.class);

    public AppTestSteps(ContextSetup contextSetup){
        this.context = contextSetup;
        this.sauceDemo = context.pageObjectManager.getSauceDemo();
        this.productPage = context.pageObjectManager.getproductPage();
    }

    @Given("user is on the application login page")
    public void userIsOnTheApplicationLoginPage() {

        assertThat(sauceDemo.getLoginPageHeading(), is(equalTo("Swag Labs")));
        log.info("Login page heading: " + sauceDemo.getLoginPageHeading());
    }

    @When("user enters {string} and {string}")
    public void userEntersAnd(String username, String password) {
        sauceDemo.loginWithCredentials(username, password);
    }

    @And("clicks on submit")
    public void clicksOnSubmit() {
    }

    @Then("user should be able to log in")
    public void userShouldBeAbleToLogIn() {
    }

    @And("user should be redirected to homepage")
    public void userShouldBeRedirectedToHomepage() {
        assertThat(productPage.getProductsPageHeading(), is(equalTo("Products")));
        log.info("Products page heading: " + productPage.getProductsPageHeading());
    }



}
