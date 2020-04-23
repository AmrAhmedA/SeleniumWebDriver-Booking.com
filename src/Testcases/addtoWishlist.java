/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Amr
 */
public class addtoWishlist {

    /**
     ********AmrAhmed-162697********
     */

    public void AddtoWishlist() throws InterruptedException {

        // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amr\\Desktop\\chromedriver.exe");

        // Instantiate a ChromeDriver class to establish a connection       
        WebDriver driver = new ChromeDriver();

        //Puts an implicit wait, will wait for 10 seconds before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Launch Website
        driver.navigate().to("https://www.booking.com/");

        //Maximize the Browser
        driver.manage().window().maximize();

        //Entering destination
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div[1]/div[1]/div[1]/div[1]/label/input")).sendKeys("Australia");

        // clicking on # people
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div[1]/div[3]/label")).click();

        // clicking on the -ve - decrementing # of people to be 1 person
        driver.findElement(By.xpath("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[1]/div/div[2]/button[1]")).click();

        //clicking on checkin date 
        driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[2]/div/div/div/div")).click();

        //
        driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[3]/td[5]")).click();

        //clicking on the search button
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div[1]/div[4]/div[2]/button")).click();

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

        //Closing Streams
        driver.close();
        driver.quit();
    }

    /**
     ********AmrAhmed-162697********
     */
}
