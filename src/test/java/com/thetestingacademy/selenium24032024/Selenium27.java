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

public class Selenium27 {

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
        String URL = "https://awesomeqa.com/webtable.html";
        driver.get(URL);
        driver.manage().window().maximize();
        //
        // table[@id="customers"]/tbody/tr[5]/td[2] - Halen bennet
        // /following-sibling::td - Country


        // Print all the data in the table and if name Halen = country she belongs too


        // xpath ->  //table[@id="customers"]/tbody/tr[5]/td[2]

        //xpath - //table[@id="customers"]/tbody/tr[
        // i
        // ]/td[
        // j
        // ]

        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";


        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

        for(int i=2; i<= row;i++){
            for (int j = 1; j <= col; j++) {
                String dynamic_xpath = first_part+i+second_part+j+third_part;
                String data = driver.findElement(By.xpath(dynamic_xpath)).getText();
                System.out.println(data);
                if(data.contains("Helen Bennett")){

                    String country_path = dynamic_xpath+"/following-sibling::td";
                    String country_text = driver.findElement(By.xpath(country_path)).getText();
                    System.out.println("------");
                    System.out.println("Helen Bennett is In - " + country_text);

                }


            }
        }














    }























    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
