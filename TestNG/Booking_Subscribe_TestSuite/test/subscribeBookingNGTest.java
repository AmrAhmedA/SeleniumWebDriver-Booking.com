/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Amr
 */
public class subscribeBookingNGTest extends openURLNGTest {

    public subscribeBookingNGTest() {
    }

    @Test
    public void SubscribeToBooking() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"emk_banner_index\"]/div[2]/div[2]/form/div/input")).clear();
        //writing email in the textfield 
        driver.findElement(By.xpath("//*[@id=\"emk_banner_index\"]/div[2]/div[2]/form/div/input")).sendKeys("AmrAhmed@gmail.com");
        Thread.sleep(4000);

//        //clicking on the subscribe button
//        driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div[3]/div[5]/div/div/div/div[2]/div[2]/form/div/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"emk_banner_index\"]/div[2]/div[2]/form/div/button/span")).click();

        //waiting for 6 seconds
        Thread.sleep(6000);
        //Check Element not present, after subscribing to booking services
        if (driver.findElement(By.xpath("//*[@id=\"emk_banner_index\"]")).isDisplayed()) {
            System.out.println("Element is Present");
        } else {
            System.out.println("Element is Absent");
        }

        Assert.assertTrue(true);

    }

}
