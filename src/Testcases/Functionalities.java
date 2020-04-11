/** *****************************
 *******************************
 ********AmrAhmed-162697********
 *******************************
 ****************************** */
package Testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Amr
 */
public class Functionalities {

    public void BookingSignin() throws InterruptedException {
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

        //simple js code scrolling 1500 dpi
        js.executeScript("scrollBy(0,1500)");

        //writing email in the textfield 
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div[3]/div[5]/div/div/div/div[2]/div[2]/form/div/input")).sendKeys("AmrAhmed@gmail.com");

        //clicking on the subscribe button
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div[3]/div[5]/div/div/div/div[2]/div[2]/form/div/button/span")).click();

        //Check Element not present, after subscribing to booking services
        if (driver.findElements(By.xpath("/html/body/div[5]/div/div/div[2]/div[2]/div[6]/div")).isEmpty()) {
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
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div[3]/div[5]/div/div/div/div[2]/div[2]/form/div/input")).sendKeys("123@123");

        //clicking on the subscribe button
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div[3]/div[5]/div/div/div/div[2]/div[2]/form/div/button/span")).click();

        //Check Element not present, after subscribing to booking services
        if (driver.findElement(By.xpath("//*[@id=\"emk_banner_index\"]/div[2]/div[2]/form/p[1]")).isDisplayed()) {
            System.out.println("Element is Present");
        } else {
            System.out.println("Element is Absent");
        }
        

        //Closing Streams
        driver.close();
        driver.quit();
    }
}
