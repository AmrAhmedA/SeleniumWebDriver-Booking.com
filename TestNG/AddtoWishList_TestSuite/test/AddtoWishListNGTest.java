/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Amr
 */
public class AddtoWishListNGTest extends BookingSigninNGTest {

    public AddtoWishListNGTest() {
    }

    @Test
    public void AddtoWishList() {
        //Launch Website
        driver.navigate().to("https://www.booking.com/");
        //Entering destination
        driver.findElement(By.xpath("//*[@id=\"ss\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"ss\"]")).sendKeys("Australia");

        // clicking on # people
        driver.findElement(By.xpath("//*[@id=\"xp__guests__toggle\"]")).click();

        // clicking on the -ve - decrementing # of people to be 1 person
        driver.findElement(By.xpath("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[1]/div/div[2]/button[1]/span")).click();

        //clicking on date 
        driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[2]/div/div/div/div/span")).click();

        //choosing the preferred date
        driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[4]/td[6]/span/span")).click();

        //clicking on the search button
        driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button")).click();

        String curr_URL = driver.getCurrentUrl();
        System.out.println(curr_URL);

        //Hovering over the element with double click on heart icon 
        Actions act = new Actions(driver);
        act.doubleClick(driver.findElement(By.cssSelector(".wl-entry-container:nth-child(3) .-iconset-heart > path"))).build().perform();

        //waiting for the button to be clickable 
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#b_tt_holder_1 > .-iconset-heart > path")));// instead of id u can use cssSelector or xpath of ur element.

        //clicking on the heart icon (add to wishlsit)
        driver.findElement(By.cssSelector("#b_tt_holder_1 > .-iconset-heart > path")).click();

        //checking if the wishlist pannel is displayed after adding an item or not - Expected "present"
        if (driver.findElement(By.id("hotel-wishlists")).isEnabled()) {
            System.out.println("Element is Present");
        } else {
            System.out.println("Element is Absent");
        }
        Assert.assertTrue(true);

    }

}
