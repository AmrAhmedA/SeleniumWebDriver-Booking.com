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
public class searchingforFlights {
        /**
     ********AmrAhmed-162697********
     */

    public void SearchforFlightsNegative() {
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

        // Clicking on the flights section
        driver.findElement(By.xpath("//*[@id=\"cross-product-bar\"]/div/a[1]")).click();

        // Clicking on the search button with empty input
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[1]/div/div/div[1]/div/div[2]/section[2]/div/div/div[2]/form[1]/div[1]/div/div[2]/button")).click();

        //Error content is displayed - checking if it is enabled or not 
        if (driver.findElement(By.cssSelector(".errorContent")).isEnabled()) {
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
