/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.*;

/**
 *
 * @author Amr
 */
public class bookingSigninNGTest extends openURLNGTest{

    public bookingSigninNGTest() {
    }

    

    @BeforeTest
    public void Signin() throws InterruptedException {

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

        String Expected = driver.findElement(By.xpath("/html/body/div[1]/div/div/ul/li[6]/a/span[3]/span/span[1]")).getText();

        String Actual = "Amr" ;
        if (Expected.equals(Actual)) {
            System.out.println("Test case passed successfully ");
        } else {
            System.out.println("Test case did not pass");
            System.out.println(Expected);
        }

        //Waiting for 6 seconds before exiting the console
        Thread.sleep(6000);

        System.out.println("This code was implemented by Amr Ahmed Abd El Rahman - 162697");

        Assert.assertEquals(Expected,Actual);
    }
}
