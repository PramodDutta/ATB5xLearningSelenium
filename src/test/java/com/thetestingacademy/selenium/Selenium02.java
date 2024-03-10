package com.thetestingacademy.selenium;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Selenium02 {

    @Test
    public void testMethod(){
        //Import Concept of OOPs ->

        // interface interfaceRef = new Class();
        //  1. Inheritance
        //  2. - Upcasting -> Dynamic Dispatch

        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        // Max -> Selenium 4

//        WebDriver driver = new EdgeDriver();
//        WebDriver driver2 = new ChromeDriver();
//        WebDriver driver3 = new FirefoxDriver();
//        WebDriver driver4 = new InternetExplorerDriver();
//        WebDriver driver5 = new SafariDriver();

        // Opera - Selenium 4- Removed!


//        SearchContext(I) (2) -> WebDriver(I)( 10) -> RemoteWebDriver(C) (15) -> ChromiumDriver(C) 25 -> EdgeDriver(C) (45)
//        SearchContext(I) -> WebDriver(I) -> RemoteWebDriver(C) -> ChromiumDriver(C) -> ChromeDriver(C)

        // SearchContext - Interface - findElement, and findElements - GGF
        // WebDriver - Interface - some incomplete functions - GF
        // RemoteWebDriver - Class- It also has some functions - F
        // ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver  Class - S


        // Selenium - Arch - API
        // Create Session, Commands or Functions -> API Request to Browser Driver (
        // Pass the commands as API

        // SearchContext driver = new ChromeDriver(); // Dynamic Dispatch - GF, F, can Ref to Child Object -- OOPs
        //WebDriver driver = new ChromeDriver();
        // RemoteWebDriver driver1 = new ChromeDriver();

        //EdgeDriver driver = new EdgeDriver();  // Case 1
        WebDriver driver1 = new EdgeDriver(); // Case 2
        driver1 = new ChromeDriver();
        // Interview Why we use Case 2 , not the 1
        // If use the Line 51 - EdgeDriver driver = new EdgeDriver();
        // You will not be able to reuse the driver instance or ref
        // So it means, You can't change the browser in the script.


        // Scenarios

        // 1. Do want to run on  Chrome or Edge?
        //ChromeDriver driver = new ChromeDriver();


        // 2  Do you want to run on Chrome then change to Edge ?
        // WebDriver driver = new ChromeDriver();
        // driver = new EdgeDriver();


        // 3. do you want to run on multiple browsers?
        // RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)





    }
}
