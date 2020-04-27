/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removefromwishlist_testsuite;

import org.openqa.selenium.By;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

/**
 *
 * @author Amr
 */
public class BookingSignoutNGTest extends RemoveFromWishListNGTest{
    
    public BookingSignoutNGTest() {
    }

  @AfterTest
    public void TestingSignout() throws InterruptedException {
        //Launch Website
        driver.navigate().to("https://www.booking.com/");
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
