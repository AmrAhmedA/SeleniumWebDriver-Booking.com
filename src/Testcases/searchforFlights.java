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
public class searchforFlights {

    /**
     ********AmrAhmed-162697********
     */
    public void SearchforFlights() throws InterruptedException {
        // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amr\\Desktop\\chromedriver.exe");

        //for some reason related to Selenium IDE, this test case didn't run successfully at Selenium 
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

        // clicking on trip type to choose one way
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[1]/div/div/div[1]/div/div[2]/section[2]/div/div/div[1]/div[1]/div/div/div/div")).click();

        // clicking on the one way trip
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/ul/li[2]")).click();

        // Clicking on the depart section
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[1]/div/div/div[1]/div/div[2]/section[2]/div/div/div[2]/form[1]/div[1]/div/div[1]/div/div[4]/div/div[1]/div")).click();

        // Clicking on the required date 
        driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/div[4]/div[2]/div[2]/div/div[3]/div/div[3]/div[1]/div[3]/div[4]/div[4]/div")).click();

        //Hovering over the element with double click on heart icon 
        Actions act = new Actions(driver);
        act.doubleClick(driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[1]/div[1]/input"))).build().perform();

        // Entering the destination
        driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[1]/div[1]/input")).click();
        // Entering the destination
        driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[1]/div[1]/input")).sendKeys("Australia");

        driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/ul/li[2]")).click();

        // Clicking on the search button
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[1]/div/div/div[1]/div/div[2]/section[2]/div/div/div[2]/form[1]/div[1]/div/div[2]/button")).click();

        // if successful search happened a list of flights will be displayed - checking if there exists elements in this list
        if (driver.findElements(By.xpath("/html/body/div[1]/div[1]/main/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[2]/div[1]/div/div[1]/div")).size() != 0) {
            System.out.println("Element is Present");
        } else {
            System.out.println("Element is Absent");
        }

        Thread.sleep(6000);

        //Closing Streams
        driver.close();
        driver.quit();
    }

}
