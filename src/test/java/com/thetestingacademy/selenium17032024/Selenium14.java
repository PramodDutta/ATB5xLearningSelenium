package com.thetestingacademy.selenium17032024;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium14 {
    @Test(groups = "QA")
    @Description("Verify the current URl, title of VWO app")
    public void testVWOLogin13() {
        WebDriver driver = new EdgeDriver();
        // 1. Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
        driver.get("https://app.vwo.com");
    }
}
