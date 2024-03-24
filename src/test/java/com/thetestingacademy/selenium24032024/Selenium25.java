package com.thetestingacademy.selenium24032024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.testng.Assert;

import java.time.Duration;

public class Selenium25 {

    // Atomic Test Cases
    // TC who don't have any dep.
    // They serve single purpose 0


    EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }





    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testPositive() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        // //button[text()="Click for JS Alert"]
        // //button[@onclick='jsAlert()']

        //WebElement element = driver.findElement(By.cssSelector("button[onclick=\"jsAlert()\"]"));
        // WebElement elementConfirm = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
        WebElement elementPrompt= driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
        //element.click();
//        elementConfirm.click();
        elementPrompt.click();

        // AWS, Machine, Docker, Alert will load very slow - limited RAM
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());


        Alert alert = driver.switchTo().alert();
        alert.sendKeys("PRAMOD");
        alert.accept();
        //alert.dismiss();

        String result = driver.findElement(By.id("result")).getText();
//        Assert.assertEquals(result,"You successfully clicked an alert");
//        Assert.assertEquals(result,"You clicked: Ok");
        Assert.assertEquals(result,"You entered: PRAMOD");













    }























    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
