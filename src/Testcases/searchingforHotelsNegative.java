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
public class searchingforHotelsNegative {

    /**
     ********AmrAhmed-162697********
     */
    public void SearchingforHotelsNegative() {
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

        //Clicking on search button
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div[1]/div[4]/div[2]/button")).click();

        //Check Error Msg is displayed or not
        if (driver.findElement(By.xpath("//*[@id=\"destination__error\"]/div")).isDisplayed()) {
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
