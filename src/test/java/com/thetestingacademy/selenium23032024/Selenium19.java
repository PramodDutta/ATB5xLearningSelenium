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

public class Selenium19 {

    // Atomic Test Cases
    // TC who don't have any dep.
    // They serve single purpose 0


    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(options);
    }


    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testPositive() throws InterruptedException {
        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");
        driver.manage().window().maximize();
        //input[@id='gh-ac']
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        searchBox.sendKeys("macmini");
        WebElement searchBoxButton = driver.findElement(By.cssSelector("input[value='Search']"));
        searchBoxButton.click();

        // Wait
        Thread.sleep(3000); // We will  replace this in the future.
        List<WebElement> searchedTitles = driver.findElements(By.className("s-item__title"));
        int i = 0;
        for (WebElement title : searchedTitles) {
            System.out.println(i + " -> " + title.getText());
            if (i == 10) {
                title.click();
            }
            i++;
        }


    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
