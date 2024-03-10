package com.thetestingacademy;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestCase02 {

    @Test
    @Description("Verify title of the TheTestingAcademy Website.")
    public void vwoLogin(){

        // Selenium - Arch
        // Write the code - Client - Java, Python, Ruby, Perl, Php

        WebDriver driver = new EdgeDriver();
        // WebDriver driver2 = new ChromeDriver();
        // 1. Create Session -> Box -> Connect with Browser via the HTTP Methods
        // 2. Session ID - 16 alpha digit - q9w8e78q9w8e78w9
        // 3. driver -> ref - functions -> driver.get() -> HTTP Command -> open a URL ("")
        // 4. driver.command() -> API (GET, POST, PATCH) -> webdriver w3c document)
        // 5. Flow / Arch of Selenium 4
        // Code ( java, python, ruby, c#) ->
        // w3c( protocolo(in built in browsers) -> ( in 3.x) -> JSON Wire protocol(APIs) which are not inbuilt in browsers)
        // Servers(ChromeDrivers) ->
        // Chrome Browser, Edge, Browser, IEBrowser)

        driver.get("https://thetestingacademy.com");
        System.out.println(driver.getTitle());

    }
}
