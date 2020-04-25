/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.openqa.selenium.By;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Amr
 */
public class searchingforHotelsNegativeNGTest extends openURLNGTest {

    public searchingforHotelsNegativeNGTest() {

    }

    @Test(priority = 0)
    public void SearchforHotelsNegative() throws InterruptedException {
        //Clicking on search button
        driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button")).click();

        //Check Error Msg is displayed or not
        if (driver.findElement(By.xpath("//*[@id=\"destination__error\"]/div")).isDisplayed()) {
            System.out.println("Element is Present");
        } else {
            System.out.println("Element is Absent");
        }
        //waiting for 6 seconds
        Thread.sleep(6000);
    }

}
