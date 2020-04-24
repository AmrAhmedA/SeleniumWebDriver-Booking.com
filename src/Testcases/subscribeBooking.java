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
public class subscribeBooking {

    /**
     ********AmrAhmed-162697********
     */
    public void SubscribeToBooking() throws InterruptedException {

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

        //Type Casting driver to scroll inside the page for the Subscribe Element
        JavascriptExecutor js = (JavascriptExecutor) driver;

//        //simple js code scrolling 1500 dpi
//        js.executeScript("scrollBy(0,1500)");
        //simple js code scrolling 1500 dpi
        js.executeScript("scrollBy(0,700)");

        //writing email in the textfield 
        driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[2]/div[5]/div/div/div/div[2]/div[2]/form/div/input")).sendKeys("AmrAhmed@gmail.com");

//        //clicking on the subscribe button
//        driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div[3]/div[5]/div/div/div/div[2]/div[2]/form/div/button/span")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[2]/div[5]/div/div/div/div[2]/div[2]/form/div/button/span")).click();

        //Check Element not present, after subscribing to booking services
        if (driver.findElements(By.xpath("/html/body/div[6]/div/div[1]/div[2]/div[5]/div/div/div")).isEmpty()) {
            System.out.println("Element is Absent");
        } else {
            System.out.println("Element is Present");
        }

        //waiting for 6 seconds
        Thread.sleep(6000);

        //Closing Streams
        driver.close();
        driver.quit();
    }
}
