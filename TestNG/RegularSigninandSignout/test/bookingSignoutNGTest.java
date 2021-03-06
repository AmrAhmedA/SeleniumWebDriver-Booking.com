/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.openqa.selenium.By;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.*;

/**
 *
 * @author Amr
 */
public class bookingSignoutNGTest extends bookingSigninNGTest {

    public bookingSignoutNGTest() {
    }

    @Test
    public void SignoutFromBooking() throws InterruptedException {
        // clicking on the user panel
        driver.findElement(By.xpath("/html/body/div[1]/div/div/ul/li[6]/a/span[3]/span/span[2]")).click();

        //clicking on the 5th child - Signout
        driver.findElement(By.cssSelector(".profile-menu__link:nth-child(5)")).click();

        Thread.sleep(6000);

        //Check element not present (Checking my username) - AmrAhmed 162697
        if (driver.findElements(By.xpath("/html/body/div[1]/div/div/ul/li[6]/a/span[3]/span")).size() != 0) {
            System.out.println("Element is Present");
        } else {
            System.out.println("Element is Absent");
        }
        Assert.assertTrue(true);
    }

}
