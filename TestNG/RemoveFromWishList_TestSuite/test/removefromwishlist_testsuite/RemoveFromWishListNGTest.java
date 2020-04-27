/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removefromwishlist_testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Amr
 */
public class RemoveFromWishListNGTest extends bookingSigninNGTest {

    public RemoveFromWishListNGTest() {
    }

    @Test
    public void RemovefromList() {
        //Launch Website
        driver.navigate().to("https://www.booking.com/");
        // clicking on the user panel
        driver.findElement(By.xpath("/html/body/div[1]/div/div/ul/li[6]/a/span[3]/span/span[2]")).click();

        driver.findElement(By.xpath("//*[@id=\"profile-menu\"]/div[6]")).click();

        //Hovering over the element with double click on heart icon 
        Actions act = new Actions(driver);
        act.doubleClick(driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[1]/div[1]/div[2]/div[1]/ul/li/div/a"))).build().perform();

        driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[1]/div[1]/div[2]/div[1]/ul/li/div/a")).click();

    }

}
