/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class subscribeBookingNegative {

    /**
     ********AmrAhmed-162697********
     */
    public void SubscribeToBookingNegative() throws InterruptedException {

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

        //simple js code scrolling 1500 dpi
        js.executeScript("scrollBy(0,1500)");

        //Entering invalid email address
        driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[2]/div[5]/div/div/div/div[2]/div[2]/form/div/input")).sendKeys("123@123");

        //clicking on the subscribe button
        driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[2]/div[5]/div/div/div/div[2]/div[2]/form/div/button/span")).click();

        //Check Element not present, after subscribing to booking services (Invalid Email Address)
        if (driver.findElement(By.xpath("//*[@id=\"emk_banner_index\"]/div[2]/div[2]/form/p[1]")).isDisplayed()) {
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
