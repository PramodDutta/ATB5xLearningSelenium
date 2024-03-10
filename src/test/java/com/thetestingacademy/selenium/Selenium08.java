package com.thetestingacademy.selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class Selenium08 {

    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver(); // Dynamic Dispatch -> Runtime Poly
        driver.get("https://sdet.live");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


//        driver.close(); // Close the Current Browser Window - not the full browser
//        // Closed the window, Session id != null, Error - Invalid session Id
//

      driver.quit();
      // Close all the /sessions/windows and stop the browser
//        driver.quit(); // Closed All the window and Session = null, Error - Session ID is null



    }
}
