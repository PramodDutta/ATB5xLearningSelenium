package com.thetestingacademy.selenium23032024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium20 {

    // Atomic Test Cases
    // TC who don't have any dep.
    // They serve single purpose 0


    EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(options);
    }





    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testPositive() throws InterruptedException {
        driver.get("https://wf-ecomm-pwa-git-feat-enhanced-search-wellness-forever.vercel.app/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Use Current Location')]"));
        element.click();
        Thread.sleep(5000);
        // Waits




    }























    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
