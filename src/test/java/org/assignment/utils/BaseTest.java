package org.assignment.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    private WebDriver driver;
    Properties prop = new Properties();

    public WebDriver webDriverManager() {
        if (driver == null) {
            loadProperties();
            initializeDriver();
        }
        return driver;
    }

    private void loadProperties() {
        try (FileInputStream fis = new FileInputStream("src/test/resources/global.properties")) {
            prop.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void initializeDriver() {
        String browser = prop.getProperty("browser");
        String url = prop.getProperty("qa_url");

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/java/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.get(url);
        } else if (browser.equalsIgnoreCase("edge")) {
            // System.setProperty("webdriver.edge.driver", "src/test/java/chromedriver.exe");
        }
    }
}
