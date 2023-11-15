package org.assignment.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    public WebDriver driver;

    public WebDriver webDriverManager() {

        FileInputStream fis;
        Properties prop = new Properties();
        try {
            fis = new FileInputStream("src/test/resources/global.properties");
            prop.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String url = prop.getProperty("qa_url");

        if (driver == null) {

            if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver", "src/test/java/chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
                driver.get(url);
            }else if (prop.getProperty("browser").equals("edge")){
//                System.setProperty("webdriver.edge.driver", "src/test/java/chromedriver.exe");
            }

        }

        return driver;
    }
}
