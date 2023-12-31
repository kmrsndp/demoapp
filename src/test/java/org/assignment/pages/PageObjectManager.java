package org.assignment.pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private SauceDemo sauceDemo;
    private ProductPage productPage;
    public WebDriver driver;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public SauceDemo getSauceDemo(){
        return sauceDemo = new SauceDemo(driver);
    }

    public ProductPage getproductPage(){
        return productPage = new ProductPage(driver);
    }
}
