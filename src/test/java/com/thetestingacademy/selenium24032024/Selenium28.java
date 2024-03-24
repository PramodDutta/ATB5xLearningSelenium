package com.thetestingacademy.selenium24032024;

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

public class Selenium28 {

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
        String URL = "https://awesomeqa.com/webtable1.html";
        driver.get(URL);
        driver.manage().window().maximize();


        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));
        List<WebElement> rows_table = table.findElements(By.tagName("tr"));
        System.out.println(rows_table.size());


        for (int i = 0; i < rows_table.size(); i++) {
            List<WebElement> col = rows_table.get(i).findElements(By.tagName("td"));

            for (WebElement e: col){
                System.out.println(e.getText());
            }
        }











    }























    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
