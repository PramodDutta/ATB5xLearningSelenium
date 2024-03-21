package com.thetestingacademy.selenium17032024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium16 {
    @Test(groups = "QA")
    @Description("Verify the current URl, title of VWO app")
    public void testVWOLogin16() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        // <button
        //  $random Make Appointment
        //  </button> - xpath -> functions
        WebElement btnElement_ID = driver.findElement(By.xpath("btn-make-appointment"));
        btnElement_ID.click();
        // Wait for 2 Seconds
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/profile.php#login");


        WebElement username_element = driver.findElement(By.id("txt-username"));
        username_element.sendKeys("John Doe");

        WebElement password_element = driver.findElement(By.xpath("//input[@id='txt-password']"));
        password_element.sendKeys("ThisIsNotAPassword");

        driver.findElement(By.id("btn-login")).click();


        driver.quit();


    }
}
