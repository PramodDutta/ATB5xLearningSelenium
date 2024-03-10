package com.thetestingacademy.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium01 {

    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");
        driver.quit();

        /* Selenium Flow
        * 1. Create Session, ID - q09876q789e8wq89we87
        * 2. Session -> Run the commands - GET -> GET Method w3c Protocol
        * 3. EdgeDriver (Server) -> Tell the Edge Browser
        * 4. Open a Fresh copy of thre Edge Browser and Open the URL - https//sdet.live
        * 5. Driver - Command (POST) Request - Shutdown the browser.
        * */



    }

}
