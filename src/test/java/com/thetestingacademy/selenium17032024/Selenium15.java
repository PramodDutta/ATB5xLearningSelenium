package com.thetestingacademy.selenium17032024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
public class Selenium15 {
    @Test(groups = "QA")
    @Description("Verify the current URl, title of VWO app")
    public void testVWOLogin15() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        // <a


        // href="./profile.php#login"


        // Make Appointment

        // </a>
        WebElement btnElement_ID = driver.findElement(By.id("btn-make-appointment"));
//        WebElement btnElement_CN = driver.findElement(By.className("btn.btn-dark.btn-lg"));
//        WebElement btnElement_PTEXT = driver.findElement(By.partialLinkText("Make"));
//        WebElement btnElement_LTEXT = driver.findElement(By.partialLinkText("Make Appointment"));
//        WebElement btnElement_AT = driver.findElement(By.xpath("//a[@href='./profile.php#login']"));
//       Not RECOM WebElement btnElement_TagName = driver.findElement(By.tagName("a")); // Multiple a tag  - not recommen

        // ASSERT THE CURRENT url - https://katalon-demo-cura.herokuapp.com/profile.php#login

        btnElement_ID.click();
        // Wait for 2 Seconds
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");

        //<input

        // type="text" - NR
        // class="form-control" - NR
        // id="txt-username" - R
        // name="username" - r
        // placeholder="Username" - R
        // value="" NR
        // autocomplete="off" - NR

        // >

        List<WebElement> username_element = driver.findElements(By.xpath("//input[@placeholder='Password']"));
        username_element.get(1).sendKeys("John Doe");

        WebElement password_element = driver.findElement(By.xpath("//input[@id='txt-password']"));
        password_element.sendKeys("ThisIsNotAPassword");

        driver.findElement(By.id("btn-login")).click();


        driver.quit();





    }
}
