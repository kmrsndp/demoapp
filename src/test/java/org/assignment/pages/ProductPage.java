package org.assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductPage extends BasePage{
    public WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    private final Logger log = LoggerFactory.getLogger(ProductPage.class);

    @FindBy(xpath = "//span[text() = 'Products']")
    private WebElement productsPageHeading;

    public String getProductsPageHeading() {
        return productsPageHeading.getText();
    }
}
