package com.thetestingacademy.selenium;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium05 {

    public static void main(String[] args) {


        EdgeOptions edgeOptions = new EdgeOptions();
        /*
        * 1. headless
        * 2. start max
        * 3. window
        * 4. add exnetions
        * 5. 100 of another options - you can use with it
        *
        * */

        //edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--window-size=800,600");
        //edgeOptions.addArguments("--incognito");
        EdgeDriver driver = new EdgeDriver(edgeOptions); // Dynamic Dispatch -> Runtime Poly
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());


        //driver.manage().window().maximize();

        driver.quit();



    }
}
