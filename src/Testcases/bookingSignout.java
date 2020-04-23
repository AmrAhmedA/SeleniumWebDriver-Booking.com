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
public class bookingSignout {

    /**
     ********AmrAhmed-162697********
     */

    public void BookingSignout() throws InterruptedException {
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

        //Click on Math Calculators
        driver.findElement(By.xpath("/html/body/div[1]/div/div/ul/li[6]/a/div")).click();

        //Click on username 
        driver.findElement(By.id("username")).click();

        //Set input to geek3mr@gmail.com
        driver.findElement(By.id("username")).sendKeys("geek3mr@gmail.com");

        //Click on Signin button
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[2]/div/div/div/form/div[3]/button/span")).click();

        //Set input password 454565@amrahmed
        driver.findElement(By.id("password")).sendKeys("454565@amrahmed");

        //Click on Signin button
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[2]/div/div/div/form/button/span")).click();

        String result = driver.findElement(By.xpath("/html/body/div[1]/div/div/ul/li[6]/a/span[3]/span/span[1]")).getText();

        if (result.equals("Amr")) {
            System.out.println("Test case passed successfully ");
        } else {
            System.out.println("Test case did not pass");
            System.out.println(result);
        }

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

        //Waiting for 6 seconds before exiting the console
        Thread.sleep(6000);

        System.out.println("This code was implemented by Amr Ahmed Abd El Rahman - 162697");

        //Closing Streams
        driver.close();
        driver.quit();
    }

    /**
     ********AmrAhmed-162697********
     */
}
