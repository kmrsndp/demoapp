package org.assignment.pages;

import org.openqa.selenium.WebDriver;

public class SauceDemo {


    public WebDriver driver;

    public SauceDemo(WebDriver driver){
        this.driver = driver;
    }
    public void visitLoginPage(){

        driver.get("https://www.saucedemo.com/");

    }

}





























/*
issue:
Starting ChromeDriver 119.0.6045.105 (38c72552c5e15ba9b3117c0967a0fd105072d7c6-refs/branch-heads/6045@{#1103}) on port 59687
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
Nov 14, 2023 8:07:09 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected upstream dialect: W3C
Nov 14, 2023 8:07:09 PM org.openqa.selenium.remote.http.WebSocket$Listener onError
WARNING: Invalid Status code=403 text=Forbidden
java.io.IOException: Invalid Status code=403 text=Forbidden
	at org.asynchttpclient.netty.handler.WebSocketHandler.abort(WebSocketHandler.java:92)

issue url: https://github.com/SeleniumHQ/selenium/issues/11750

https://stackoverflow.com/questions/75678572/java-io-ioexception-invalid-status-code-403-text-forbidden


 */