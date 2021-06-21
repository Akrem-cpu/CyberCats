package com.vtrack.test.sprint0.positivetest_ts1;


import com.vtrack.test.useablemethods.pages.MainPage;
import com.vtrack.test.useablemethods.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TS1_01 {
    WebDriver driver = WebDriverFactory.getDriver("Chrome");

    @AfterClass
    public void finishSetUp(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement dropDown = driver.findElement(By.cssSelector("i[class='fa-caret-down']"));
        dropDown.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement loginOut = driver.findElement(By.xpath("//a[@class='no-hash']"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginOut.click();

       driver.close();

   }


    // Driver setup
    @BeforeClass
    public void setUp() {
        driver.get("https://qa3.vytrack.com/");
        System.out.println(driver.getTitle());


    }

    //TS 1 - Truck driver logs in successfully with valid credentials
    //Step 1 - Go to Vytrack login page
    @Test
    public void test1() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String expectedTitle = "Login";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    // Step 2 - Enter correct user name for truck driver
    //  Step 4 - Click login button
    //Step 4 - Click login button

    @Test
    public void test2() throws IOException {
        /*MainPage.LoginToAVTrackDriverAccount(driver);*/
    }




    @Test()
  //  Step 5 - Truck driver should see first and last name on top right corner
    public void test5(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement userFirstNameAndLastName = driver.findElement(By.xpath("(//*[@id=\"user-menu\"]/a"));
        String userName = userFirstNameAndLastName.getText();
        System.out.println(userName + "user name is here ");

        Assert.assertTrue(userName.contains("Toney"));

    }




}
