package com.thetestingacademy.selenium;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium10 {


        // Open app.vwo.com
        // Print the title and get the Current URL
        // VerIfy the Current URL is app.vwo.com


    @Test(groups = "QA")
    @Description("Verfiy the current URl, title of VWO app")
    public void testVWOLogin(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
    }







}
