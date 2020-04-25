/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Amr
 */
public class searchingforHotelsNGTest extends searchingforHotelsNegativeNGTest {

    public searchingforHotelsNGTest() {
    }

    @Test(priority = 1)
    public void SearchingForHotelPositive() throws InterruptedException {

        //waiting for 6 seconds
        Thread.sleep(6000);
        //Entering destination
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

        //Checking visibility of the header - Explore the top cities in Australia
        if (driver.findElements(By.xpath("//*[@id=\"right\"]/div[5]/div/div[1]/div/h1")).size() != 0) {
            System.out.println("Element is Present");
        } else {
            System.out.println("Element is Absent");
        }
        //waiting for 6 seconds
        Thread.sleep(6000);

    }

}
