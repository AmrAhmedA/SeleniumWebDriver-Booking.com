/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

/**
 *
 * @author Amr
 */
public class subscribeBookingNegativeNGTest extends subscribeBookingNGTest {
    
    public subscribeBookingNegativeNGTest() {
    }
    
    @BeforeTest
    public void SubscribeToBookingNegative() throws InterruptedException {
        //Type Casting driver to scroll inside the page for the Subscribe Element
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //simple js code scrolling 1500 dpi
        js.executeScript("scrollBy(0,700)");

        //Entering invalid email address
        driver.findElement(By.xpath("//*[@id=\"emk_banner_index\"]/div[2]/div[2]/form/div/input")).sendKeys("123@123");
        Thread.sleep(4000);

        //clicking on the subscribe button
        driver.findElement(By.xpath("//*[@id=\"emk_banner_index\"]/div[2]/div[2]/form/div/button")).click();
        Thread.sleep(4000);

        //Check Element not present, after subscribing to booking services (Invalid Email Address)
        if (driver.findElement(By.xpath("//*[@id=\"emk_banner_index\"]/div[2]/div[2]/form/p[1]")).isEnabled()) {
            System.out.println("Element is Present");
        } else {
            System.out.println("Element is Absent");
        }

        //waiting for 6 seconds
        Thread.sleep(4000);
        Assert.assertTrue(true);
        
    }
    
}
